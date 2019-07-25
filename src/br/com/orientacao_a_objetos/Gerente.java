package br.com.orientacao_a_objetos;

public class Gerente {
	private String nomeGerente;
	private double salarioGerente;
	
	
	public String getNomeGerente() {
		return nomeGerente;
	}
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	public double getSalarioGerente() {
		return salarioGerente;
	}
	public void setSalarioGerente(double salarioGerente) {
		this.salarioGerente = salarioGerente;
	}
	
	public void aumentaSalarioTaxaFixa() {
		this.salarioGerente*=1.10;
	}
	public void aumentaSalarioTaxaVariavel(double porcentagem) {
		this.salarioGerente*= (1+(porcentagem/100));
	}
	
	
}
