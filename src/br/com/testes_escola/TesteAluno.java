package br.com.testes_escola;
import br.com.escola.Aluno;
public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNomeAluno("Aluno1");
		aluno1.setRgAluno(123456);
		aluno1.setDataNascAluno("22/02/2000");
		
		aluno2.setNomeAluno("Aluno2");
		aluno2.setRgAluno(222222);
		aluno2.setDataNascAluno("11/01/1999");
		
		
		aluno1.consultaDados();
		aluno2.consultaDados();
	}

}
