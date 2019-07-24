package br.com.testes;
import br.com.orientacao_a_objetos.Agencia;
public class TesteAgencia {

	public static void main(String[] args) {
		
		Agencia agencia1 =  new Agencia();
		Agencia agencia2 =  new Agencia();
		
		
		agencia1.setNumAgencia(1);
		agencia2.setNumAgencia(2);
		
		System.out.println("Agencia 1: " +agencia1.getNumAgencia());
		System.out.println("Agencia 2: " +agencia2.getNumAgencia());
		
	}

}
