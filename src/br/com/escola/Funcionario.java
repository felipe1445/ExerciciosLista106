package br.com.escola;

public class Funcionario {
	private String nomeFunc;
	private double salarioFunc= 1000.00;
	private static double valeRefeicao = 20.00;	
	private double bonificacao = 10.0;

	
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public static double getValeRefeicao() {
		return valeRefeicao;
	}
	public static void setValeRefeicao(double valeRefeicao) {
		Funcionario.valeRefeicao = valeRefeicao;
	}
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void consultaDados() {
		System.out.println("\nNome do funcionario: "+this.nomeFunc + "\nSalario: R$" + String.valueOf(this.salarioFunc)
		+ "\nBonifica��o: " +this.bonificacao +"%");		
	}
	
	public void aumentaSalario(double valor) {
		this.salarioFunc+=valor;
	}
	
	public void reajustaValeRefeicao(double taxa) {
		valeRefeicao *=  1+ taxa/100.00;
	}	
	
	public void calculaBonificacao() {
		this.salarioFunc*= 1+bonificacao/100;
	}

	
}
