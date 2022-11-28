package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	// poderia ser também HttpSerlvetRequest ( uma camada mais de baixo nível )
	public String hello(Model model) {
		model.addAttribute("nome", "mundo");
		return "hello";
	}
}
