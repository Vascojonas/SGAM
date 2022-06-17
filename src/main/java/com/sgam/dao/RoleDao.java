package com.sgam.dao;

import java.util.List;

import com.sgam.domain.Role;

public interface RoleDao {
void save(Role role);
	
	void update(Role role);
	
	void delete(Long id);
	
	Role findById(Long id);
	
	List<Role> findAll();
}
