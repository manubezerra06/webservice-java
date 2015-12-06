package br.edu.qi.dto;

import java.util.ArrayList;
import java.util.Date;

public class AdocaoServiceDto {

	private int codInstituicao;
	private int codPessoa;
	private PessoaDto pessoaDto;
	private Date date;
	private ArrayList<Integer> CodAnimais;

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

	public ArrayList<Integer> getCodAnimais() {
		return CodAnimais;
	}

	public void setCodAnimais(ArrayList<Integer> codAnimais) {
		CodAnimais = codAnimais;
	}

	public PessoaDto getPessoaDto() {
		return pessoaDto;
	}

	public void setPessoaDto(PessoaDto pessoaDto) {
		this.pessoaDto = pessoaDto;
	}
}
