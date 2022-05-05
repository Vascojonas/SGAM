package com.sgam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sgam.dao.UsuarioDao;
import com.sgam.domain.Usuario;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UsuarioDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  List<Usuario> usuario= dao.findByUsername(username);
		
	  if(usuario != null) {
		  
	  }else {
		  throw new UsernameNotFoundException("Usuário não encontrado com o nome "+ username);
	  }
	  
	  return null;
	}

}
