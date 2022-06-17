package com.sgam.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgam.dao.UsuarioDao;
import com.sgam.domain.Role;
import com.sgam.domain.Usuario;


@Controller
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	UsuarioDao dao;
	
	@GetMapping("validar")
	public String redirect(Authentication authentication) {
		String result="";
		
		UserDetails user = (UserDetails) authentication.getPrincipal();
		String username= user.getUsername();
		
	     Usuario usuario = dao.findByUsername(username).get(0);
		 List<Role> roles= usuario.getRoles();
	
		 
		 String userRole = roles.get(0).getRole();
		 
		System.out.println(userRole);
		
		
	// 1 =>admin 2=> cliente 3=>EDitor
		if(userRole.equals("ADMIN")) {
			result ="redirect:/admin/estabelecimentos/cadastrar";
		}else if(userRole.equals("EMPLOYEE")){
			result="redirect:/funcionario/madeiras/cadastrar";
		}else if(userRole.equals("USER")){
			result="redirect:/";
		}
		return result;
	}
}
