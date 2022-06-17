package com.sgam.dao;

import java.util.List;

import com.sgam.domain.Usuario;



public interface UsuarioDao {

void save(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(Long id);
	
	Usuario findById(Long id);
	
	List<Usuario> findByUsername(String username);
	
	List<Usuario> findAll();
}

