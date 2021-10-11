package Gerenciador_insumos;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	Local[] locais = new Local[28];
	Insumo[] insumos = new Insumo[1023];
	Object insumoFiltrado = new Object();
	//Object[] insumoFiltradoArr = new Object[1023];
	
	public Controller() {
		this.locais[0] = new Local();
	}
	//local 0 é o MS
	
	public void cadastraInsumosMS(String nome, String dtVencimento, String nomeFabricante, int quantidade, int valorUnitário, int tipoInsumo) {		
		this.locais[0].setNome("MS");
		this.locais[0].setTipo(0);
		this.locais[0].setNewInsumo("nome", "dtVencimento", "nomeFabricante", quantidade, valorUnitário, tipoInsumo); // falta parametros
		return;
	}

	public void consultaInsumos(int indiceLocal) {	
		this.insumos = locais[indiceLocal].getInsumos();
		
		int n = this.insumos.length;
		for(int i = 0; i < n ; i++) {
			
			System.out.println("Insumos: " + this.insumos[i].getTipoInsumo() + i);
			if(this.insumos[i + 1] == null) {
				return;
			}
		}
		
		return;
	}
	
	public void consultaInsumosDescricao(int indiceLocal) {	
		this.insumos = locais[indiceLocal].getInsumos();
		int n = this.insumos.length;
		
		for(int i = 0; i < n ; i++) {
			System.out.println("---------------");
			System.out.println("Nome: " + this.insumos[i].getNome());
			System.out.println("Fabricante: " + this.insumos[i].getFabricante());
			System.out.println("Data vencimento: " + this.insumos[i].getDataVencimento());
			System.out.println("Quantidade: " + this.insumos[i].getQuantidade());
			System.out.println("Valor unitário: " + this.insumos[i].getvalorUnitario());
			System.out.println("Insumo: " + this.insumos[i].getTipoInsumo());
			System.out.println("---------------");
			if(this.insumos[i + 1] == null) {
				return;
			}
			
		}
		
		return;
	}
	
	public List<Object> consultaInsumos(int indiceLocal, int tipoInsumo) {	// return all insumos de um local por tipo
		this.insumos = locais[indiceLocal].getInsumos();
		int n = this.insumos.length;
		List<Object> insumoFiltradoArr = new ArrayList<Object>();
		
		
		for(int i = 0; i < n ; i++) {
			this.insumoFiltrado = this.insumos[i].getObjInsumo(tipoInsumo);
			insumoFiltradoArr.add(this.insumoFiltrado);
			
			System.out.println("Insumos: " + this.insumos[i].getNome());
			if(this.insumos[i + 1] == null) {
				break;
			}
		}
		
		
		return insumoFiltradoArr;
	}
	
	
	
	public void distribuiInsumo(int indiceLocalDestino, String tipoInsumo) {	
		//distribuir um determinado insumo para um determinado estado e debitar o insumo do estoque do MS e creditar no novo indice
		this.insumos = locais[0].getInsumos();
		int n = this.insumos.length;
		
		for(int i = 0; i < n ; i++) {
			if (this.insumos[i].getTipoInsumo() == tipoInsumo) {
				System.out.println("loop " + i);
				this.locais[indiceLocalDestino] = new Local();
				this.locais[indiceLocalDestino].setNewInsumo(this.insumos[i].getNome(), this.insumos[i].getDataVencimento(), this.insumos[i].getFabricante(), this.insumos[i].getQuantidade(), this.insumos[i].getvalorUnitario(), this.insumos[i].getIntTipoInsumo());		
				this.insumos[i] = new Insumo();
				System.out.println("Insumo removido do MS id: 0 \n"
						+ "Insumo inserido No estado id: " + indiceLocalDestino
						+ "\n Insumo: " + this.insumos[indiceLocalDestino].getTipoInsumo());
				
				return;
			}
			if(this.insumos[i + 1] == null) {
				return;
			}
			
		}			
		return;
	}

	
	
	
	
	
	
	
	
	
}

