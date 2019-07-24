package br.com.testes;
import br.com.orientacao_a_objetos.Agencia;
import br.com.orientacao_a_objetos.Conta;
public class TesteConta {

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
		
		conta1.consultaDados();
		conta2.consultaDados();
	}

}
