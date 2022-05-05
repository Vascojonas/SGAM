package com.sgam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.sgam.domain.Estabelecimento;

@Controller
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {
	
	
	
	@GetMapping("/listar")
	public String listar(Estabelecimento estabelecimento) {
		return "estabelecimentos/listar";
	}
	
	@GetMapping("/cadastrar")
	public String resgistrar(Estabelecimento estabelecimento) {
		return "estabelecimentos/cadastrar";
	}
	
	
	@PostMapping("/salvar")
	public String salvar(Estabelecimento estabelecimento) {
		
		return"redirect:/estabelecimentos/cadastrar";
	}
}
