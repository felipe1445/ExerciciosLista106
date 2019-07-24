package br.com.testes;
import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;
public class TesteContaEAgencia {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		Agencia agencia1 =  new Agencia();
		Agencia agencia2 =  new Agencia();
				
		agencia1.setNumAgencia(1111);
		agencia2.setNumAgencia(2222);		
		
		conta1.setNumConta(1);
		conta1.setSaldo(200.00);
		
		conta2.setNumConta(2);
		conta2.setSaldo(222.00);	
		
		//teste relacionamento
		conta1.setAgencia(agencia1);
		conta2.setAgencia(agencia2);			
		
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
