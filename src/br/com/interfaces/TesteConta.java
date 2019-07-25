package br.com.interfaces;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cpp = new ContaPoupanca();
		
		cc.setNumconta(200);
		cc.deposita(500.00);
		
		cpp.setNumconta(300);
		cpp.deposita(800.00);
		
		cc.geradorDeExtratos();
		cpp.geradorDeExtratos();

	}

}
