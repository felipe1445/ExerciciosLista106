package br.com.testes;
import br.com.orientacao_a_objetos.Gerente;
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNomeGerente("gerente1");
		gerente.setSalarioGerente(1000.00);
		
		Gerente gerente2 = new Gerente();
		gerente2.setNomeGerente("gerente2");
		gerente2.setSalarioGerente(1000.00);
		
		
		gerente.aumentaSalarioTaxaFixa();		
		System.out.println("Salario gerente 1: "+gerente.getSalarioGerente());		
		
		gerente2.aumentaSalarioTaxaVariavel(20);
		System.out.println("Salario gerente 2: "+gerente2.getSalarioGerente());

	}

}
