package com.sgam.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgam.domain.Estabelecimento;
import com.sgam.domain.Funcionario;
import com.sgam.domain.Gestor;
import com.sgam.domain.Usuario;
import com.sgam.service.EstabelecimentoService;
import com.sgam.service.FuncionarioService;
import com.sgam.service.GestorService;


@Controller
@RequestMapping("/gestores")
public class GestorController {
	
	@Autowired
	GestorService gestorService;
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@Autowired
	EstabelecimentoService estabelecimentoService;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/listar")
	public String listar(Gestor gestor) {
		return "/gestores/listar";
	}
	
	@GetMapping("/cadastrar")
	public String resgistrar(Gestor gestor) {
		return "/gestores/cadastrar";
	}
	
	@PostMapping("/salvar/gestor")
	public String salvar(Gestor gestor) {
		Usuario u = gestor.getUsuario(); 
		String pwd = u.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		u.setPassword(encryptyPwd);
		
		gestorService.save(gestor);
		return"redirect:/gestores/cadastrar";
	}
	
	@PostMapping("/salvar/funcionario")
	public String salvar(Funcionario funcionario) {
		Usuario f = funcionario.getUsuario(); 
		String pwd = f.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		f.setPassword(encryptyPwd);
		
		funcionarioService.save(funcionario);
		return"redirect:/funcionarios/cadastrar";
	}
	
	@PostMapping("/salvar/estabelecimento")
	public String salvar(Estabelecimento est) {
		estabelecimentoService.save(est);
		return"redirect:/funcionarios/cadastrar";
	}
	
	
}
