package com.sgam.service;

import java.util.List;

import com.sgam.domain.Funcionario;

public interface FuncionarioService {
	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

}
