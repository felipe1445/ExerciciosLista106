package br.com.escola;

public class Funcionario {
	String nomeFunc;
	double salarioFunc;
	
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
	
	public void consultaDados() {
		System.out.println("Nome: " + this.nomeFunc+ " Salario: " +this.salarioFunc);
	}
}
