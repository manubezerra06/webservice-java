package br.edu.qi.webserver.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.core.model.Animal;
import br.edu.qi.dto.TopRacaDto;

@Path("/racas")
public class RacaService {

	/*
	 * Parte 5
	 * 
	 * Desenvolver Web services Rest:
	 * 
	 * a. Um Web service as ra�as mais adotadas. Passar como par�metro o
	 * tipo
	 * 
	 * b. Consumir o Web service anterior em qualquer outra tecnologia.
	 * 
	 * animal, ou seja, se � c�o ou Gato. O retorno pode ser em qualquer
	 * formato
	 * 
	 * Desenvolver um exemplo mostrando os dados retornados pelo WS.
	 * 
	 * Sugest�o: php, .NET,...
	 **/

	@GET
	@Path("/{tipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRacasMaisAdotadas(@PathParam("tipo") String tipo) {

		Dao dao = new Dao();
		List<Animal> animais = dao.retornarTodos("Animal");

		HashMap<String, Integer> racasMap = new HashMap<>();

		for (Animal animal : animais) {
			if (animal.getTipo().equals(tipo)) {

				String key = animal.getRaca();
				// tipos.merge(key, 1, (a,b) -> a+b); //lambda n�o funciona :(
				int count = racasMap.getOrDefault(key, 0);
				count += 1;
				racasMap.put(key, count);
			}
		}

		Object[] a = racasMap.entrySet().toArray();
		Arrays.sort(a, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Map.Entry<String, Integer>) o2).getValue()
						.compareTo(((Map.Entry<String, Integer>) o1).getValue());
			}
		});

		int max = 0;

		List<TopRacaDto> racas = new ArrayList<>();

		for (Object e : a) {
			max++;
			if (max > 3)
				break;

			TopRacaDto raca = new TopRacaDto();
			raca.setQuantidade(((Map.Entry<String, Integer>) e).getValue());
			raca.setRaca(((Map.Entry<String, Integer>) e).getKey());
			racas.add(raca);
		}

		return Response.status(200).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").entity(racas).build();

	}

}
