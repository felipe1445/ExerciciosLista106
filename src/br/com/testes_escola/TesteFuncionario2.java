package br.com.testes_escola;
import Util.Teclado;
import br.com.escola.Funcionario;
public class TesteFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		boolean verifica = true;

		funcionario1.setNomeFunc(Teclado.lerTexto("digite o nome: "));
		while (verifica) {
			int auxiliar = Teclado.lerInt("o que vc quer fazer: consultar(1) alterar(2) sair(3)");
			if (auxiliar == 1) {
				funcionario1.consultaDados();
			} else if (auxiliar == 2) {
				funcionario1.setNomeFunc(Teclado.lerTexto("digite o nome: "));
				funcionario1.setSalarioFunc(Teclado.lerDouble("digite o salario: "));
			} else if (auxiliar == 3) {
				verifica = false;
			}
		}

	}
	

}
