package br.edu.qi.loader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.edu.qi.dto.RetornoDto;

public class Loader {

	private Unmarshaller unmarshaller;

	public Loader() {
		try {
			JAXBContext context = JAXBContext.newInstance(RetornoDto.class);
			unmarshaller = context.createUnmarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public RetornoDto Load(String path) {

		try {
			File file = new File(path);
			Object unmarshallerResult = this.unmarshaller.unmarshal(file);
			RetornoDto model = (RetornoDto) unmarshallerResult;
			return model;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
