package br.com.classes_abstratas;

import br.com.heranca.Secretaria;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Funcionario joao = new Gerente(1,"joao",2000.00,20.0,"joao123","123456");
		Funcionario maria = new Telefonista(2,"maria",980.00,15.0,3);

		
		System.out.println("salario do gerente: "+joao.getSalarioFunc());
		joao.calculaBonificacao();
		System.out.println("salario do gerente com bonificação: "+joao.getSalarioFunc());
		
		
		System.out.println("salario da Telefonista: "+maria.getSalarioFunc());
		maria.calculaBonificacao();
		System.out.println("salario da Telefonista com bonificação: "+maria.getSalarioFunc());
		
		
		joao.mostraDados();
		maria.mostraDados();
		
	}

}
