package br.edu.qi.webserver.rest.controller;

import javax.ws.rs.*;

import br.edu.qi.core.dao.Dao;

@Path("validate")
public class Login {

	@GET
	public String validaUser() {
		
		Dao dao = new Dao();
		dao.retornarTodos("Animal");
		return "Ok";
	}

}
