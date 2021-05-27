package br.com.impacta.springmvc.gerenciadordespesas.model;

public enum Categoria {
	ALIMENTACAO("Alimentação"), CUIDADOS_PESSOAIS("Cuidados Pessoais"), DIVERSOS("Diversos"), 
	DOACOES("Doações"),	EDUCACAO("Educação"), LAZER("Lazer"), MORADIA("Moradia"), SAUDE("Saúde"), 
	PESSOAL("Pessoal"),	TRANSPORTE("Transporte"), VEICULO("Veículo"), VESTUARIO("Vestuário"), 
	VIAGEM("Viagem");

	private String nome;

	private Categoria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
