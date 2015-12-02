package br.edu.qi.loader.dto;

import java.util.Date;
import java.util.List;

public class AdocaoServiceDto {

	private int codInstituicao;
	private int codPessoa;
	private PessoaDto pessoaDto;
	private Date date;
	private List<Integer> CodAnimais;

	public int getCodInstituicao() {
		return codInstituicao;
	}

	public void setCodInstituicao(int codInstituicao) {
		this.codInstituicao = codInstituicao;
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Integer> getCodAnimais() {
		return CodAnimais;
	}

	public void setCodAnimais(List<Integer> codAnimais) {
		CodAnimais = codAnimais;
	}

	public PessoaDto getPessoaDto() {
		return pessoaDto;
	}

	public void setPessoaDto(PessoaDto pessoaDto) {
		this.pessoaDto = pessoaDto;
	}
}