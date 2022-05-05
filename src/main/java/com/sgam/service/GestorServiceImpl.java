package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.GestorDao;
import com.sgam.domain.Gestor;


@Service
@Transactional(readOnly= true)
public class GestorServiceImpl implements GestorService {

	@Autowired
	private GestorDao gestorDao;
	
	@Transactional(readOnly=false)
	@Override
	public void save(Gestor gestor) {
		gestorDao.save(gestor);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Gestor gestor) {
		gestorDao.update(gestor);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Long id) {
		gestorDao.delete(id);
		
	}

	@Override
	public Gestor findById(Long id) {
	
		return gestorDao.findById(id);
	}

	@Override
	public List<Gestor> findAll() {
		return gestorDao.findAll();
	}

}
