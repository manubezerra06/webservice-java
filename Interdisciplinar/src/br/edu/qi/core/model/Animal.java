package br.edu.qi.core.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal", catalog = "interdisciplinardb" )
public class Animal implements java.io.Serializable {

	private static final long serialVersionUID = 5690101673236521396L;
	private int codigo;
	private String nomeAdotivo;
	private String tipo;
	private char genero;
	private int idade;
	private boolean disponivelAdocao;
	private Adocao adocao;
	private Anuncio anuncio;
	private String raca;

	public Animal() {

		// nada

	}

	public Animal(String nomeAdotivo, String tipo, char genero, int idade, boolean disponivelAdocao, String raca) {
		super();
		this.nomeAdotivo = nomeAdotivo;
		this.tipo = tipo;
		this.genero = genero;
		this.idade = idade;
		this.disponivelAdocao = disponivelAdocao;
		this.raca = raca;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(unique = true, nullable = false)
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Column(length = 70)
	public String getNomeAdotivo() {
		return nomeAdotivo;
	}

	public void setNomeAdotivo(String nomeAdotivo) {
		this.nomeAdotivo = nomeAdotivo;
	}

	@Column(length = 70)
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(length = 70)
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Column(name = "Idade", length = 70)
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Column(name = "DisponivelAdocao", length = 70)
	public boolean isDisponivelAdocao() {
		return disponivelAdocao;
	}

	public void setDisponivelAdocao(boolean disponivelAdocao) {
		this.disponivelAdocao = disponivelAdocao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn()
	public Adocao getAdocao() {
		return adocao;
	}

	public void setAdocao(Adocao adocao) {
		this.adocao = adocao;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "animal", optional = true)
	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
