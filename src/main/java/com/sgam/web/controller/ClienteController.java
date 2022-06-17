package com.sgam.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgam.domain.Cliente;
import com.sgam.domain.Role;
import com.sgam.domain.Usuario;
import com.sgam.service.ClienteService;
import com.sgam.service.RoleService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/registrar")
	public String resgistrar(Cliente cliente) {
		return "clientes/registrar";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cliente cliente) {

		Usuario usuario = cliente.getUsuario(); 
		String pwd = usuario.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		
		usuario.setPassword(encryptyPwd);
		Role roles= new Role();
		List<Role> list = new ArrayList<Role>();
		roles.setRole("USER");
		list.add(roles);
		
		usuario.setRoles(list);
		clienteService.save(cliente);
		
		return"redirect:/clientes/registrar";
	}
}
