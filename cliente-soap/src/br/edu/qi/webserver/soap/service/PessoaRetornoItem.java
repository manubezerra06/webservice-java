
package br.edu.qi.webserver.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pessoaRetornoItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pessoaRetornoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomePessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeAdocoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoaRetornoItem", propOrder = {
    "nomePessoa",
    "quantidadeAdocoes"
})
public class PessoaRetornoItem {

    protected String nomePessoa;
    protected int quantidadeAdocoes;

    /**
     * Obtém o valor da propriedade nomePessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * Define o valor da propriedade nomePessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePessoa(String value) {
        this.nomePessoa = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeAdocoes.
     * 
     */
    public int getQuantidadeAdocoes() {
        return quantidadeAdocoes;
    }

    /**
     * Define o valor da propriedade quantidadeAdocoes.
     * 
     */
    public void setQuantidadeAdocoes(int value) {
        this.quantidadeAdocoes = value;
    }

}
