package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.MadeiraDao;
import com.sgam.domain.Madeira;

@Service
@Transactional(readOnly= true)
public class MadeiraServiceImpl implements MadeiraService {
	
	@Autowired
	private MadeiraDao dao;
	@Transactional(readOnly=false)
	@Override
	public void save(Madeira madeira) {
		dao.save(madeira);
		
	}
	
	@Transactional(readOnly=false)
	@Override
	public void update(Madeira madeira) {
		dao.update(madeira);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Madeira findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Madeira> findAll() {
		return dao.findAll();
	}

}
