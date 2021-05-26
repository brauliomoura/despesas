package br.com.impacta.springmvc.gerenciadordespesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;

@Controller
@RequestMapping("/despesa")
public class DespesaController {
	
	@RequestMapping("/form")
	public String form(Model model) {
		model.addAttribute("despesa", new Despesa());
		return "cadastro-despesa";
	}
	
	@RequestMapping("/salvar")
	public String form(@ModelAttribute Despesa despesa) {
		System.out.println(despesa);
		
		return "cadastro-despesa";
	}
	

}
