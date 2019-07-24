package br.com.testes;

import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;

public class TesteMetodoConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agencia agencia1 =  new Agencia(11111);
		Agencia agencia2 =  new Agencia(2222222);
				
		Conta conta1 = new Conta(agencia1);
		Conta conta2 = new Conta(agencia2);
		
		conta1.setNumConta(1);
		conta1.setSaldo(200.00);
		
		conta2.setNumConta(2);
		conta2.setSaldo(222.00);	
		
		//saldo antes da transferencia
		System.out.println("saldo conta 1: "+ conta1.getSaldo());
		System.out.println("saldo conta 2: "+ conta2.getSaldo());
		
		conta1.transferirValor(conta2, 200.00);
		System.out.println("transferindo valor...");		
		System.out.println("saldo conta 1: "+ conta1.getSaldo());
		System.out.println("saldo conta 2: "+ conta2.getSaldo());
		

	}

}
