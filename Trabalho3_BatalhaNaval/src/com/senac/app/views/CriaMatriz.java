package com.senac.app.views;

import java.util.Random;
import java.util.Scanner;

public class CriaMatriz {

	public void iniciaTabuleiro(int[][] tabuleiro) {
		for (int linha = 0; linha < 10; linha++)
			for (int coluna = 0; coluna < 10; coluna++)
				tabuleiro[linha][coluna] = -1;
	}

	public void mostraTabuleiro(int[][] tabuleiro) {
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");

		for (int linha = 0; linha < 10; linha++) {

			System.out.print((linha + 1) + "");

			for (int coluna = 0; coluna < 10; coluna++) {

				if (tabuleiro[linha][coluna] == -1) {
					System.out.print("\t" + ".");
				}
				if (tabuleiro[linha][coluna] == 0) {
					System.out.print("\t" + "X");
				}
				if (tabuleiro[linha][coluna] == 1) {
					System.out.print("\t" + "O");
				}
			}
			System.out.println();
		}
	}

	public void iniciaNavios(int[][] subimarinos) {
		Random sorteio = new Random();
		for (int aux = 0; aux < 2; aux++) {
			subimarinos[aux][aux] = sorteio.nextInt(6);
			
		}
	}

	public void darTiro(int[] tiro) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Linha: ");
		tiro[0] = entrada.nextInt(); 
		tiro[0]--;
		System.out.print("opção invalida!");		
			
		System.out.print("Coluna: ");
		tiro[1] = entrada.nextInt();
		tiro[1]--;
	}

	public boolean acertou(int[] tiro, int[][] subimarinos) {

		for (int aux = 0; aux < subimarinos.length; aux++) {
			if (tiro[0] == subimarinos[aux][0] && tiro[1] == subimarinos[aux][1]) {
				//System.out.printf("\nlinha: %d\ncoluna: %d\n", tiro[0] + 1,tiro[1] + 1);
				return true;
			}
		}
		return false;
	}

	public void alteraTabuleiro(int[] tiro, int[][] subimarinos, int[][] tabuleiro) {
		if (acertou(tiro, subimarinos))
			tabuleiro[tiro[0]][tiro[1]] = 1;
		else
			tabuleiro[tiro[0]][tiro[1]] = 0;
	}

	public void criaTabuleiro() {

		int[][] tabuleiro = new int[10][10];
		int[][] subimarinos = new int[3][2];
		int[] tiro = new int[5];
		int tentativas = 0;
		int acertos = 0;

		iniciaTabuleiro(tabuleiro);
		iniciaNavios(subimarinos);

		System.out.println();
		do {
			mostraTabuleiro(tabuleiro);
			darTiro(tiro);
			tentativas++;
			if (acertou(tiro, subimarinos)) {
				System.out.println("\n ----- Parabens, você acertou!\n");
				acertos++;
			} else
				System.out.println("\n ----- Fail, tente novamente!\n");

			alteraTabuleiro(tiro, subimarinos, tabuleiro);

		} while (acertos != 5);

		System.out.println("FIM DE JOGO" + tentativas);
		mostraTabuleiro(tabuleiro);
	}
}
