package Gerenciador_insumos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Menu {
	
	Controller controller = new Controller();
	
	public Menu() {
		mainMenu();	
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("GERENCIADOR DE INSUMOS - MINIST�RIO DA SA�DE");
			System.out.println("\n------------------------------------------\n");
		System.out.println("GERENCIADOR DE INSUMOS - MINIST�RIO DA SA�DE");
		System.out.println("ESCOLHA AS OPCOES: \n 1 - CADASTRAR INSUMO \n 2 - CONSULTAR INSUMO"
				+ "\n 3 - CONSULTAR INSUMO COM DESCRICAO \n 4 - CONSULTAR INSUMO COM BASE NO LOCAL E TIPO \n"
				+ " 5 - DISTRIBUIR INSUMO"
				+ "6 - SALVAR INSUMOS \n 7 - LER INSUMOS");
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			try {
				String digitado = br.readLine();
				//System.out.println("--INPUT:  "  + digitado);
				selectOption(Integer.parseInt(digitado));
				
			} catch (IOException e) {
				System.out.println("erro de leitura");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	public void selectOption(int option) {	
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		
		switch(option) {
			case 0:
				System.out.println("--INPUT:  "  + option);
				return;
			case 1 :
				try {
					System.out.println("DIGITE NOME: ");
					String nome = br.readLine();
					System.out.println("DIGITE DATA VENCIMENTO: ");
					String dtVencimento = br.readLine();
					System.out.println("DIGITE NOME DO FABRICANTE: ");
					String nomeFabricante = br.readLine();
					System.out.println("DIGITE QUANTIDADE: ");
					String quantidade = br.readLine();
					System.out.println("DIGITE VALOR UNIT�RIO");
					String valorUnit�rio = br.readLine();
					System.out.println("DIGITE TIPO INSUMO (N� INTEIRO):\n 0 - EPI\n 1 - VACINA\n 2 - MEDICAMENTOS  ");
					String tipoInsumo = br.readLine();

					//Integer.parseInt(tipoInsumo)
					controller.cadastraInsumosMS(nome, dtVencimento, nomeFabricante, Integer.parseInt(quantidade), Integer.parseInt(valorUnit�rio), Integer.parseInt(tipoInsumo)); // falta adicionar parametros para setar insumos.
					
				} catch (IOException e) {
					System.out.println("erro de leitura");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("--INPUT:  "  + option);
				break;
			case 2:
				
				System.out.println("--INPUT:  "  + option);
				controller.consultaInsumos(0); // escolher indice do local;
				break;
			case 3:
				System.out.println("--INPUT:  "  + option);
				controller.consultaInsumosDescricao(0); // escolher indice do local;
				break;
			case 4:
				System.out.println("--INPUT:  "  + option);// falta adicionar parametros para setar insumos.
				controller.consultaInsumos(0, 0);
				break;
			case 5:
				System.out.println("--INPUT:  "  + option);
				controller.distribuiInsumo(2, "Epi");	// falta adicionar parametros para setar insumos.		
				break;
			case 6:
				System.out.println("--INPUT:  "  + option);// falta adicionar parametros para setar insumos.
				break;
			case 7:
				System.out.println("--INPUT:  "  + option);// falta adicionar parametros para setar insumos.
				break;	
			default:
				System.out.println("Entrada Invalida");					
		}
			
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Menu();
	}
	
	
	
	

}
