package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public class ContaCorrente implements IConta{
	private int numconta;
	private double saldo;
	private double limite = 100.00;
	
	@Override
	public int getNumconta() {
		return numconta;
	}
	@Override
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	@Override
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public void geradorDeExtratos() {
		System.out.println("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite );
		
	}	
	@Override
	public void transfere(Conta destino , double valor) {
		destino.setSaldo(destino.getSaldo() - valor);
		this.saldo += valor;
	}
	@Override
	public void deposita (double valor) {
		this.setSaldo(getSaldo() + valor); 
		}
	@Override
	public void saca(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	@Override
	public void extrato() {
		System.out.println("numero da conta: " + numconta + " saldo " + saldo + " limite: " + limite );
	}
	@Override
	public void saldo() {
	System.out.println("saldo disponivel na conta : " + saldo + " limite do cheque especial: " + limite);	
	}
}