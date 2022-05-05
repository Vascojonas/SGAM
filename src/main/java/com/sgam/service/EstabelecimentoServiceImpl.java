package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgam.dao.EstabelecimentoDao;
import com.sgam.domain.Estabelecimento;

@Service
@Transactional(readOnly= true)
public class EstabelecimentoServiceImpl implements EstabelecimentoService {
	@Autowired
	EstabelecimentoDao dao;
	
	@Transactional(readOnly=false)
	@Override
	public void save(Estabelecimento estabelecimento) {
		dao.save(estabelecimento);
		
	}

	@Override
	public void update(Estabelecimento estabelecimento) {
		dao.update(estabelecimento);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Estabelecimento findById(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Estabelecimento> findAll() {
		
		return dao.findAll();
	}

}
