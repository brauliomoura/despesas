package br.com.impacta.springmvc.gerenciadordespesas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {
	private String descricao;
	private Categoria categoria;
	private LocalDate data;
	private BigDecimal valor;
	private String observacoes;
	
	public Despesa(String descricao, Categoria categoria, LocalDate data, double valor) {
		 this.setDescricao(descricao);
		 this.setCategoria(categoria);
		 this.setData(data);
		 this.setValor(new BigDecimal(valor));
	}
	
	public Despesa() {}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	@Override
	public String toString() {
		return "Despesa [descricao=" + descricao + ", categoria=" + categoria + ", data=" + data + ", valor=" + valor
				+ ", observacoes=" + observacoes + "]";
	}

}
