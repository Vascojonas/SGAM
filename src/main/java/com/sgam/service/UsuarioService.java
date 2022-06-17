package com.sgam.service;

import java.util.List;

import com.sgam.domain.Usuario;

public interface UsuarioService {
void save(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(Long id);
	
	Usuario findById(Long id);
	
	List<Usuario> findAll();
}
