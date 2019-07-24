package br.com.orientacao_a_objetos;

public class CartaoDeCredito {
	int numCartaoCred;
	String dataValCartaoCred;
	Cliente cliente;	
	
	public CartaoDeCredito(int numCartaoCred, String dataValCartaoCred) {		
		this.numCartaoCred = numCartaoCred;
		this.dataValCartaoCred = dataValCartaoCred;
	}
	
	public int getNumCartaoCred() {
		return numCartaoCred;
	}
	public void setNumCartaoCred(int numCartaoCred) {
		this.numCartaoCred = numCartaoCred;
	}
	public String getDataValCartaoCred() {
		return dataValCartaoCred;
	}
	public void setDataValCartaoCred(String dataValCartaoCred) {
		this.dataValCartaoCred = dataValCartaoCred;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void consultaDados() {
		System.out.println("Numero Cartão: "+ this.numCartaoCred + "\nData de Validade: "+this.dataValCartaoCred+ "\nCliente: "+this.cliente.nomeCliente);
	}
	
	
	
}
