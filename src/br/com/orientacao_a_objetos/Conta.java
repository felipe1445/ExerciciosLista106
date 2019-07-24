package br.com.orientacao_a_objetos;

public class Conta {
	int numConta;
	double limite;
	double saldo;	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	public void consultaDados() {
		System.out.println("Numero Conta: " + this.numConta + " Saldo: " + this.saldo + " Limite: "+ this.limite);
	}
	
}
