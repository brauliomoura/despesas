package br.com.impacta.springmvc.gerenciadordespesas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.impacta.springmvc.gerenciadordespesas.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa,Long>{
	//nada aqui...
}
