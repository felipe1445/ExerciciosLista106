package br.com.interfaces;

import br.com.orientacao_a_objetos.Conta;

public interface IConta {
	public int getNumconta();

	public void setNumconta(int numconta);

	public double getSaldo();

	public void setSaldo(double saldo);

	public void geradorDeExtratos();

	public void transfere(Conta destino, double saldo);

	public void deposita(double valor);

	public void saca(double valor);

	public void extrato();

	public void saldo();

}