package br.edu.qi.webserver.rest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.loader.dto.AnimalDto;
import br.edu.qi.loader.dto.XmlModel;

@Path("/animais")
public class AnimalPorAdocaoService {

	@GET
	@Path("/adocao")
	@Produces(MediaType.APPLICATION_JSON)
	public XmlModel getNaoAdotados() {

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Adocao adocao = animal.getAdocao();

			if (adocao == null) {

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

	
	@GET
	@Path("/adocao/{tipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public XmlModel getNaoAdotados(@PathParam("tipo") String tipo) {

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Adocao adocao = animal.getAdocao();

			if (adocao == null) {

				if (animal.getTipo().equals(tipo)) {

					AnimalDto a = new AnimalDto();
					a.setDisponivelAdocao(animal.isDisponivelAdocao());
					a.setGenero(animal.getGenero());
					a.setIdade(animal.getIdade());
					a.setNomeAdotivo(animal.getNomeAdotivo());
					a.setTipo(animal.getTipo());
					retorno.getAnimais().add(a);
				}
			}
		}
		return retorno;
	}

}