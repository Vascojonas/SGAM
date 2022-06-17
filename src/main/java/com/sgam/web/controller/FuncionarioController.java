package com.sgam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sgam.domain.Madeira;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@GetMapping("/madeiras/cadastrar")
	public String cadastrarMadeiras(Madeira madeira) {
		return"madeiras/cadastrar";
	}
	
	@GetMapping("/madeiras/listar")
	public String listarMadeiras() {
		return"madeiras/listar";
	}
	
	@PostMapping("/madeiras/salvar")
	public String cadastrarMadeira(Madeira madeira,@RequestParam()  MultipartFile imageFile) {
		
		
		return "redirect:/funcionario/madeiras/cadastrar";
	}
}
