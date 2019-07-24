package br.com.escola;

public class Aluno {
	String nomeAluno,dataNascAluno;
	int rgAluno;
	Turma turma;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getDataNascAluno() {
		return dataNascAluno;
	}
	public void setDataNascAluno(String dataNascAluno) {
		this.dataNascAluno = dataNascAluno;
	}
	public int getRgAluno() {
		return rgAluno;
	}
	public void setRgAluno(int rgAluno) {
		this.rgAluno = rgAluno;
	}		
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public void consultaDados() {
		System.out.println("Nome: "+this.nomeAluno+ " RG: "+this.rgAluno+ " Data de Nascimento: "+this.dataNascAluno);
		this.turma.consultaDados();
		
	}
}
