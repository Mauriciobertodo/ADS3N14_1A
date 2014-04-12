package com.senac.principal;

import java.util.Random;

public class Ordenacao {
	static Random rand = new Random();
	static int quant = 10;
	static int[] vet = new int[quant];
	static int trocas = 0;
    static int comp = 0; 
    static int aux;
	
	public static void NumeroAleatorio(){
			
		for(int i = 0; i < quant; i++){
			vet[i] = rand.nextInt(10);
		}
		System.out.println("Desordenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println(" ");
	}
	public static void BubbleSort(){
		
		NumeroAleatorio();
		System.out.println("\n-------- BubbleSort");
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				comp++;
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
					trocas++;
				}
			}
		}
		System.out.println("Ordenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println("\n\nComparações: " + comp + "\nTrocas: " + trocas);
	}
	
	public static void QuickSort(){
	
		System.out.println("\n-------- QuickSort");
		//NumeroAleatorio();
		QuickSortOrdenado(vet, 0, quant);
		
		System.out.println("Ordenado: ");
		for (int i = 0; i < quant; i++) {
			System.out.print(vet[i] + " ");
		}
		
		System.out.println("\n\nComparações: " + comp + "\nTrocas: " + trocas);
	}

	public static void QuickSortOrdenado(int vet[], int esquerda, int direita){
		int meio;
		
		if(esquerda<direita){
			meio = partition(vet, esquerda, direita);
			QuickSortOrdenado(vet, esquerda, meio);
			QuickSortOrdenado(vet, meio+1, direita);
		}
	}

	static int partition(int vet[], int esquerda, int direita)	{
	
		int pivo = vet[esquerda];
		int inicio = esquerda;
		
		for(int i = esquerda+1; i < direita; i++){
			comp++;
			if(vet[i]<pivo){
				vet[inicio] = vet[i];
				vet[i] = vet[inicio+1];
				trocas++;
				inicio++;
			}
		}
		vet[inicio] = pivo;
		return inicio;
	}
}
