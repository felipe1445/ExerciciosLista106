package br.com.testes;
import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;
public class TesteContaEAgencia {

	public static void main(String[] args) {
		
		
		
		Agencia agencia1 =  new Agencia(11111);
		Agencia agencia2 =  new Agencia(2222222);
				
		Conta conta1 = new Conta(agencia1);
		Conta conta2 = new Conta(agencia2);
		
		conta1.setNumConta(1);
		conta1.setSaldo(200.00);
		
		conta2.setNumConta(2);
		conta2.setSaldo(222.00);	
				
		
		//teste de metodos
		conta1.deposita(200.00);
		conta2.saca(50.00);
		
		System.out.println("conta: " +conta1.getNumConta());
		conta1.consultaSaldo();
		System.out.println(conta1.imprimeExtrato(20));
		
		System.out.println("conta: " +conta2.getNumConta());
		conta2.consultaSaldo();
		System.out.println(conta2.imprimeExtrato(10));
	}

}
