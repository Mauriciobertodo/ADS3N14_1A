package com.senac.principal;

import java.util.Random;

public class Quicksort {
	
	public void Ordenar() {
		Random rand = new Random();
		
		int quant = 10;
		int[] vet = new int[quant];
		
		for(int i = 0; i < quant; i++){
			vet[i] = rand.nextInt(10);
		}		
		
		System.out.println("Desordenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
		
		QuickSortOrdenado(vet, 0, quant);
		
		System.out.println("\n\nOrdenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
	}
	
	public void QuickSortOrdenado(int vet[], int esquerda, int direita){
		int meio;
		
		if(esquerda<direita){
			meio = partition(vet, esquerda, direita);
			QuickSortOrdenado(vet, esquerda, meio);
			QuickSortOrdenado(vet, meio+1, direita);
		}
	}
	
	int partition(int vet[], int esquerda, int direita)	{
		
		int pivo = vet[esquerda];
		int inicio = esquerda;
		
		for(int i = esquerda+1; i < direita; i++){
			if(vet[i]<pivo){
				vet[inicio] = vet[i];
				vet[i] = vet[inicio+1];
				inicio++;				
			}
		}
		vet[inicio] = pivo;
		return inicio;
	}
}
