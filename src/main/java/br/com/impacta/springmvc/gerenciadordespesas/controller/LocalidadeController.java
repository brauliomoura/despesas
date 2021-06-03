package br.com.impacta.springmvc.gerenciadordespesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.com.impacta.springmvc.gerenciadordespesas.model.Localidade;

@Controller
@RequestMapping("/despesa/util/cep")
public class LocalidadeController {
	
	@GetMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("consulta-cep");
		mv.addObject("localidade", new Localidade());

		return mv;
	}
	
	@PostMapping
	public ModelAndView consultaCep(@ModelAttribute Localidade localidade) {
		ModelAndView mv = new ModelAndView("consulta-cep");
		RestTemplate restTemplate = new RestTemplate();
		String cepUrl = "https://cep.awesomeapi.com.br/json/";
		Localidade local = restTemplate.getForObject(cepUrl + localidade.getCep(), 
														Localidade.class);
		if(local != null) {
			mv.addObject("localidade", local);
		}
		
		return mv;
	}

}
