package br.edu.qi.loader;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Adocao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.core.model.Anuncio;
import br.edu.qi.core.model.Instituicao;
import br.edu.qi.core.model.Pessoa;
import br.edu.qi.core.model.Usuario;
import br.edu.qi.dto.AdocaoDto;
import br.edu.qi.dto.AnimalDto;
import br.edu.qi.dto.AnuncioDto;
import br.edu.qi.dto.InstituicaoDto;
import br.edu.qi.dto.PessoaDto;
import br.edu.qi.dto.RetornoDto;
import br.edu.qi.dto.UsuarioDto;

public class Parser {

	Dao dao;

	public Parser(Dao dao) {
		super();
		this.dao = dao;
	}

	public static Adocao parseAdocao(Dao dao, AdocaoDto adocaoDto) {

		// Instituicao instituicao = dao.retornarPorId(Instituicao.class,
		// adocao.getCodInstituicao());
		Instituicao instituicao = (Instituicao) dao.retornarTodos("Instituicao").get(adocaoDto.getCodInstituicao() - 1);

		// Pessoa pessoa = dao.retornarPorId(Pessoa.class,
		// adocao.getCodPessoa());
		Pessoa pessoa = (Pessoa) dao.retornarTodos("Pessoa").get(adocaoDto.getCodPessoa() - 1);

		Date date = adocaoDto.getDate();

		Set<Animal> animais = new HashSet<Animal>(0);

		for (int codAnimal : adocaoDto.getCodAnimais()) {

			// Animal a = dao.retornarPorId(Animal.class, codAnimal);
			Animal a = (Animal) dao.retornarTodos("Animal").get(codAnimal - 1);
			animais.add(a);

		}

		Adocao newAdocao = new Adocao(instituicao, pessoa, date, animais);
		return newAdocao;

	}

	public void parse(RetornoDto model) {

		if (model == null)
			return;

		for (AdocaoDto adocaoDto : model.getAdocoes()) {

			Adocao newAdocao = parseAdocao(dao, adocaoDto);
			dao.salvar(newAdocao);
			for (Animal animal : newAdocao.getAnimais()) {
				animal.setAdocao(newAdocao);
				dao.salvar(animal);
			}
		}

		for (AnimalDto animal : model.getAnimais()) {

			Animal a = new Animal(animal.getNomeAdotivo(), animal.getTipo(), animal.getGenero(), animal.getIdade(),
					animal.isDisponivelAdocao());
			dao.salvar(a);
		}

		for (AnuncioDto anuncio : model.getAnuncios()) {

			// Instituicao i = dao.retornarPorId(Instituicao.class,
			// anuncio.getCodInstituicao());
			// Animal a = dao.retornarPorId(Animal.class,
			// anuncio.getCodAnimal());

			// gambiarra para evitar ids errados
			Instituicao i = (Instituicao) dao.retornarTodos("Instituicao").get(anuncio.getCodInstituicao() - 1);
			Animal a = (Animal) dao.retornarTodos("Animal").get(anuncio.getCodAnimal() - 1);

			Anuncio anun = new Anuncio(a, anuncio.getDescricao(), i);
			dao.salvar(anun);

		}

		for (InstituicaoDto instituicao : model.getInstituicoes()) {

			Instituicao i = new Instituicao(instituicao.getNome(), instituicao.getCnpj(), instituicao.getEndereco(),
					instituicao.getTelefone(), instituicao.getEmail(), instituicao.getTipo());
			dao.salvar(i);
		}

		for (PessoaDto pessoa : model.getPessoas()) {

			Usuario usuario = dao.retornarPorId(Usuario.class, pessoa.getEmailUsuario());
			Pessoa p = new Pessoa(pessoa.getNomeSocial(), pessoa.getDataNascimento(), pessoa.getNomePai1(),
					pessoa.getNomePai2(), pessoa.getNomeMae1(), pessoa.getNomeMae2(), pessoa.getTelefone(),
					pessoa.getGenero(), pessoa.getConjuge(), pessoa.getEtnia(), pessoa.getReligiao(),
					pessoa.isDeficiente(), usuario);

			dao.salvar(p);

		}

		for (UsuarioDto usuario : model.getUsuarios()) {

			Usuario u = new Usuario(usuario.getEmail(), usuario.getSenha(), usuario.getPerfilAcesso());
			dao.salvar(u);
		}

	}

}
