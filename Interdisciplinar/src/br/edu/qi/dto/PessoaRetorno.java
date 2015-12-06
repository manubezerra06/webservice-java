package br.edu.qi.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaRetorno {

	private String nomeInstituicao;
	private List<PessoaRetornoItem> itens;

	@XmlElementWrapper
	@XmlElement
	public List<PessoaRetornoItem> getItens() {
		return itens;
	}

	public void setItens(List<PessoaRetornoItem> itens) {
		this.itens = itens;
	}

	@XmlElement
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

}
