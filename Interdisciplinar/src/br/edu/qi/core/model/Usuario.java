package br.edu.qi.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", catalog = "interdisciplinardb")
public class Usuario implements java.io.Serializable {

	private static final long serialVersionUID = 8409541667719363951L;
	private String email;
	private String senha;
	private String perfilAcesso;

	public Usuario() {
		super();
	}

	public Usuario(String email, String senha, String perfilAcesso) {
		super();
		this.email = email;
		this.senha = senha;
		this.perfilAcesso = perfilAcesso;
	}

	@Id()
	@Column(name = "email", unique = true, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "senha", length = 15)
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(name = "perfilAcesso", length = 15)
	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
