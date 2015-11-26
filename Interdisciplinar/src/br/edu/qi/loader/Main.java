package br.edu.qi.loader;

import br.edu.qi.core.dao.Dao;
import br.edu.qi.loader.dto.XmlModel;

public class Main {

	public static void main(String[] args) {

		Dao dao = new Dao();

		Loader loader = new Loader();

		for (int i = 1; i <= 4; i++) {
			XmlModel model = loader.Load("src/loadtest0" + i + ".xml");

			dao.beginTransaction();

			Parser parser = new Parser(dao);
			parser.parse(model);

			dao.commit();
		}

	}
}
