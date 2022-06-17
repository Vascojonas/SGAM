package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.ClienteDao;
import com.sgam.domain.Cliente;

@Service
@Transactional(readOnly= true)
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao dao;
	
	@Transactional(readOnly=false)
	@Override
	public void save(Cliente cliente) {
		dao.save(cliente);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void update(Cliente cliente) {
		dao.update(cliente);
		
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
