
package br.edu.qi.webserver.rest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.loader.dto.AdocaoDto;
import br.edu.qi.loader.dto.AnimalDto;
import br.edu.qi.loader.dto.AnuncioDto;
import br.edu.qi.loader.dto.InstituicaoDto;
import br.edu.qi.loader.dto.PessoaDto;
import br.edu.qi.loader.dto.UsuarioDto;
import br.edu.qi.loader.dto.RetornoDto;

@Path("/pet")
public class XmlSampleService {

	@GET
	@Path("/xmlsample")
	@Produces(MediaType.APPLICATION_XML)
	public RetornoDto getXmlSample() {

		RetornoDto model = new RetornoDto();

		List<AdocaoDto> adocoes = new ArrayList<>();

		AdocaoDto adocao = new AdocaoDto();
		List<Integer> codAnimais = new ArrayList<>();
		codAnimais.add(1);
		adocao.setCodAnimais(codAnimais);
		adocao.setCodInstituicao(1);
		adocao.setCodPessoa(1);
		adocao.setDate(new Date());
		adocoes.add(adocao);

		model.setAdocoes(adocoes);

		List<AnimalDto> animais = new ArrayList<>();

		AnimalDto animal = new AnimalDto();
		animal.setDisponivelAdocao(true);
		animal.setGenero('m');
		animal.setIdade(3);
		animal.setNomeAdotivo("toto");
		animal.setTipo("ção viralata");
		animais.add(animal);
		
		AnimalDto animal2 = new AnimalDto();
		animal2.setDisponivelAdocao(true);
		animal2.setGenero('f');
		animal2.setIdade(2);
		animal2.setNomeAdotivo("rex");
		animal2.setTipo("ção fox");
		animais.add(animal2);
		
		
		model.setAnimais(animais);

		List<AnuncioDto> anuncios = new ArrayList<>();

		AnuncioDto anuncio = new AnuncioDto();
		anuncio.setCodAnimal(1);
		anuncio.setDescricao("Este cãozinho está a procura de um lar");
		anuncio.setCodInstituicao(1);
		anuncios.add(anuncio);
		
		AnuncioDto anuncio2 = new AnuncioDto();
		anuncio2.setCodAnimal(2);
		anuncio2.setDescricao("Outro cãozinho que está a procura de um lar");
		anuncio.setCodInstituicao(1);
		anuncios.add(anuncio2);
		
		
		model.setAnuncios(anuncios);

		List<InstituicaoDto> instituicoes = new ArrayList<>();

		InstituicaoDto instituicao = new InstituicaoDto();
		instituicao.setCnpj("00900500339/0001");
		instituicao.setEmail("onda@gamil.com");
		instituicao.setTelefone("34175999");
		instituicao.setTipo("ong");
		instituicao.setNome("Onda Animal");
		instituicao.setEndereco("rua dorival de oliveira 123");
		instituicoes.add(instituicao);
		
		InstituicaoDto instituicao2 = new InstituicaoDto();
		instituicao2.setCnpj("0095847387487/0001");
		instituicao2.setEmail("meubixoderua@gamil.com");
		instituicao2.setTelefone("34715439");
		instituicao2.setTipo("ong");
		instituicao2.setNome("Meu bixo de rua");
		instituicao2.setEndereco("rua flores da cunha 123");
		instituicoes.add(instituicao2);
		
		model.setInstituicoes(instituicoes);

		List<UsuarioDto> usuarios = new ArrayList<>();
		
		UsuarioDto usuario = new UsuarioDto();
		usuario.setEmail("rodrigo@gmail.com");
		usuario.setPerfilAcesso("Rodrigo");
		usuario.setSenha("12345567");
		usuarios.add(usuario);
		
		UsuarioDto usuario2 = new UsuarioDto();
		usuario2.setEmail("reus@gmail.com");
		usuario2.setPerfilAcesso("Eduardo Reus");
		usuario2.setSenha("98654332");
		usuarios.add(usuario2);
		
		model.setUsuarios(usuarios);

		List<PessoaDto> pessoas = new ArrayList<>();
		
		PessoaDto pessoa = new PessoaDto();
		pessoa.setEmailUsuario("reus@gmail.com");
		pessoa.setGenero("Masculino");
		pessoa.setNomeMae1("Maria da Silva");
		pessoa.setNomePai1("João da Silva");
		pessoa.setTelefone("99779977");
		pessoa.setReligiao("Jedi");
		pessoa.setNomeSocial("Adão da Silva");
		pessoa.setConjuge("Eva da Silva");
		pessoa.setEtnia("Negra");
		pessoa.setDeficiente(false);
		pessoa.setDataNascimento(new Date());
		pessoas.add(pessoa );
		
		PessoaDto pessoa2 = new PessoaDto();
		pessoa2.setEmailUsuario("rodrigo@gmail.com");
		pessoa2.setGenero("Masculino");
		pessoa2.setNomeMae1("Joana da Silva");
		pessoa2.setNomePai1("Mario da Silva");
		pessoa2.setTelefone("839483958");
		pessoa2.setReligiao("Trek");
		pessoa2.setNomeSocial("Heman da Silva");
		pessoa2.setConjuge("Shera da Silva");
		pessoa2.setEtnia("Oriental");
		pessoa2.setDeficiente(false);
		pessoa2.setDataNascimento(new Date());
		pessoas.add(pessoa2 );
		
		model.setPessoas(pessoas);

		return model;
	}
		
	@GET
	@Path("/animais")
	@Produces(MediaType.APPLICATION_XML)
	public List<Animal> getAnimais() {
		
		Dao dao = new Dao();		
		return dao.retornarTodos("Animal");		
	}

}
