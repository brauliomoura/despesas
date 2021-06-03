package br.com.impacta.springmvc.gerenciadordespesas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Localidade {
	
	private String cep;
	
	@JsonProperty(value="address")
	private String endereco;
	@JsonProperty(value="district")
	private String bairro;
	@JsonProperty(value="city")
	private String cidade;
	@JsonProperty(value="state")
	private String estado;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
