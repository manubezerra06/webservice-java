
package br.edu.qi.webserver.soap.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de adocaoServiceDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="adocaoServiceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAnimais" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codInstituicao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codPessoa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pessoaDto" type="{http://service.soap.webserver.qi.edu.br/}pessoaDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adocaoServiceDto", propOrder = {
    "codAnimais",
    "codInstituicao",
    "codPessoa",
    "date",
    "pessoaDto"
})
public class AdocaoServiceDto {

    @XmlElement(nillable = true)
    protected List<Integer> codAnimais;
    protected int codInstituicao;
    protected int codPessoa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected PessoaDto pessoaDto;

    /**
     * Gets the value of the codAnimais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codAnimais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodAnimais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCodAnimais() {
        if (codAnimais == null) {
            codAnimais = new ArrayList<Integer>();
        }
        return this.codAnimais;
    }

    /**
     * Obtém o valor da propriedade codInstituicao.
     * 
     */
    public int getCodInstituicao() {
        return codInstituicao;
    }

    /**
     * Define o valor da propriedade codInstituicao.
     * 
     */
    public void setCodInstituicao(int value) {
        this.codInstituicao = value;
    }

    /**
     * Obtém o valor da propriedade codPessoa.
     * 
     */
    public int getCodPessoa() {
        return codPessoa;
    }

    /**
     * Define o valor da propriedade codPessoa.
     * 
     */
    public void setCodPessoa(int value) {
        this.codPessoa = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtém o valor da propriedade pessoaDto.
     * 
     * @return
     *     possible object is
     *     {@link PessoaDto }
     *     
     */
    public PessoaDto getPessoaDto() {
        return pessoaDto;
    }

    /**
     * Define o valor da propriedade pessoaDto.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaDto }
     *     
     */
    public void setPessoaDto(PessoaDto value) {
        this.pessoaDto = value;
    }

}
