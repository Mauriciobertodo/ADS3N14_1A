package com.senac.principal;

import java.util.Random;

public class BubbleSort {

	public void Ordenar() {
		Random rand = new Random();
		
		int quant = 10;
		int[] vet = new int[quant];
		int aux = 0;
		
		for(int i = 0; i < quant; i++){
			vet[i] = rand.nextInt(10);
		}		
		System.out.println("Desordenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		System.out.println("\nOrganizado:");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
