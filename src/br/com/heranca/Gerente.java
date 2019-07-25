package br.com.heranca;

public class Gerente extends Funcionario{	
	private String nomeUsuario;
	private String senha;	
	
	
	public Gerente(String nomeFunc, double salarioFunc, String nomeUsuario, String senha) {
		super(nomeFunc, salarioFunc);		
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;		
	}
	//metodo com taxa fixa
	public void aumentaSalario() {
		this.setSalarioFunc(this.getSalarioFunc() *1.100); 		
	}
	//meto com taxa variavel
	public void aumentaSalario(double taxa) {		
		this.setSalarioFunc(this.getSalarioFunc() *1+taxa/100.00); 
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
	public void mostraDados() {
		System.out.println("\nNome do funcionario: "+this.getNomeFunc() + "\nSalario: R$" 
				+ String.valueOf(this.getSalarioFunc())
					+ "\nBonificação: " +this.getBonificacao() +"%"
						+ "\nNome Usuario: " + this.getNomeUsuario() + "\nSenha: "+this.getSenha());		
	}
	@Override
	public void calculaBonificacao() {
		this.setBonificacao(20);
		this.setSalarioFunc(this.getSalarioFunc() * (1+this.getBonificacao()/100));
	}
}
