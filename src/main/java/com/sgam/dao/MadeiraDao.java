package com.sgam.dao;

import java.util.List;

import com.sgam.domain.Madeira;


public interface MadeiraDao {

	void save(Madeira madeira);
	
	void update(Madeira madeira);
	
	void delete(Long id);
	
	Madeira findById(Long id);
	
	List<Madeira> findAll();
}
