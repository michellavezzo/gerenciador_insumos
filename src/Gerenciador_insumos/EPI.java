package Gerenciador_insumos;

public class EPI {
	private int id;
	private int tipo;
	private String descricao;
	
	public EPI() {
		this.id = 0;
		return;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
