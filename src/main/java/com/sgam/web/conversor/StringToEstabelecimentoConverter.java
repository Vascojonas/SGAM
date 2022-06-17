package com.sgam.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.sgam.domain.Estabelecimento;
import com.sgam.service.EstabelecimentoService;

@Component
public class StringToEstabelecimentoConverter implements Converter<String, Estabelecimento> {

	@Autowired
	EstabelecimentoService service;
	
	@Override
	public Estabelecimento convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.findById(id);
	}
	
	

}
