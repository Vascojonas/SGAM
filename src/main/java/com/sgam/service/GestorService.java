package com.sgam.service;

import java.util.List;

import com.sgam.domain.Gestor;

public interface GestorService {
	
	 void save(Gestor gestor);
		
		void update(Gestor gestor);
		
		void delete(Long id);
		
		Gestor findById(Long id);
		
		List<Gestor> findAll();

}
