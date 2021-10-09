package Gerenciador_insumos;

public class Insumo {
	private String nome;
	private String dtVencimento;
	private String nomeFabricante;
	private int tipoInsumo;
	private int quantidade;
	private int valorUnitario;
	
	EPI epi = new EPI();
	Vacina vacina = new Vacina();
	Medicamento medicamento = new Medicamento();
	
	
	/* tipo insumo  0E |1 V |2 M . switchcase para decidir quem setar.
	 * 
	 * 
	 * 
	 * */
	public Insumo() {
		//se isumos vierem com valores adulterados, possivel motivo de erro na inicialização 
		this.nome = null;
		this.dtVencimento = null;
		this.nomeFabricante = null;
		this.tipoInsumo = -1;
		this.quantidade = -1;
		this.valorUnitario = -1;
		return;
	}
	
	public void setInsumo(String nome, String dtVencimento, String nomeFabricante, int quantidade, int valorUnitário, int tipoInsumo) {
		setNome(nome);
		setDataVencimento(dtVencimento);
		setFabricante(nomeFabricante);
		setQuantidade(quantidade);
		setvalorUnitario(valorUnitário);
		setTipoInsumo(tipoInsumo);
		return;
	}
	
	public Insumo getInsumo() {	
		return new Insumo();
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	private void setDataVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	private void setFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}
	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	private void setvalorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	private void setTipoInsumo(int tipoInsumo) {
		this.tipoInsumo = tipoInsumo;
		//falta adicionar os parametros aos metodos set
		
		switch(tipoInsumo) {
			case 0:
				epi.setDescricao("");
				epi.setTipo(quantidade);
				break;
			case 1 :
				vacina.setIntervalo(quantidade);
				vacina.setQntDoses(quantidade);
				vacina.setTipo(quantidade);
				break;
			case 2:
				medicamento.setAdministracao("");
				medicamento.setDisponibilizacao("");
				medicamento.setDosagem("");
				break;
		
			default:
				System.out.println("tipo indefinido");					
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getDataVencimento() {
		return this.dtVencimento;
	}
	public String getFabricante() {
		return this.nomeFabricante;
	}
	public Object getTipoInsumo(int tipoInsumo) {//retornar o obj
		switch(tipoInsumo) {
			case 0:
				epi.getDescricao();
				epi.getTipo();
				return epi;
			case 1 :
				vacina.getIntervalo();
				vacina.getQntDoses();
				vacina.getTipo();
				return vacina;
			case 2:
				medicamento.getAdministracao();
				medicamento.getDisponibilizacao();
				medicamento.getDosagem();
				return medicamento;
		
			default:
				return this.tipoInsumo;					
		}
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	public int getvalorUnitario() {
		return this.valorUnitario;
	}
	
	
	
	

}
