package br.edu.qi.loader.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class RetornoAdocaoService {

	private AdocaoServiceDto adocaoServiceDto;
	private String erro;

	@XmlElement
	public AdocaoServiceDto getAdocaoServiceDto() {
		return adocaoServiceDto;
	}

	public void setAdocaoServiceDto(AdocaoServiceDto adocaoServiceDto) {
		this.adocaoServiceDto = adocaoServiceDto;
	}

	@XmlElement
	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

}
