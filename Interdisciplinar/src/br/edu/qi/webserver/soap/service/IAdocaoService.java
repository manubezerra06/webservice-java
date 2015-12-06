package br.edu.qi.webserver.soap.service;

import javax.jws.WebService;

import br.edu.qi.dto.AdocaoServiceDto;
import br.edu.qi.dto.RetornoAdocaoService;

@WebService
public interface IAdocaoService {

	public RetornoAdocaoService adotarAnimal(AdocaoServiceDto adocaoServiceDto);
}
