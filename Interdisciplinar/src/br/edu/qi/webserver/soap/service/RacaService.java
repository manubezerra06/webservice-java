package br.edu.qi.webserver.soap.service;

import javax.jws.WebService;

import br.edu.qi.loader.dto.RetornoDto;

@WebService(endpointInterface = "br.edu.qi.webserver.soap.service.IRacaService")
public class RacaService implements IRacaService {

	

	/* 
	 * Parte 5
	 * 
	 * Desenvolver Web services Rest:

a. Um Web service as ra�as mais adotadas. Passar como par�metro o tipo 

b. Consumir o Web service anterior em qualquer outra tecnologia. 

animal, ou seja, se � c�o ou Gato. O retorno pode ser em qualquer formato

Desenvolver um exemplo mostrando os dados retornados pelo WS. 

Sugest�o: php, .NET,... **/
	
public 	RetornoDto getRacasMaisAdotadas(){
		
		
	return new RetornoDto();
		
	}
	
}
