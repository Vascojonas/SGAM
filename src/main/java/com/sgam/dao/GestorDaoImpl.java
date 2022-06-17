package com.sgam.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sgam.domain.Gestor;


@Repository
public class GestorDaoImpl extends AbstractDao<Gestor, Long> implements GestorDao {

	@Override
	public List<Gestor> findByUsername(String username) {
		TypedQuery<Gestor> query= getEntityManager()
				.createQuery("select g from Gestor g "
						+ "left join Usuario u "
						+ "on u.id= g.usuario "
						+ "where u.username= :username", Gestor.class);
		query.setParameter("username", username);
		return query.getResultList();
	}
	
	
}
