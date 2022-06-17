package com.sgam.dao;


import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sgam.domain.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long>  implements UsuarioDao {

	@Override
	public List<Usuario> findByUsername(String username) {
		TypedQuery<Usuario> query= getEntityManager()
				.createQuery("select u from Usuario u where u.username= :username", Usuario.class);
		query.setParameter("username", username);
		return query.getResultList();
	}

	

}
