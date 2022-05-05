package com.sgam.service;

import java.util.List;

import com.sgam.domain.Estabelecimento;

public interface EstabelecimentoService {
	void save(Estabelecimento estabelecimento);
	
	void update(Estabelecimento estabelecimento);
	
	void delete(Long id);
	
	Estabelecimento findById(Long id);
	
	List<Estabelecimento> findAll();
}
