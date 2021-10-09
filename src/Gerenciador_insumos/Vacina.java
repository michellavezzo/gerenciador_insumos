package Gerenciador_insumos;

public class Vacina {
	private int id;
	private int tipo;
	private int qntDoses;
	private int intervalo;
	
	public Vacina() {
		this.id = 1;
		return;
	}
	public int getId() {
		return this.id;
	}
	
	public int getTipo() {
		return tipo;
	}
	public int getQntDoses() {
		return qntDoses;
	}
	public int getIntervalo() {
		return intervalo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public void setQntDoses(int qntDoses) {
		this.qntDoses = qntDoses;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
}
