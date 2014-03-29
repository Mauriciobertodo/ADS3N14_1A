package com.senac.app.views;

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

				/*
				 * else if(tabuleiro[linha][coluna]==0){
				 * System.out.print("\t"+"*"); }else
				 * if(tabuleiro[linha][coluna]==1){ System.out.print("\t"+"X");
				 * }
				 */
			}
			System.out.println();
		}
	}

	public void criaTabuleiro() {

		int[][] tabuleiro = new int[10][10];
		// int[][] navios = new int[3][2];
		//int[] tiro = new int[5];
		//int tentativas = 0;
		//int acertos = 0;

		iniciaTabuleiro(tabuleiro);
		mostraTabuleiro(tabuleiro);
		
	}
}
