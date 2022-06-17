package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.RoleDao;
import com.sgam.domain.Role;

@Service
@Transactional(readOnly= true)
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDao dao;

	@Transactional(readOnly=false)
	@Override
	public void save(Role role) {
		dao.save(role);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void update(Role role) {
		dao.update(role);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Role findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}
}
