package com.sgam.dao;


import java.util.List;


import org.springframework.stereotype.Repository;

import com.sgam.domain.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long>  implements UsuarioDao {

	@Override
	public List<Usuario> findByUsername(String username) {
		
		return createQuery("select u from usuarios u where u.username=?1", username);
	}
	

}
