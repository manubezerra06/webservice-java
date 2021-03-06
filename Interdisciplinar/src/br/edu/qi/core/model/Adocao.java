package br.edu.qi.core.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "adocao", catalog = "interdisciplinardb")
public class Adocao implements java.io.Serializable {

	private static final long serialVersionUID = -6312985520798974888L;
	private int codigo;
	private Instituicao instituicao;
	private Pessoa pessoa;
	private Date date;
	private Set<Animal> animais = new HashSet<Animal>(0);

	public Adocao() {
		// TODO Auto-generated constructor stub
	}

	public Adocao(Instituicao instituicao, Pessoa pessoa, Date date, Set<Animal> animais) {
		super();
		this.instituicao = instituicao;
		this.pessoa = pessoa;
		this.date = date;
		this.animais = animais;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codigo", unique = true, nullable = false)
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "adocao")
	public Set<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(Set<Animal> animais) {
		this.animais = animais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
