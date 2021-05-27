package br.com.impacta.springmvc.gerenciadordespesas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repositorio.DespesaRepository;

@Controller
@RequestMapping("/despesa")
public class DespesaController {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("cadastro-despesa");
		mv.addObject("despesa", new Despesa());
		
		return mv;
	}
	
	@RequestMapping("/salvar")
	public ModelAndView salvar(@ModelAttribute Despesa despesa) {
		
		ModelAndView mv = new ModelAndView("cadastro-despesa");
		
		despesaRepository.save(despesa);
		mv.addObject("mensagem", "Despesa registrada com sucesso!");
		mv.addObject("despesa", new Despesa());
		
		return mv;
	}
	

}
