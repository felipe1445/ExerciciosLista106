package br.com.testes_escola;
import br.com.escola.Turma;
public class TesteTurma {

	public static void main(String[] args) {
		
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
		
		turma1.consultaDados();
		turma2.consultaDados();
	}

}
