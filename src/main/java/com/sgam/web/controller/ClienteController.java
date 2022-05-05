package com.sgam.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgam.domain.Cliente;
import com.sgam.domain.Usuario;
import com.sgam.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/registrar")
	public String resgistrar(Cliente cliente) {
		return "clientes/registrar";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cliente cliente) {
		Usuario c = cliente.getUsuario(); 
		String pwd = c.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		c.setPassword(encryptyPwd);
		
		clienteService.save(cliente);
		return"redirect:/clientes/registrar";
	}
}
