package com.senac.mvc.app;

import java.util.Scanner;

/*
import com.senac.apps.Controller;
import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.ExtendedView;
*/
import com.senac.arquivo.LerArquivo;

public class AgendaTelefonica {

	public static void main(String[] args) {
		
		String x = "";
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
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
				LerArquivo mostar = new LerArquivo();
				mostar.abrirArquivo();				
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
				System.out.print("deu certo");
				break;
			}
		}
		
		
		//PessoaController controller = new PessoaController();
		//controller.criarContato();
		
		//controller.exibirContato(new ExtendedView());
		
		//Controller controller1 = new Controller();
		//controller1.iniciaLista();
		
		
	}
}
