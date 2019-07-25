package br.com.orientacao_a_objetos;

public class Cliente {
	private String nomeCliente;
	
	
	public Cliente(String nomeCliente, int codCliente) {		
		this.nomeCliente = nomeCliente;
		this.codCliente = codCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	private int codCliente;
	


	
	
}
