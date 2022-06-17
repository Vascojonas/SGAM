package com.sgam.service;

import java.util.List;

import com.sgam.domain.Role;

public interface RoleService {
	
	void save(Role role);
	
	void update(Role role);
	
	void delete(Long id);
	
	Role findById(Long id);
	
	List<Role> findAll();
}
