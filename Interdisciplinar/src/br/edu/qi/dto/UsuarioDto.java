package br.edu.qi.dto;

import javax.xml.bind.annotation.XmlElement;

public class UsuarioDto {

	private String email;
	private String senha;
	private String perfilAcesso;

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@XmlElement
	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
}
