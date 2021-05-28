package br.com.impacta.springmvc.gerenciadordespesas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repositorio.DespesaRepository;

@Controller
@RequestMapping("/despesa")
public class DespesaController {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@PostMapping("/{codigo}")
	public String excluir(@PathVariable Long codigo) {
		despesaRepository.deleteById(codigo);
		return "redirect:/despesa";
	}
	
	@RequestMapping("/form/{codigo}")
	public String edite(@PathVariable Long codigo, Model model) {
		Despesa despesa = despesaRepository.getById(codigo);
		model.addAttribute("despesa",despesa);
		
		return "cadastro-despesa";
	}
	
	@RequestMapping("/salvar")
	public ModelAndView salvar(@Valid @ModelAttribute Despesa despesa, Errors erros) {
		
		ModelAndView mv = new ModelAndView("cadastro-despesa");
		
		if(erros.hasErrors()) {
			return mv;			
		}
		
		despesaRepository.save(despesa);
		mv.addObject("mensagem", "Despesa registrada com sucesso!");
		mv.addObject("despesa", new Despesa());
		
		return mv;
	}

	
	@GetMapping
	public ModelAndView despesas() {
		ModelAndView mv = new ModelAndView("listagem-despesas");
		
		List<Despesa> despesas = despesaRepository.findAll();
						
		mv.addObject("despesas",despesas);
		
		return mv;
		
	}
	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("cadastro-despesa");
		mv.addObject("despesa", new Despesa());
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
