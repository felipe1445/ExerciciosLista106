package br.com.orientacao_a_objetos;

import java.util.Random;

public class Conta {
	private int numConta;
	private double limite = 100.00;
	private double saldo;
	private Agencia agencia;
	static int contadorContas = 0;	
	
	public Conta (Agencia agencia) {		
		this.agencia = agencia;
		contadorContas++;		
		this.numConta = new Random().nextInt(9999999) + contadorContas;
	}

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

	public static int getContadorContas() {
		return contadorContas;
	}

	public static void setContadorContas(int contadorContas) {
		Conta.contadorContas = contadorContas;
	}

	public void consultaDados() {
		System.out.println("Numero Conta: " + this.numConta + " Saldo: " 
				+ this.saldo + " Limite: "+ this.limite+ " Agencia: "+this.agencia.getNumAgencia());
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
	
	public static void zeraContador() {
		System.out.println("zerando contas...Contas criadas ate o momento: "+ contadorContas);
		contadorContas=0;	
	}
	
}
