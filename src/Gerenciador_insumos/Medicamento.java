package Gerenciador_insumos;

public class Medicamento {
	
	private int id;
	private String dosagem;
	private String adm;
	private String disp;
	
	public Medicamento() {
		this.id = 2;
		return;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDosagem() {
		return dosagem;
	}
	public String getAdministracao() {
		return adm;
	}
	public String getDisponibilizacao() {
		return disp;
	}
	
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}
	public void setAdministracao(String adm) {
		this.adm = adm;
	}
	public void setDisponibilizacao(String disp) {
		this.disp = disp;
	}
	

}
