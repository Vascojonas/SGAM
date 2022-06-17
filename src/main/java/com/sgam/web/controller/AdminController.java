package com.sgam.web.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sgam.dao.GestorDaoImpl;

import com.sgam.domain.Estabelecimento;
import com.sgam.domain.Funcionario;
import com.sgam.domain.Gestor;
import com.sgam.domain.Role;
import com.sgam.domain.Usuario;
import com.sgam.service.EstabelecimentoService;
import com.sgam.service.FuncionarioService;
import com.sgam.service.GestorService;
import com.sgam.service.RoleService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	GestorService gestorService;
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@Autowired
	EstabelecimentoService estabelecimentoService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	GestorDaoImpl gestorDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@GetMapping("gestores/listar")
	public String listar(Gestor gestor) {
		return "/gestores/listar";
	}
	
	@GetMapping("gestores/cadastrar")
	public String resgistrar(Gestor gestor) {
		return "gestores/cadastrar";
	}
	
	@PostMapping("gestores/salvar")
	public String salvar(Gestor gestor, RedirectAttributes attr) {
		Usuario u = gestor.getUsuario(); 
		String pwd = u.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		u.setPassword(encryptyPwd);
		Role roles= new Role();
		
		List<Role> list = new ArrayList<Role>();
		roles.setRole("ADMIN");
		list.add(roles);
		u.setRoles(list);
		gestorService.save(gestor);
		
		attr.addFlashAttribute("success", "Gestor adcionado com sucesso");
		return"redirect:/admin/gestores/cadastrar";
	}
	
	
	
	@GetMapping("funcionarios/cadastrar")
	public String funcionarioResgistrar(Funcionario funcionario) {
		return "funcionarios/cadastrar";
	}
	
	@GetMapping("funcionarios/listar")
	public String funcionarioListar(Funcionario funcionario) {
		return "funcionarios/listar";
	}
	
	@PostMapping("/funcionarios/salvar")
	public String funcionarioSalvar(Funcionario funcionario) {
		Usuario f = funcionario.getUsuario(); 
		String pwd = f.getPassword();
		String encryptyPwd = passwordEncoder.encode(pwd);
		f.setPassword(encryptyPwd);
		
		Role roles= new Role();
		List<Role> list = new ArrayList<Role>();
		roles.setRole("EMPLOYEE");
		list.add(roles);
		f.setRoles(list);
		
		funcionarioService.save(funcionario);		
		
		return"redirect:/admin/funcionarios/cadastrar";
	}
	
	@ModelAttribute("estabelecimentos")
	public List<Estabelecimento> listaEstabelecimentos(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetails user = (UserDetails)auth.getPrincipal();
		String username =user.getUsername();
		Gestor gestor = gestorDao.findByUsername(username).get(0);	
		return gestor.getEstabelecimentos();
	}
	
	
	
	@GetMapping("estabelecimentos/cadastrar")
	public String resgistrar(Estabelecimento estabelecimento) {
		
		return "estabelecimentos/cadastrar";
	}
	
	@PostMapping("/estabelecimentos/salvar")
	public String salvar(Estabelecimento est) {

	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	UserDetails user = (UserDetails)auth.getPrincipal();
	String username =user.getUsername();
	Gestor gestor = gestorDao.findByUsername(username).get(0);
	est.setGestor(gestor);
	
	  estabelecimentoService.save(est);
	   return"redirect:/admin/estabelecimentos/cadastrar";
	}
	
}
