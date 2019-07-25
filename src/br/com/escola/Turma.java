package br.com.escola;

public class Turma {
	private String periodoTurma,siglaTurma,tipoEnsinoTurma;
	private int serieTurma;
	
	
	public String getPeriodoTurma() {
		return periodoTurma;
	}
	public void setPeriodoTurma(String periodoTurma) {
		this.periodoTurma = periodoTurma;
	}
	public String getSiglaTurma() {
		return siglaTurma;
	}
	public void setSiglaTurma(String siglaTurma) {
		this.siglaTurma = siglaTurma;
	}
	public String getTipoEnsinoTurma() {
		return tipoEnsinoTurma;
	}
	public void setTipoEnsinoTurma(String tipoEnsinoTurma) {
		this.tipoEnsinoTurma = tipoEnsinoTurma;
	}
	public int getSerieTurma() {
		return serieTurma;
	}
	public void setSerieTurma(int serieTurma) {
		this.serieTurma = serieTurma;
	}
	
	public void consultaDados() {
		System.out.println("Periodo: " + this.periodoTurma+ " Série: "
				+this.serieTurma+ "ª Sigla: "+this.siglaTurma+ " Tipo de Ensino: "+this.tipoEnsinoTurma);		
	}
}
