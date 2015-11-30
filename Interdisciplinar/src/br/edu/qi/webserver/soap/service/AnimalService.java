package br.edu.qi.webserver.soap.service;

import java.util.List;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.loader.dto.AnimalDto;
import br.edu.qi.loader.dto.XmlModel;

public class AnimalService implements IAnimalService {

	
	
	public XmlModel getAnimais() {

		// Parte 4 c)  Um Web service que retorne o nome social, tipo e nome dos animais

		// adotados. Retornar no formato adequado;

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Adocao adocao = animal.getAdocao();

			if (adocao != null) {

				AnimalDto a = new AnimalDto();
				a.setDisponivelAdocao(animal.isDisponivelAdocao());
				a.setGenero(animal.getGenero());
				a.setIdade(animal.getIdade());
				a.setNomeAdotivo(animal.getNomeAdotivo());
				a.setTipo(animal.getTipo());
				retorno.getAnimais().add(a);
			}
		}
		return retorno;

	}

}