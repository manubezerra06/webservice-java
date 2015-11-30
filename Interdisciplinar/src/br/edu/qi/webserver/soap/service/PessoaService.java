package br.edu.qi.webserver.soap.service;

import java.util.List;

import javax.jws.WebService;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Pessoa;

@WebService(endpointInterface = "br.edu.qi.webserver.soap.service.IPessoaService")
public class PessoaService implements IPessoaService {

	void getPessoaComMaisAdocao(int mes, int ano) {

		Dao dao = new Dao();

		List<Pessoa> pessoas = dao.retornarTodos("Pessoa");

		for (Pessoa pessoa : pessoas) {
			
			if (pessoa.getAdocoes().size() >= 2){
				
			/*
			 * 
			 * Um Web service que retorne todos as pessoas que tem mais adoções no

				mês, por instituição. Retornar no formato adequado ao SOAP. O Web 

				service recebe como parâmetro mês/ano. (retornar somente os que tem 

				mais de duas adoções)
			 */				
				
			}
		}
		

	}

}
