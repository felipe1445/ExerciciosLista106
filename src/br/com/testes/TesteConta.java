package br.com.testes;
import br.com.orientacao_a_objetos.Conta;
public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.setNumConta(1);
		conta1.setSaldo(200.00);
		conta1.setLimite(150.00);
		
		conta2.setNumConta(2);
		conta2.setSaldo(222.00);
		conta2.setLimite(111.00);
		
		conta1.consultaDados();
		conta2.consultaDados();
	}

}
