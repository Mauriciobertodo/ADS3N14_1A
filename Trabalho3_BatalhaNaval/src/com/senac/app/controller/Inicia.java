package com.senac.app.controller;

import java.util.Scanner;

import com.senac.app.views.CriaMatriz;

public class Inicia {
	
	private Scanner entrada = new Scanner(System.in);
	CriaMatriz criar = new CriaMatriz();
	
	public void iniciaOpcoes(){
	
		String x = "";		
		while(x != "0")
		{			
			System.out.print("\nBATALHA NAVAL!\n"+
					"Selecione uma opção abaixo:\n"+
					"-Iniciar batalha .......... 1\n"+
					"-Finalizar ................ 0\n"+
					"-Opção..................... ");
			
			x = entrada.next();	
			switch (x) {
			case "1":
				System.out.print("\n");
				criar.criaTabuleiro();
				break;
			case "2":
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