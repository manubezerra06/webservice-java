package br.edu.qi.webserver.soap.service;

import java.util.List;

import javax.jws.WebService;

import br.edu.qi.dto.AnimalServiceDto;

@WebService
public interface IAnimalService {

	public List<AnimalServiceDto> getAnimais();
}
