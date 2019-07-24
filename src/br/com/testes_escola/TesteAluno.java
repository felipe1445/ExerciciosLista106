package br.com.testes_escola;
import br.com.escola.Aluno;
import br.com.escola.Turma;
public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		
		turma1.setPeriodoTurma("Matutino");
		turma1.setSerieTurma(8);
		turma1.setSiglaTurma("8c");
		turma1.setTipoEnsinoTurma("Fundamental");
		
		turma2.setPeriodoTurma("Vespertino");
		turma2.setSerieTurma(7);
		turma2.setSiglaTurma("7a");
		turma2.setTipoEnsinoTurma("Fundamental");
		
		aluno1.setNomeAluno("Aluno1");
		aluno1.setRgAluno(123456);
		aluno1.setDataNascAluno("22/02/2000");
		
		aluno2.setNomeAluno("Aluno2");
		aluno2.setRgAluno(222222);
		aluno2.setDataNascAluno("11/01/1999");
		
		//teste relacionamento
		aluno1.setTurma(turma1);
		aluno2.setTurma(turma2);
		
		aluno1.consultaDados();
		aluno2.consultaDados();
	}

}
