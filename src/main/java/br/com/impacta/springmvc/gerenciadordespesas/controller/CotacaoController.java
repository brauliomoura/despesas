package br.com.impacta.springmvc.gerenciadordespesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.springmvc.gerenciadordespesas.model.Cotacao;

@Controller
@RequestMapping("/despesa/util/cotacao")
public class CotacaoController {
	
	@GetMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("exibe-cotacao");
		
		mv.addObject("cotacao", new Cotacao());
		
		return mv;
	}
	
	@PostMapping
	public ModelAndView getCotacao(@ModelAttribute Cotacao cotacao) {
		ModelAndView mv = new ModelAndView("exibe-cotacao");
		
		RestTemplate restTemplate = new RestTemplate();
		String cotacaoUrl = "https://economia.awesomeapi.com.br";
		Cotacao[] cotacoes = restTemplate.getForObject(cotacaoUrl + "/" + cotacao.getMoeda().getNome(), 
														Cotacao[].class);
		
		if(cotacoes.length > 0) {
			Cotacao retCotacao = cotacoes[0];
			retCotacao.setMoeda(cotacao.getMoeda());
			mv.addObject("cotacao", retCotacao);
		}
		
		return mv;
		
	}
	
	
	
	

}
