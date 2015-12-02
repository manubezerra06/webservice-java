package br.edu.qi.webserver.rest.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.loader.Parser;
import br.edu.qi.loader.dto.AdocaoDto;
import br.edu.qi.loader.dto.RetornoDto;

@Path("/adocao")
public class AdotarAnimalService {

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public RetornoDto postAdocao(AdocaoDto adocaoDto) {

		Dao dao = new Dao();

		dao.beginTransaction();

		Adocao newAdocao = Parser.parseAdocao(dao, adocaoDto);

		dao.salvar(newAdocao);

		HashMap<String, Integer> tipos = new HashMap<>();

		for (Animal animal : newAdocao.getAnimais()) {

			if (animal.getAdocao() != null) {
				RetornoDto xmlModel = new RetornoDto();
				xmlModel.setError("animal " + animal.getCodigo() + " já está adotado.");
				return xmlModel;
			}

			String key = animal.getTipo();
			// tipos.merge(key, 1, (a,b) -> a+b); //lambda não funciona :(
			int count = tipos.getOrDefault(key, 0);
			count += 1;
			tipos.put(key, count);

			if (count > 2) {
				RetornoDto xmlModel = new RetornoDto();
				xmlModel.setError("só pode adotar 2 animais de um mesmo tipo");
				return xmlModel;
			}

			animal.setAdocao(newAdocao);
			dao.salvar(animal);
		}

		if (newAdocao.getInstituicao() == null) {
			RetornoDto xmlModel = new RetornoDto();
			xmlModel.setError("instituição não encontrada.");
			return xmlModel;
		}

		if (newAdocao.getPessoa() == null) {
			RetornoDto xmlModel = new RetornoDto();
			xmlModel.setError("pessoa não encontrada.");
			return xmlModel;
		}

		Date dataNascimento = newAdocao.getPessoa().getDataNascimento();

		if (getIdade(dataNascimento) > 16) {
			RetornoDto xmlModel = new RetornoDto();
			xmlModel.setError("a pessoa deve ter mais de 16 anos.");
			return xmlModel;
		}

		dao.commit();

		RetornoDto retorno = new RetornoDto();

		retorno.getAdocoes().add(adocaoDto);

		return retorno;
	}

	public static int getIdade(Date dataNascimento) {
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar bday = new GregorianCalendar();
		GregorianCalendar bdayThisYear = new GregorianCalendar();

		bday.setTime(dataNascimento);
		bdayThisYear.setTime(dataNascimento);
		bdayThisYear.set(Calendar.YEAR, today.get(Calendar.YEAR));

		int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);

		if (today.getTimeInMillis() < bdayThisYear.getTimeInMillis())
			age--;

		return age;
	}
}
