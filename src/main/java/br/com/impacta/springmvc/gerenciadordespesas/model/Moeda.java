package br.com.impacta.springmvc.gerenciadordespesas.model;

public enum Moeda {
		
	USD_BRL("USD-BRL", "Dólar Comercial"),
	USDT_BRL("USDT-BRL", "Dólar Turismo"),
	CAD_BRL("CAD-BRL", "Dólar Canadense"),
	AUD_BRL("AUD-BRL", "Dólar Australiano"),
	EUR_BRL("EUR-BRL" , "Euro Comercial"),
	GBP_BRL ("GBP-BRL", "Libra Esterlina"),
	ARS_BRL ("ARS-BRL", "Peso Argentino"),
	JPY_BRL ("JPY-BRL", "Iene Comercial"),
	CHF_BRL ("CHF-BRL", "Franco Suiço"),
	CNY_BRL ("CNY-BRL", "Yuan Chinês"),
	YLS_BRL ("YLS-BRL", "Shekel Comercial"),
	BTC_BRL ("BTC-BRL", "Bitcoin Comercial"),
	LTC_BRL ("LTC-BRL", "Litecoin Comercial"),
	ETH_BRL ("ETH-BRL", "Ethereum Comercial"),
	XRP_BRL ("XRP-BRL", "Ripple Comercial");

	private String nome;
	private String descricao;
	
	private Moeda(String nome, String descricao) {
		this.setNome(nome);
		this.setDescricao(descricao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	

}
