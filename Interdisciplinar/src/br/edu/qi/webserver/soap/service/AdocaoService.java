package br.edu.qi.webserver.soap.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.loader.Parser;
import br.edu.qi.loader.dto.AdocaoDto;
import br.edu.qi.loader.dto.XmlModel;

public class AdocaoService implements IAdocaoService {

	public XmlModel adotarAnimal(AdocaoDto adocaoDto) {

		/*
		 * Um Web service que adote um animal. Cadastrar a pessoa, caso ela não
		 * 
		 * seja cadastrada. Validar se a idade é superior a 16 anos para efetuar
		 * o
		 * 
		 * cadastro e consequentemente a adoção. Retornar uma mensagem
		 * 
		 * indicando o que aconteceu. Enviar os dados para o Web service
		 * 
		 * necessários para o cadastro .
		 */

		Dao dao = new Dao();

		dao.beginTransaction();

		Adocao newAdocao = Parser.parseAdocao(dao, adocaoDto);

		dao.salvar(newAdocao);

		HashMap<String, Integer> tipos = new HashMap<>();

		for (Animal animal : newAdocao.getAnimais()) {

			if (animal.getAdocao() != null) {
				XmlModel xmlModel = new XmlModel();
				xmlModel.setError("animal " + animal.getCodigo() + " já está adotado.");
				return xmlModel;
			}

			String key = animal.getTipo();
			// tipos.merge(key, 1, (a,b) -> a+b); //lambda não funciona :(
			int count = tipos.getOrDefault(key, 0);
			count += 1;
			tipos.put(key, count);

			if (count > 2) {
				XmlModel xmlModel = new XmlModel();
				xmlModel.setError("só pode adotar 2 animais de um mesmo tipo");
				return xmlModel;
			}

			animal.setAdocao(newAdocao);
			dao.salvar(animal);
		}

		if (newAdocao.getInstituicao() == null) {
			XmlModel xmlModel = new XmlModel();
			xmlModel.setError("instituição não encontrada.");
			return xmlModel;
		}

		if (newAdocao.getPessoa() == null) {
			XmlModel xmlModel = new XmlModel();
			xmlModel.setError("pessoa não encontrada.");
			return xmlModel;
		}

		Date dataNascimento = newAdocao.getPessoa().getDataNascimento();

		if (getIdade(dataNascimento) > 16) {
			XmlModel xmlModel = new XmlModel();
			xmlModel.setError("a pessoa deve ter mais de 16 anos.");
			return xmlModel;
		}

		dao.commit();

		XmlModel retorno = new XmlModel();

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
