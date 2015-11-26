package br.edu.qi.webserver.rest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.core.model.Anuncio;
import br.edu.qi.core.model.Instituicao;
import br.edu.qi.loader.dto.AnimalDto;
import br.edu.qi.loader.dto.XmlModel;

@Path("/animais")
public class AnimalService {

	@GET
	@Path("/instituicao/cnpj/{cnpj}")
	@Produces(MediaType.APPLICATION_XML)
	public XmlModel getPorInstituicaoCnpj(@PathParam("cnpj") String cnpj) {

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Anuncio anuncio = animal.getAnuncio();
			
			if (anuncio != null) {

				Instituicao i = anuncio.getInstituicao();

				if (i != null) {

					if (i.getCnpj().equals(cnpj)) {

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
		}

		return retorno;
	}

	@GET
	@Path("/instituicao/nome/{nome}")
	@Produces(MediaType.APPLICATION_XML)
	public XmlModel getPorInstituicaoNome(@PathParam("nome") String nome) {

		Dao dao = new Dao();

		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Anuncio anuncio = animal.getAnuncio();

			if (anuncio != null) {

				Instituicao i = anuncio.getInstituicao();

				if (i != null) {

					if (i.getNome().equals(nome)) {

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
		}

		return retorno;
	}

	@GET
	@Path("/nao-adotados")
	@Produces(MediaType.APPLICATION_XML)
	public XmlModel getAnimaisNaoAdotados() {

		Dao dao = new Dao();
		List<Animal> animais = dao.retornarTodos("Animal");

		XmlModel retorno = new XmlModel();

		for (Animal animal : animais) {
			Anuncio anuncio = animal.getAnuncio();

			if (anuncio != null) {

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
