package br.com.classes_abstratas;

public class Telefonista extends Funcionario{
	int ramal;

	public Telefonista(int codigo, String nome, double salarioFunc, double bonificacao, int ramal) {
		super(codigo, nome, salarioFunc, bonificacao);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public void calculaBonificacao() {		
		this.setSalarioFunc(this.getSalarioFunc() * (1+ 10/100.0));
	}
}
