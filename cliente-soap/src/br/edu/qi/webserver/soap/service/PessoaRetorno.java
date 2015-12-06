
package br.edu.qi.webserver.soap.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pessoaRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pessoaRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itens" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itens" type="{http://service.soap.webserver.qi.edu.br/}pessoaRetornoItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nomeInstituicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoaRetorno", propOrder = {
    "itens",
    "nomeInstituicao"
})
public class PessoaRetorno {

    protected PessoaRetorno.Itens itens;
    protected String nomeInstituicao;

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link PessoaRetorno.Itens }
     *     
     */
    public PessoaRetorno.Itens getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaRetorno.Itens }
     *     
     */
    public void setItens(PessoaRetorno.Itens value) {
        this.itens = value;
    }

    /**
     * Obtém o valor da propriedade nomeInstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    /**
     * Define o valor da propriedade nomeInstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeInstituicao(String value) {
        this.nomeInstituicao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itens" type="{http://service.soap.webserver.qi.edu.br/}pessoaRetornoItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itens"
    })
    public static class Itens {

        protected List<PessoaRetornoItem> itens;

        /**
         * Gets the value of the itens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PessoaRetornoItem }
         * 
         * 
         */
        public List<PessoaRetornoItem> getItens() {
            if (itens == null) {
                itens = new ArrayList<PessoaRetornoItem>();
            }
            return this.itens;
        }

    }

}
