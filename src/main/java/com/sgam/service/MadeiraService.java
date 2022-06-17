package com.sgam.service;

import java.util.List;

import com.sgam.domain.Madeira;

public interface MadeiraService {
	
void save(Madeira madeira);
	
	void update(Madeira madeira);
	
	void delete(Long id);
	
	Madeira findById(Long id);
	
	List<Madeira> findAll();

}
