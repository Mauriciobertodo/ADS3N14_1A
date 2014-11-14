package com.senac.apps.EscalonamentodeProcessos;
import com.senac.apps.EscalonamentodeProcessos.Controller.Processos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String x = "";
		Processos start = new Processos();
		
		while(x != "0")
		{			
			System.out.print("\nEscalonamento de Processos!\n"+
					"Selecione uma opção abaixo:\n"+
					"-Exibir FIFO (First In First Out) \t1\n"+
					"-Exibir Primeiro (Shortest Job First) \t2\n"+
					"-Exibir Baseado em Prioridades  \t3\n"+ 
					"-Exibir Round Robin ou Circular \t4\n"+
					"-Finalizar                      \t0\n"+
					"-Opção ................................ ");
			
			x = entrada.next();	
			switch (x) {
			case "1":
				System.out.print("\nFIFO (First In First Out)\n");
				start.FIFO();
				break;
			case "2":
				System.out.print("\nPrimeiro (Shortest Job First)\n");
				start.Primeiro2();
				break;
			case "3":
				System.out.print("\nBaseado em Prioridades\n");
				start.Prioridades();
				break;
			case "4":
				System.out.print("\nRound Robin ou Circular\n");
				start.Circular();
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
