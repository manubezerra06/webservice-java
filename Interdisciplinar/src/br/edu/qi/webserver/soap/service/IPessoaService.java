package br.edu.qi.webserver.soap.service;

import java.util.List;

import javax.jws.WebService;

import br.edu.qi.dto.PessoaRetorno;

@WebService
public interface IPessoaService {

	public List<PessoaRetorno> getPessoaComMaisAdocao(int mes, int ano);
	
}
