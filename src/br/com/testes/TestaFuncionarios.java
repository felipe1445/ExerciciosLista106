package br.com.testes;

import br.com.heranca.Funcionario;
import br.com.heranca.Gerente;
import br.com.heranca.Secretaria;
import br.com.heranca.Telefonista;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Funcionario joao = new Gerente("Joao",1500.00,"Joao1445","joao123");
		Funcionario maria = new Secretaria("Maria",1200.00, 20);
		Funcionario joana = new Telefonista("Joana", 1200.00, 6);		
		
		System.out.println("salario do gerente: "+joao.getSalarioFunc());
		joao.calculaBonificacao();
		System.out.println("salario do gerente com bonifica��o: "+joao.getSalarioFunc());
		System.out.println("salario da Secretaria: "+maria.getSalarioFunc());
		maria.calculaBonificacao();
		System.out.println("salario da Secretaria com bonifica��o: "+maria.getSalarioFunc());
		System.out.println("salario da Telefonista: "+joana.getSalarioFunc());
		joana.calculaBonificacao();
		System.out.println("salario da Telefonista com bonifica��o: "+joana.getSalarioFunc());
		
		
		joao.mostraDados();
		maria.mostraDados();
		joana.mostraDados();
	}

}
