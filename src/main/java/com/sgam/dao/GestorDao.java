package com.sgam.dao;

import java.util.List;
import com.sgam.domain.Gestor;

public interface GestorDao {

void save(Gestor gestor);
	
	void update(Gestor gestor);
	
	void delete(Long id);
	
	Gestor findById(Long id);
	
	List<Gestor> findAll();
}
