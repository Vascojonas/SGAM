package com.sgam.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sgam.dao.UsuarioDao;
import com.sgam.domain.Usuario;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	UsuarioDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   
		List<Usuario> results = dao.findByUsername(username);
		
		CustomUserDetails userDetails = null;
	  if(!results.isEmpty()) {
		  
		  Usuario usuario = results.get(0);
		  
		  userDetails = new CustomUserDetails();
		  userDetails.setUser(usuario);
		  
	  }else {
		  throw new UsernameNotFoundException("Usuário não encontrado com o nome "+ username);
	  }
	  
	  return userDetails;
	}

}
