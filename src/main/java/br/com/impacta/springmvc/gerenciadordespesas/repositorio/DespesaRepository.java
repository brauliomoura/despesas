package br.com.impacta.springmvc.gerenciadordespesas.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.springmvc.gerenciadordespesas.model.Categoria;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa,Long>{
	//nada aqui...
	public List<Despesa> findByDescricaoContaining(String descricao);

	public List<Despesa> findByCategoria(Categoria categoria);
}
