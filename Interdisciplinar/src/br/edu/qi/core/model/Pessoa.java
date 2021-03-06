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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa", catalog = "interdisciplinardb")
public class Pessoa implements java.io.Serializable {

	private static final long serialVersionUID = -7724769533520157755L;

	private int codigo;
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
	private Usuario usuario;
	private Set<Adocao> adocoes = new HashSet<Adocao>(0);
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nomeSocial, Date dataNascimento, String nomePai1,
			String nomePai2, String nomeMae1, String nomeMae2, String telefone,
			String genero, String conjuge, String etnia, String religiao,
			boolean isDeficiente, Usuario usuario) {
		super();
		this.nomeSocial = nomeSocial;
		this.dataNascimento = dataNascimento;
		this.nomePai1 = nomePai1;
		this.nomePai2 = nomePai2;
		NomeMae1 = nomeMae1;
		NomeMae2 = nomeMae2;
		this.telefone = telefone;
		this.genero = genero;
		this.conjuge = conjuge;
		this.etnia = etnia;
		this.religiao = religiao;
		this.isDeficiente = isDeficiente;
		this.usuario = usuario;
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

	@Column(name = "NomeSocial", length = 30)
	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	@Column(name = "DataNascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Column(name = "NomePai1")
	public String getNomePai1() {
		return nomePai1;
	}

	public void setNomePai1(String nomePai1) {
		this.nomePai1 = nomePai1;
	}

	@Column(name = "NomePai2")
	public String getNomePai2() {
		return nomePai2;
	}

	public void setNomePai2(String nomePai2) {
		this.nomePai2 = nomePai2;
	}

	@Column(name = "NomeMae1")
	public String getNomeMae1() {
		return NomeMae1;
	}

	public void setNomeMae1(String nomeMae1) {
		NomeMae1 = nomeMae1;
	}

	@Column(name = "NomeMae2")
	public String getNomeMae2() {
		return NomeMae2;
	}

	public void setNomeMae2(String nomeMae2) {
		NomeMae2 = nomeMae2;
	}

	@Column(name = "Telefone")
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "Genero")
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Column(name = "Conjuge")
	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	@Column(name = "Etnia")
	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	@Column(name = "Religiao")
	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	@Column(name = "Deficiente")
	public boolean isDeficiente() {
		return isDeficiente;
	}

	public void setDeficiente(boolean isDeficiente) {
		this.isDeficiente = isDeficiente;
	}

	@OneToOne(targetEntity= Usuario.class, fetch = FetchType.LAZY, optional= true)
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Adocao> getAdocoes() {
		return adocoes;
	}

	public void setAdocoes(Set<Adocao> adocoes) {
		this.adocoes = adocoes;
	}

	
	
}
