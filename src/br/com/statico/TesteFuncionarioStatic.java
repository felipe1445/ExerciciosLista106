package br.com.statico;

import br.com.escola.Funcionario;

public class TesteFuncionarioStatic {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();		
		
		//definindo dados para 2 funcionarios
		func1.setNomeFunc("Antenor");
		func1.setSalarioFunc(200);
		
		//imprimindo dados com salario normal
		System.out.println("Valores Padroes");
		func1.consultaDados();
	
		
		System.out.println("-------------------------------");
		System.out.println("salario com vale: " + (func1.getSalarioFunc()+Funcionario.getValeRefeicao())) ;
		System.out.println("valor do vale: "+ Funcionario.getValeRefeicao());		
		
		func1.reajustaValeRefeicao(80.00);
		System.out.println("vale refeição reajustado: "+Funcionario.getValeRefeicao());
	}

}
