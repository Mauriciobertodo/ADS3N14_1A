package com.senac.apps.views;

import java.util.Scanner;
import com.senac.mvc.controller.PessoaController;

public class ConsoleView {	
	
	private Scanner entrada = new Scanner(System.in);
	
	@SuppressWarnings("rawtypes")
	private PessoaController pessoaContr = new PessoaController();
	
	public void imprimeInteiro(Integer valor) {
		System.out.println(valor);
	}
	
	public void mostrarMenuInicial(){
		
		String x = "";
		
		while(x != "0")
		{			
			System.out.print("\nAGENDA TELEFONICA!\n"+
					"Selecione uma opção abaixo:\n"+
					"-Exibir contatos........... 1\n"+
					"-Deletar contatos.......... 2\n"+
					"-Alterar contatos.......... 3\n"+ 
					"-Buscar contatos........... 4\n"+
					"-Finalizar................. 0\n"+
					"-Opção..................... ");
			
			x = entrada.next();	
			switch (x) {
			case "1":
				System.out.print("\n");
				pessoaContr.criarContato();
				break;
			case "2":
				
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				System.out.print("\nOBRIGADO!");
				System.exit(0);
				break;			
			default:
				System.out.print("\nOPÇÃO INVALIDA!\n");
				break;
			}
		}
	}	
}
