package br.com.testes_escola;
import br.com.escola.Funcionario;
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.setNomeFunc("funcionario1");
		func1.setSalarioFunc(980.00);
		
		func2.setNomeFunc("funcionario2");
		func2.setSalarioFunc(970.00);
		
		//teste de metodo
		func1.aumentaSalario(200.00);
		func2.aumentaSalario(50.00);
		
		func1.consultaDados();
		func2.consultaDados();

	}

}
