package br.com.impacta.springmvc.gerenciadordespesas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.springmvc.gerenciadordespesas.model.Categoria;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;
import br.com.impacta.springmvc.gerenciadordespesas.repositorio.DespesaRepository;

@RestController
@RequestMapping("/api/despesa")
public class APIDespesasController {
	
	@Autowired
	DespesaRepository repo;
	
	@GetMapping("/categoria")
	public Categoria[] listCategorias() {
		return Categoria.values();
	}
	
	@GetMapping()
	public List<Despesa> getDespesas(){
		return repo.findAll();
	}
	
	@GetMapping("/{codigo}")
	public @ResponseBody Despesa getDespesaById(@PathVariable Long codigo) {
		
		Despesa despesa = repo.getById(codigo);
		
		return despesa;
	}
	
	@PostMapping()
	public void despesa(@RequestBody Despesa despesa){
		repo.save(despesa);
	}
	
	@GetMapping("/categoria/{categoria}")
	public List<Despesa> getDespesasPorCategoria(@PathVariable Categoria categoria) {
		
		List<Despesa> despesas = repo.findByCategoria(categoria);
		return despesas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

