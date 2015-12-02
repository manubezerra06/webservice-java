package br.edu.qi.webserver.soap.service;

import br.edu.qi.loader.dto.AdocaoDto;
import br.edu.qi.loader.dto.AdocaoServiceDto;
import br.edu.qi.loader.dto.RetornoDto;

public interface IAdocaoService {

	public RetornoDto adotarAnimal(AdocaoServiceDto adocaoServiceDto);
}
