package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public class ContaPoupanca implements IConta {
	private int numconta = 0;
	private double saldo = 0;
	
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
	@Override
	public void geradorDeExtratos() {
		System.out.println("numero da conta: " + numconta + " saldo " + saldo);
	}
	@Override
	public void transfere(Conta conta , double saldo) {
		conta.setSaldo(conta.getSaldo() - saldo);
		this.saldo = saldo;
	}
	@Override
	public void deposita(double valor){
		this.setSaldo(this.getSaldo() + valor); 
	}
	@Override
	public void saca(double valor) {
	   this.setSaldo(this.getSaldo() - valor);
	}
	@Override
	public void extrato() {
		System.out.println("numero da conta: " + numconta + " saldo " + saldo);
	}
	@Override
	public void saldo() {
		System.out.println("saldo disponivel na conta : " + saldo);	
	}	
	
	
}