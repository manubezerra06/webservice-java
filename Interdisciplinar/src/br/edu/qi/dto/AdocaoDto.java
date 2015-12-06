package br.edu.qi.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AdocaoDto {

	private int codInstituicao;
	private int codPessoa;
	private Date date;
	private List<Integer> CodAnimais;

	@XmlElement
	public int getCodInstituicao() {
		return codInstituicao;
	}

	public void setCodInstituicao(int codInstituicao) {
		this.codInstituicao = codInstituicao;
	}


	@XmlElement
	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}


	@XmlElement
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@XmlElement
	public List<Integer> getCodAnimais() {
		return CodAnimais;
	}

	public void setCodAnimais(List<Integer> codAnimais) {
		CodAnimais = codAnimais;
	}
}