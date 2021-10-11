package Gerenciador_insumos;

public class Local {
	private String nome;
	private int tipo;
	private int n = 1023; // numero de insumos
	private Insumo[] insumos = new Insumo[n]; // Numero máximo de insumos = 1024. pode ser um problema em larga escala, porem para este projeto é suficiente.
	
	public Local() {
		this.nome = "null";
		this.tipo = -1;
		//this.insumos = null;
	}
	//public void setLocal()
	
	public void setNewInsumo(String nome, String dtVencimento, String nomeFabricante, int quantidade, int valorUnitário, int tipoInsumo) {
		
//		if(this.nome == null && this.tipo == -1) {
//			System.out.println("Nome & tipo do local inválidos");
//			System.out.println("Nome: " + this.nome + "Tipo: " + this.tipo);
//			return;
//		}
		
		Insumo insumo = new Insumo();
		insumo = insumo.newInsumo(nome, dtVencimento, nomeFabricante, quantidade, valorUnitário, tipoInsumo);
		
		for(int i = 0; i < this.n; i++) {
			if(this.insumos[i] == null) {
				this.insumos[i] = new Insumo();
				this.insumos[i] = insumo;
				System.out.println("Novo insumo adicionado na posição: " + i + insumos[i].getNome());
				return;			
			}
		}
	}
	public void removeInsumo(Insumo insumo) {		
		for(int i = 0; i < this.n ; i++) {
			if (this.insumos[i] == insumo) {
				System.out.println("Insumo removido: " + insumos[i].getNome());
				insumos[i] = null;
				return;
		}
	}
}
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;	
	}
	
	public Insumo[] getInsumos() {
		return this.insumos;
	}
	
	public String getNome() {
		return this.nome;	
	}
	public int getTipo() {
		return this.tipo;	
	}
	
	
	

}
