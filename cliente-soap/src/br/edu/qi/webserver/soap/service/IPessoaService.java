
package br.edu.qi.webserver.soap.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IPessoaService", targetNamespace = "http://service.soap.webserver.qi.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IPessoaService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<br.edu.qi.webserver.soap.service.PessoaRetorno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPessoaComMaisAdocao", targetNamespace = "http://service.soap.webserver.qi.edu.br/", className = "br.edu.qi.webserver.soap.service.GetPessoaComMaisAdocao")
    @ResponseWrapper(localName = "getPessoaComMaisAdocaoResponse", targetNamespace = "http://service.soap.webserver.qi.edu.br/", className = "br.edu.qi.webserver.soap.service.GetPessoaComMaisAdocaoResponse")
    @Action(input = "http://service.soap.webserver.qi.edu.br/IPessoaService/getPessoaComMaisAdocaoRequest", output = "http://service.soap.webserver.qi.edu.br/IPessoaService/getPessoaComMaisAdocaoResponse")
    public List<PessoaRetorno> getPessoaComMaisAdocao(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}