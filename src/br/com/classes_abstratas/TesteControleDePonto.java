package br.com.classes_abstratas;

public class TesteControleDePonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Gerente gern = new Gerente(1,"joao",2000.00,20.0,"joao123","123456");
		
		gern.setCodigo(1);
		gern.setNome("joao1445");
		gern.setSenha("123");
		gern.setNome("Joao de sei la");
		
		Telefonista telf = new Telefonista(2,"maria",980.00,15.0,3);
		telf.setNome("Joana");
		telf.setCodigo(22);
		
		
		ControleDePonto cdp = new ControleDePonto();
		
		cdp.entradaFuncionario(gern);
		cdp.entradaFuncionario(telf);
		cdp.saidaFuncionario(gern);
		cdp.saidaFuncionario(telf);
	}

}
