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
		System.out.println("GERENCIADOR DE INSUMOS - MINISTÉRIO DA SAÚDE");
		System.out.println("ESCOLHA AS OPCOES: \n 1 - CADASTRAR INSUMO \n 2 - CONSULTAR INSUMO"
				+ "\n 3 - CONSULTAR INSUMO COM DESCRICAO \n 4 - CONSULTAR INSUMO COM BASE NO LOCAL E TIPO \n"
				+ " 5 - DISTRIBUIR INSUMO"
				+ "6 - SALVAR INSUMOS \n 7 - LER INSUMOS");
		while(true) {
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
		switch(option) {
			case 0:
				System.out.println("--INPUT:  "  + option);
				return;
			case 1 :
				System.out.println("--INPUT:  "  + option);
				controller.cadastraInsumosMS(); // falta adicionar parametros para setar insumos.
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
				System.out.println("--INPUT:  "  + option);
				controller.consultaInsumos(0, 0);
				break;
			case 5:
				System.out.println("--INPUT:  "  + option);
				controller.distribuiInsumo(option, null);			
				break;
			case 6:
				System.out.println("--INPUT:  "  + option);
				break;
			case 7:
				System.out.println("--INPUT:  "  + option);
				break;	
			default:
				System.out.println("Entrada Invalida");					
		}
			
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Menu();
	}
	
	
	
	

}
