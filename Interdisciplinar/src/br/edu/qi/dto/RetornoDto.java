package br.edu.qi.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class RetornoDto {

	private List<AnimalDto> animais;

	private List<PessoaDto> pessoas;

	private List<InstituicaoDto> instituicoes;

	private List<UsuarioDto> usuarios;

	private List<AnuncioDto> anuncios;

	private List<AdocaoDto> adocoes;
	
	private String error;

	@XmlElement(name = "animal")
	@XmlElementWrapper(name = "animais")
	public List<AnimalDto> getAnimais() {
		if (animais == null)
			animais = new ArrayList<>();
		return animais;
	}

	public void setAnimais(List<AnimalDto> animais) {
		this.animais = animais;
	}

	@XmlElement(name = "pessoa")
	@XmlElementWrapper(name = "pessoas")
	public List<PessoaDto> getPessoas() {
		if (pessoas == null)
			pessoas = new ArrayList<>();
		return pessoas;
	}

	public void setPessoas(List<PessoaDto> pessoas) {
		this.pessoas = pessoas;
	}

	@XmlElement(name = "instituicao")
	@XmlElementWrapper(name = "instituicoes")
	public List<InstituicaoDto> getInstituicoes() {
		if (instituicoes == null)
			instituicoes = new ArrayList<>();
		return instituicoes;
	}

	public void setInstituicoes(List<InstituicaoDto> instituicoes) {
		this.instituicoes = instituicoes;
	}

	@XmlElement(name = "usuario")
	@XmlElementWrapper(name = "usuarios")
	public List<UsuarioDto> getUsuarios() {
		if (usuarios == null) usuarios = new ArrayList<>();
		return usuarios;
	}

	public void setUsuarios(List<UsuarioDto> usuarios) {
		if (usuarios == null)
			usuarios = new ArrayList<>();
		this.usuarios = usuarios;
	}

	@XmlElement(name = "anuncio")
	@XmlElementWrapper(name = "anuncios")
	public List<AnuncioDto> getAnuncios() {
		if (anuncios == null)
			anuncios = new ArrayList<>();
		return anuncios;
	}

	public void setAnuncios(List<AnuncioDto> anuncios) {
		this.anuncios = anuncios;
	}

	@XmlElement(name = "adocao")
	@XmlElementWrapper(name = "adocoes")
	public List<AdocaoDto> getAdocoes() {
		if (adocoes == null)
			adocoes = new ArrayList<>();
		return adocoes;
	}

	public void setAdocoes(List<AdocaoDto> adocoes) {
		this.adocoes = adocoes;
	}

	@XmlElement
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}	
}
