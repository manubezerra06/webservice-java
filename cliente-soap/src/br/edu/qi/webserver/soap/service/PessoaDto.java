
package br.edu.qi.webserver.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pessoaDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pessoaDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conjuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deficiente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMae1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMae2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePai1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomePai2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoaDto", propOrder = {
    "conjuge",
    "dataNascimento",
    "deficiente",
    "emailUsuario",
    "etnia",
    "genero",
    "nomeMae1",
    "nomeMae2",
    "nomePai1",
    "nomePai2",
    "nomeSocial",
    "religiao",
    "telefone"
})
public class PessoaDto {

    protected String conjuge;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataNascimento;
    protected boolean deficiente;
    protected String emailUsuario;
    protected String etnia;
    protected String genero;
    protected String nomeMae1;
    protected String nomeMae2;
    protected String nomePai1;
    protected String nomePai2;
    protected String nomeSocial;
    protected String religiao;
    protected String telefone;

    /**
     * Obtém o valor da propriedade conjuge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConjuge() {
        return conjuge;
    }

    /**
     * Define o valor da propriedade conjuge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConjuge(String value) {
        this.conjuge = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade deficiente.
     * 
     */
    public boolean isDeficiente() {
        return deficiente;
    }

    /**
     * Define o valor da propriedade deficiente.
     * 
     */
    public void setDeficiente(boolean value) {
        this.deficiente = value;
    }

    /**
     * Obtém o valor da propriedade emailUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * Define o valor da propriedade emailUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUsuario(String value) {
        this.emailUsuario = value;
    }

    /**
     * Obtém o valor da propriedade etnia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtnia() {
        return etnia;
    }

    /**
     * Define o valor da propriedade etnia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtnia(String value) {
        this.etnia = value;
    }

    /**
     * Obtém o valor da propriedade genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o valor da propriedade genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae1() {
        return nomeMae1;
    }

    /**
     * Define o valor da propriedade nomeMae1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae1(String value) {
        this.nomeMae1 = value;
    }

    /**
     * Obtém o valor da propriedade nomeMae2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae2() {
        return nomeMae2;
    }

    /**
     * Define o valor da propriedade nomeMae2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae2(String value) {
        this.nomeMae2 = value;
    }

    /**
     * Obtém o valor da propriedade nomePai1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePai1() {
        return nomePai1;
    }

    /**
     * Define o valor da propriedade nomePai1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePai1(String value) {
        this.nomePai1 = value;
    }

    /**
     * Obtém o valor da propriedade nomePai2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePai2() {
        return nomePai2;
    }

    /**
     * Define o valor da propriedade nomePai2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePai2(String value) {
        this.nomePai2 = value;
    }

    /**
     * Obtém o valor da propriedade nomeSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocial() {
        return nomeSocial;
    }

    /**
     * Define o valor da propriedade nomeSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocial(String value) {
        this.nomeSocial = value;
    }

    /**
     * Obtém o valor da propriedade religiao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligiao() {
        return religiao;
    }

    /**
     * Define o valor da propriedade religiao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligiao(String value) {
        this.religiao = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

}
