package br.com.testes;
import br.com.orientacao_a_objetos.CartaoDeCredito;
public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(12345, "25/07/2050");
		
		CartaoDeCredito cartao2 = new CartaoDeCredito(22222, "20/08/2040");
		
		cartao1.setNumCartaoCred(111111);
		cartao1.setDataValCartaoCred("22/02/2222");
		
		cartao2.setNumCartaoCred(33333);
		cartao2.setDataValCartaoCred("11/01/2044");
		
		
		cartao1.consultaDados();
		cartao2.consultaDados();
		

	}

}
