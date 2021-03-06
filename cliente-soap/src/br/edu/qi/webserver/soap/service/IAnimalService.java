
package br.edu.qi.webserver.soap.service;

import java.util.List;
import javax.jws.WebMethod;
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
@WebService(name = "IAnimalService", targetNamespace = "http://service.soap.webserver.qi.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IAnimalService {


    /**
     * 
     * @return
     *     returns java.util.List<br.edu.qi.webserver.soap.service.AnimalServiceDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAnimais", targetNamespace = "http://service.soap.webserver.qi.edu.br/", className = "br.edu.qi.webserver.soap.service.GetAnimais")
    @ResponseWrapper(localName = "getAnimaisResponse", targetNamespace = "http://service.soap.webserver.qi.edu.br/", className = "br.edu.qi.webserver.soap.service.GetAnimaisResponse")
    @Action(input = "http://service.soap.webserver.qi.edu.br/IAnimalService/getAnimaisRequest", output = "http://service.soap.webserver.qi.edu.br/IAnimalService/getAnimaisResponse")
    public List<AnimalServiceDto> getAnimais();

}
