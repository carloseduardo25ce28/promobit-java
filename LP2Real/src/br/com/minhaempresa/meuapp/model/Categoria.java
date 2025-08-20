package br.com.minhaempresa.meuapp.model;

public enum Categoria {
	ALIMENTACAO,
	ELETRONICOS,
	VESTUARIO,
	CASA,
	SERVICO,
	COSMETICO,
	EDUCACAO;
	
	public void exibirEnum() {
		System.out.println("ALIMENTACAO,\r\n"
				+ "	ELETRONICOS,\r\n"
				+ "	VESTUARIO,\r\n"
				+ "	CASA,\r\n"
				+ "	SERVICO,\r\n"
				+ "	COSMETICO,\r\n"
				+ "	EDUCACAO;");
	}
}
