package br.com.contato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

	
	@GetMapping("/contatos")
	public String listar() {
		return "contatos";
	}
	
	
}
