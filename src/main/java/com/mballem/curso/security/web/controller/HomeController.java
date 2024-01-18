package com.mballem.curso.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
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
