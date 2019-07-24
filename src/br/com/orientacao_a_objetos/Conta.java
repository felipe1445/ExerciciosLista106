package br.com.orientacao_a_objetos;

public class Conta {
	int numConta;
	double limite = 100.00;
	double saldo;
	Agencia agencia;

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
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void consultaDados() {
		System.out.println("Numero Conta: " + this.numConta + " Saldo: " 
				+ this.saldo + " Limite: "+ this.limite+ " Agencia: "+this.agencia.numAgencia);
	}
	
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	
	public void saca(double valor) {
		this.saldo-=valor;
	}
	
	public void consultaSaldo() {
		System.out.println("saldo com limite: "+ (this.saldo+this.limite));
	}
	
	public void transferirValor( Conta contaDestino, double valor ) {
		 this.saldo -= valor ;
		 contaDestino.saldo += valor;
	}
	
	public String imprimeExtrato(int dias) {
		//codigo
		return "extrato dos ultimos "+ String.valueOf(dias) + " dias";			
		 
	}
	
}
