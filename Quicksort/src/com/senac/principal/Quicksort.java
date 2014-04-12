package com.senac.principal;

import java.util.Random;

public class Quicksort {
	
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
	}
}
