package com.sgam.service;

import java.util.List;

import com.sgam.domain.Cliente;

public interface ClienteService {
	
    void save(Cliente cliente);
	
	void update(Cliente cliente);
	
	void delete(Long id);
	
	Cliente findById(Long id);
	
	List<Cliente> findAll();
}
