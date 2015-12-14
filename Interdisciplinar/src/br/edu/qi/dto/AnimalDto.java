package br.edu.qi.dto;

import javax.xml.bind.annotation.XmlElement;

public class AnimalDto {

	private String nomeAdotivo;
	private String tipo;
	private char genero;
	private int idade;
	private boolean disponivelAdocao;
	private String raca;

	@XmlElement
	public String getNomeAdotivo() {
		return nomeAdotivo;
	}

	public void setNomeAdotivo(String nomeAdotivo) {
		this.nomeAdotivo = nomeAdotivo;
	}

	@XmlElement
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@XmlElement
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@XmlElement
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@XmlElement
	public boolean isDisponivelAdocao() {
		return disponivelAdocao;
	}

	public void setDisponivelAdocao(boolean disponivelAdocao) {
		this.disponivelAdocao = disponivelAdocao;
	}

	@XmlElement
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
