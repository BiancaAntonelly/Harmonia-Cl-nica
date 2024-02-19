package com.mballem.curso.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@GetMapping({"/", "/home"})
	public String home() {
		return "home";
	}

	@GetMapping({"/login"})
	public String login() {
		return "login";
	}

	@GetMapping({"/login--erro"})
	public String loginError(ModelMap model) {
		model.addAttribute("alerta", "erro");
		model.addAttribute("titulo", "Credenciais inválidas!");
		model.addAttribute("texto", "Login ou senha incorretos, tente novamente.");
		model.addAttribute("subtexto", "Acesso permitido apenas para cadastros já ativados.");
		return "login";
	}

	@GetMapping({"/acesso-negado"})
	public String acessoNegado(ModelMap model, HttpServletResponse response) {
		model.addAttribute("status", response.getStatus());
		model.addAttribute("error", "Acesso Negado!");
		model.addAttribute("message", "Você não tem permissão para acessar esta área ou realizar esta ação.");
		return "error";
	}


	@GetMapping("/HomeAgendamentos")
	public String homeAgendamentos() {
		return "HomeAgendamentos";
	}

	@GetMapping("/HomeMedicina")
	public String HomeMedicina() {
		return "HomeMedicina";
	}
	@GetMapping("/HomeNutricao")
	public String homeNutricao() {
		return "HomeNutricao";
	}
	@GetMapping("/HomeFisioterapia")
	public String homeFisioterapia() {
		return "HomeFisioterapia";
	}
	@GetMapping("/HomePsicologia")
	public String homePsicologia() {
		return "HomePsicologia";
	}
	@GetMapping("/HomeMedicinaChinesa")
	public String medicinicaChinesa() {
		return "MedicinicaChinesa";
	}
}
