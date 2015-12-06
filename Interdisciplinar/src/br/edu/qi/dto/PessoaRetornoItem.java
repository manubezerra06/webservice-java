package br.edu.qi.dto;

import javax.xml.bind.annotation.XmlElement;

public class PessoaRetornoItem {

	private String nomePessoa;
	private int quantidadeAdocoes;

	@XmlElement
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	@XmlElement
	public int getQuantidadeAdocoes() {
		return quantidadeAdocoes;
	}

	public void setQuantidadeAdocoes(int quantidadeAdocoes) {
		this.quantidadeAdocoes = quantidadeAdocoes;
	}

}
