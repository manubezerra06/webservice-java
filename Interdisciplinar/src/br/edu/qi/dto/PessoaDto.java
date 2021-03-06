package br.edu.qi.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class PessoaDto {

	private String nomeSocial;
	private Date dataNascimento;
	private String nomePai1;
	private String nomePai2;
	private String NomeMae1;
	private String NomeMae2;
	private String telefone;
	private String genero;
	private String conjuge;
	private String etnia;
	private String religiao;
	private boolean isDeficiente;
	private String emailUsuario;

	@XmlElement
	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	@XmlElement
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@XmlElement
	public String getNomePai1() {
		return nomePai1;
	}

	public void setNomePai1(String nomePai1) {
		this.nomePai1 = nomePai1;
	}

	@XmlElement
	public String getNomePai2() {
		return nomePai2;
	}

	public void setNomePai2(String nomePai2) {
		this.nomePai2 = nomePai2;
	}

	@XmlElement
	public String getNomeMae1() {
		return NomeMae1;
	}

	public void setNomeMae1(String nomeMae1) {
		NomeMae1 = nomeMae1;
	}

	@XmlElement
	public String getNomeMae2() {
		return NomeMae2;
	}

	public void setNomeMae2(String nomeMae2) {
		NomeMae2 = nomeMae2;
	}

	@XmlElement
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@XmlElement
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@XmlElement
	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	@XmlElement
	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	@XmlElement
	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	@XmlElement
	public boolean isDeficiente() {
		return isDeficiente;
	}

	public void setDeficiente(boolean isDeficiente) {
		this.isDeficiente = isDeficiente;
	}

	@XmlElement
	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

}
