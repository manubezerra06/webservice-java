
package br.edu.qi.webserver.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retornoAdocaoService complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retornoAdocaoService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adocaoServiceDto" type="{http://service.soap.webserver.qi.edu.br/}adocaoServiceDto" minOccurs="0"/>
 *         &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoAdocaoService", propOrder = {
    "adocaoServiceDto",
    "erro"
})
public class RetornoAdocaoService {

    protected AdocaoServiceDto adocaoServiceDto;
    protected String erro;

    /**
     * Obtém o valor da propriedade adocaoServiceDto.
     * 
     * @return
     *     possible object is
     *     {@link AdocaoServiceDto }
     *     
     */
    public AdocaoServiceDto getAdocaoServiceDto() {
        return adocaoServiceDto;
    }

    /**
     * Define o valor da propriedade adocaoServiceDto.
     * 
     * @param value
     *     allowed object is
     *     {@link AdocaoServiceDto }
     *     
     */
    public void setAdocaoServiceDto(AdocaoServiceDto value) {
        this.adocaoServiceDto = value;
    }

    /**
     * Obtém o valor da propriedade erro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
    }

}
