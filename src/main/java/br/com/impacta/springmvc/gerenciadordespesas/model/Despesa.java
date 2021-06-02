package br.com.impacta.springmvc.gerenciadordespesas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Despesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotEmpty(message = "Descrição deve ser preenchida com algum texto!")
	private String descricao;

	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	@Column(columnDefinition = "DATE")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull(message="Data deve ser informada!")
	private LocalDate data;

	@NumberFormat(pattern="#,##0.00")
	@NotNull(message= "Algum valor deve ser informado!")
	@DecimalMin(value="1.00", message="Valor mínimo deve ser maior ou igual a 1,00")
	private BigDecimal valor;

	private String observacoes;

	public Despesa(String descricao, Categoria categoria, LocalDate data, double valor) {
		this.setDescricao(descricao);
		//this.setCategoria(categoria);
		this.setData(data);
		this.setValor(new BigDecimal(valor));
	}

	public Despesa() {
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesa other = (Despesa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


}
