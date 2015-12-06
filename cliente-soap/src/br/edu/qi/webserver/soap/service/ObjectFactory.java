
package br.edu.qi.webserver.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.qi.webserver.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPessoaComMaisAdocao_QNAME = new QName("http://service.soap.webserver.qi.edu.br/", "getPessoaComMaisAdocao");
    private final static QName _GetPessoaComMaisAdocaoResponse_QNAME = new QName("http://service.soap.webserver.qi.edu.br/", "getPessoaComMaisAdocaoResponse");
    private final static QName _PessoaRetorno_QNAME = new QName("http://service.soap.webserver.qi.edu.br/", "pessoaRetorno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.qi.webserver.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PessoaRetorno }
     * 
     */
    public PessoaRetorno createPessoaRetorno() {
        return new PessoaRetorno();
    }

    /**
     * Create an instance of {@link GetPessoaComMaisAdocao }
     * 
     */
    public GetPessoaComMaisAdocao createGetPessoaComMaisAdocao() {
        return new GetPessoaComMaisAdocao();
    }

    /**
     * Create an instance of {@link GetPessoaComMaisAdocaoResponse }
     * 
     */
    public GetPessoaComMaisAdocaoResponse createGetPessoaComMaisAdocaoResponse() {
        return new GetPessoaComMaisAdocaoResponse();
    }

    /**
     * Create an instance of {@link PessoaRetornoItem }
     * 
     */
    public PessoaRetornoItem createPessoaRetornoItem() {
        return new PessoaRetornoItem();
    }

    /**
     * Create an instance of {@link PessoaRetorno.Itens }
     * 
     */
    public PessoaRetorno.Itens createPessoaRetornoItens() {
        return new PessoaRetorno.Itens();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPessoaComMaisAdocao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.webserver.qi.edu.br/", name = "getPessoaComMaisAdocao")
    public JAXBElement<GetPessoaComMaisAdocao> createGetPessoaComMaisAdocao(GetPessoaComMaisAdocao value) {
        return new JAXBElement<GetPessoaComMaisAdocao>(_GetPessoaComMaisAdocao_QNAME, GetPessoaComMaisAdocao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPessoaComMaisAdocaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.webserver.qi.edu.br/", name = "getPessoaComMaisAdocaoResponse")
    public JAXBElement<GetPessoaComMaisAdocaoResponse> createGetPessoaComMaisAdocaoResponse(GetPessoaComMaisAdocaoResponse value) {
        return new JAXBElement<GetPessoaComMaisAdocaoResponse>(_GetPessoaComMaisAdocaoResponse_QNAME, GetPessoaComMaisAdocaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PessoaRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.webserver.qi.edu.br/", name = "pessoaRetorno")
    public JAXBElement<PessoaRetorno> createPessoaRetorno(PessoaRetorno value) {
        return new JAXBElement<PessoaRetorno>(_PessoaRetorno_QNAME, PessoaRetorno.class, null, value);
    }

}
