package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.UsuarioDao;
import com.sgam.domain.Usuario;

@Service
@Transactional(readOnly= true)
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao dao;
	
	@Transactional(readOnly= false)
	@Override
	public void save(Usuario usuario) {
		dao.save(usuario);
	}
	
	@Transactional(readOnly= false)
	@Override
	public void update(Usuario usuario) {
		dao.update(usuario);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
