package br.edu.qi.webserver.soap.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.dto.AnimalServiceDto;

@WebService(endpointInterface = "br.edu.qi.webserver.soap.service.IAnimalService")
public class AnimalService implements IAnimalService {
	
	public List<AnimalServiceDto> getAnimais() {

		// Parte 4 c)  Um Web service que retorne o nome social, tipo e nome dos animais

		// adotados. Retornar no formato adequado;

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		List<AnimalServiceDto> retorno = new ArrayList<>();

		for (Animal animal : animais) {
			Adocao adocao = animal.getAdocao();

			if (adocao != null) {

				AnimalServiceDto a = new AnimalServiceDto();
				a.setNomeSocial(adocao.getPessoa().getNomeSocial());
				a.setTipo(animal.getTipo());
				a.setNomeAnimal(animal.getNomeAdotivo());				
				retorno.add(a);
			}
		}
		return retorno;
	}
}
