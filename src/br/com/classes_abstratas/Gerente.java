package br.com.classes_abstratas;

public class Gerente extends Funcionario{
	private String nomeUsuario;
	private String senha;
	
	
	public Gerente(int codigo, String nome, double salarioFunc, double bonificacao, String nomeUsuario, String senha) {
		super(codigo, nome, salarioFunc, bonificacao);
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public void calculaBonificacao() {		
		this.setSalarioFunc(this.getSalarioFunc() * (1+ 10/100.0));
	}
		
}
