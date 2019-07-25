package br.com.classes_abstratas;


public abstract class Funcionario {
	private int codigo;
	private String nome;
	private double salarioFunc;
	private double bonificacao = 10.00;

	public Funcionario(int codigo, String nome, double salarioFunc, double bonificacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salarioFunc = salarioFunc;
		this.bonificacao = bonificacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void mostraDados() {
		System.out.println("\nNome do funcionario: "+this.nome + "\nSalario: R$" + String.valueOf(this.salarioFunc)
		+ "\nBonificação: " +this.bonificacao +"%");		
	}

	public abstract void calculaBonificacao();
}
