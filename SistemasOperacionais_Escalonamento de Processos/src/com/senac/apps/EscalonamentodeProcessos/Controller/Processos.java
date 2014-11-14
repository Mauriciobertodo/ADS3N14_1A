package com.senac.apps.EscalonamentodeProcessos.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;

import javax.swing.JOptionPane;

public class Processos {

	ArrayList<Integer> fifo = new ArrayList<Integer>();
	Random rand = new Random();
	int quant = 10;
	int auxTempo = 1 * 500;
	Timer timer = new Timer();

	public void FIFO() {

		for (int i = 0; i < quant; i++) {
			fifo.add(rand.nextInt(10));
		}
		System.out.println("\nOrdem de Entrada: ");
		try {
			System.out.println("\nPROCESS \tBT");
			for (int i = 0; i < fifo.size(); i++) {
				System.out.print("   P"+(i + 1) +"    \t"+ fifo.get(i)+"\n");
				Thread.sleep(auxTempo);
			}
		} catch (InterruptedException e) {
		}
		
		//Collections.reverse(fifo);
		System.out.println("\nOrdem de Saida: ");
		try {
			System.out.println("\nPROCESS \tBT");
			for (int i = 0; i < fifo.size(); i++) {
				System.out.print("   P"+(i + 1) +"    \t"+ fifo.get(i)+"\n");
				Thread.sleep(auxTempo);
			}
		} 
		catch (InterruptedException e) {
		}
		System.out.println();
		fifo.clear();
	}

	public void Primeiro() {

		int BurstTime[], WaitTime[], SomaTime[];
		
		BurstTime = new int[quant + 1];
		WaitTime = new int[quant + 1];
		SomaTime = new int[quant + 1];
		float tempo = 0;
		int aux;
		
		for (int i = 0; i < quant; i++) {
			BurstTime[i] = rand.nextInt(10);
		}
		
		for (int i = 0; i < quant; i++) {
			WaitTime[i] = 0;
			SomaTime[i] = 0;
		}
		
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				if (BurstTime[j] > BurstTime[j + 1]) {
					aux = BurstTime[j];
					BurstTime[j] = BurstTime[j + 1];
					BurstTime[j + 1] = aux;
					aux = WaitTime[j];
					WaitTime[j] = WaitTime[j + 1];
					WaitTime[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < quant; i++) {
			SomaTime[i] = BurstTime[i] + WaitTime[i];
			WaitTime[i + 1] = SomaTime[i];
		}
		
		SomaTime[quant] = WaitTime[quant] + BurstTime[quant];
		System.out.println("\nPROCESS \tBT \tWT \tST");
		
		try {
			for (int i = 0; i < quant; i++){
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTime[i]
									+ " \t"+ WaitTime[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}			
		} 
		catch (Exception e) {
		}
				for (int j = 0; j < quant; j++)
			tempo += WaitTime[j];
		
		tempo = tempo / quant;
		System.out.println("\nTempo Total: " + tempo +" ms");
	}

	public void Prioridades() {

		int BurstTime[], WaitTime[], SomaTime[], Priority[];
		
		BurstTime = new int[quant + 1];
		WaitTime = new int[quant + 1];
		SomaTime = new int[quant + 1];
		Priority = new int[quant + 1];
		
		float tempo = 0;
		int aux = 0;
		
		for (int i = 0; i < quant; i++)
			BurstTime[i] = rand.nextInt(10);
		
		for (int i = 0; i < quant; i++)
			Priority[i] = rand.nextInt(5)+1;
		
		for (int i = 0; i < quant; i++) {
			WaitTime[i] = 0;
			SomaTime[i] = 0;
		}
		
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				if (Priority[j] > Priority[j + 1]) {
					aux = Priority[j];
					Priority[j] = Priority[j + 1];
					Priority[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < quant; i++) {
			SomaTime[i] = BurstTime[i] + WaitTime[i];
			WaitTime[i + 1] = SomaTime[i];
		}
		
		SomaTime[quant] = WaitTime[quant] + BurstTime[quant];
		System.out.println("\nPROCESS \tBT \tWT \tPT \tST");
		
		try {
			for (int i = 0; i < quant; i++){
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTime[i]
									+ " \t"+ WaitTime[i]
									+ "	"+ Priority[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}			
		} 
		catch (Exception e) {
		}

		for (int j = 0; j < quant; j++)
			tempo += WaitTime[j];
		
		tempo = tempo / quant;
		System.out.println("\nTempo Total: " + tempo +" ms");
	}

	public void Circular() {

		int BurstTime[] = new int[quant + 1];
		int BurstTimeAux[] = new int[quant + 1];
		int WaitTime[] = new int[quant + 1];
		int SomaTime[] = new int[quant + 1];
				
		int q = quant;
		int sum = 0;
		
		float SomaTimeWait = 0;
		float SomaTimeTotal = 0;
		
		for (int i = 0; i < quant; i++)
			BurstTime[i] = rand.nextInt(10)+1;
		
		for (int i = 0; i < quant; i++)
			BurstTimeAux[i] = BurstTime[i];
		
		for (int i = 0; i < quant; i++)
			WaitTime[i] = 0;
		
		do {
			for (int i = 0; i < quant; i++) {
				if (BurstTime[i] > q) {
					BurstTime[i] -= q;
					for (int j = 0; j < quant; j++) {
						if ((j != i) && (BurstTime[j] != 0))
							WaitTime[j] += q;
					}
				} 
				else {
					for (int j = 0; j < quant; j++) {
						if ((j != i) && (BurstTime[j] != 0))
							WaitTime[j] += BurstTime[i];
					}
					BurstTime[i] = 0;
				}
			}
			for (int m = 0; m < quant; m++)
				sum = sum + BurstTime[m];
			
		} while (sum != 0);
		
		for (int i = 0; i < quant; i++)
			SomaTime[i] = WaitTime[i] + BurstTimeAux[i];
		
		System.out.println("\nPROCESS \tBT \tWT \tST");
		
		try {
			for (int i = 0; i < quant; i++){ 
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTimeAux[i]
									+ " \t"+ WaitTime[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}
		} 
		catch (Exception e) {
		}		
				
		for (int j = 0; j < quant; j++) {
			SomaTimeWait += WaitTime[j];
		}
		
		for (int j = 0; j < quant; j++) {
			SomaTimeTotal += SomaTime[j];
		}
		
		System.out.println("\nTempo de espera: " + (SomaTimeWait/quant + "ms") 
							+ "\nTempo Total: " + (SomaTimeTotal/quant) + "ms");
	}

	public void Primeiro2() {

		int BurstTime[], WaitTime[], SomaTime[];
		
		ArrayList<Integer> Process = new ArrayList<Integer>();
		
		BurstTime = new int[quant + 1];
		WaitTime = new int[quant + 1];
		SomaTime = new int[quant + 1];
		
		
		
		float tempo = 0;
		int aux;
		
		for (int i = 0; i < quant; i++) {
			BurstTime[i] = rand.nextInt(10);
			Process.add(BurstTime[i]);	
		
			for (int j = 0; j < quant; j++) {
				WaitTime[i] = 0;
				SomaTime[i] = 0;

				Process.add(WaitTime[i]);
				Process.add(SomaTime[i]);
			}			
		}
		
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				if (BurstTime[j] > BurstTime[j + 1]) {
					aux = BurstTime[j];
					BurstTime[j] = BurstTime[j + 1];
					BurstTime[j + 1] = aux;
					aux = WaitTime[j];
					WaitTime[j] = WaitTime[j + 1];
					WaitTime[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < quant; i++) {
			SomaTime[i] = BurstTime[i] + WaitTime[i];
			WaitTime[i + 1] = SomaTime[i];
		}
		
		SomaTime[quant] = WaitTime[quant] + BurstTime[quant];
		System.out.println("\nPROCESS \tBT \tWT \tST");
		
		try {
			for (int i = 0; i < quant; i++){
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTime[i]
									+ " \t"+ WaitTime[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}			
		} 
		catch (Exception e) {
		}
				for (int j = 0; j < quant; j++)
			tempo += WaitTime[j];
		
		tempo = tempo / quant;
		System.out.println("\nTempo Total: " + tempo +" ms");
		
		for(int i = 0; i < Process.size();i++)
		{
			Process.get(i);
		}
		
		
	}

	public void Prioridades2() {

		int BurstTime[], WaitTime[], SomaTime[], Priority[];
		
		BurstTime = new int[quant + 1];
		WaitTime = new int[quant + 1];
		SomaTime = new int[quant + 1];
		Priority = new int[quant + 1];
		
		float tempo = 0;
		int aux = 0;
		
		for (int i = 0; i < quant; i++)
			BurstTime[i] = rand.nextInt(10);
		
		for (int i = 0; i < quant; i++)
			Priority[i] = rand.nextInt(5)+1;
		
		for (int i = 0; i < quant; i++) {
			WaitTime[i] = 0;
			SomaTime[i] = 0;
		}
		
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < quant - 1; j++) {
				if (Priority[j] > Priority[j + 1]) {
					aux = Priority[j];
					Priority[j] = Priority[j + 1];
					Priority[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < quant; i++) {
			SomaTime[i] = BurstTime[i] + WaitTime[i];
			WaitTime[i + 1] = SomaTime[i];
		}
		
		SomaTime[quant] = WaitTime[quant] + BurstTime[quant];
		System.out.println("\nPROCESS \tBT \tWT \tPT \tST");
		
		try {
			for (int i = 0; i < quant; i++){
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTime[i]
									+ " \t"+ WaitTime[i]
									+ "	"+ Priority[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}			
		} 
		catch (Exception e) {
		}

		for (int j = 0; j < quant; j++)
			tempo += WaitTime[j];
		
		tempo = tempo / quant;
		System.out.println("\nTempo Total: " + tempo +" ms");
	}

	public void Circular2() {

		int BurstTime[] = new int[quant + 1];
		int BurstTimeAux[] = new int[quant + 1];
		int WaitTime[] = new int[quant + 1];
		int SomaTime[] = new int[quant + 1];
				
		int q = quant;
		int sum = 0;
		
		float SomaTimeWait = 0;
		float SomaTimeTotal = 0;
		
		for (int i = 0; i < quant; i++)
			BurstTime[i] = rand.nextInt(10)+1;
		
		for (int i = 0; i < quant; i++)
			BurstTimeAux[i] = BurstTime[i];
		
		for (int i = 0; i < quant; i++)
			WaitTime[i] = 0;
		
		do {
			for (int i = 0; i < quant; i++) {
				if (BurstTime[i] > q) {
					BurstTime[i] -= q;
					for (int j = 0; j < quant; j++) {
						if ((j != i) && (BurstTime[j] != 0))
							WaitTime[j] += q;
					}
				} 
				else {
					for (int j = 0; j < quant; j++) {
						if ((j != i) && (BurstTime[j] != 0))
							WaitTime[j] += BurstTime[i];
					}
					BurstTime[i] = 0;
				}
			}
			for (int m = 0; m < quant; m++)
				sum = sum + BurstTime[m];
			
		} while (sum != 0);
		
		for (int i = 0; i < quant; i++)
			SomaTime[i] = WaitTime[i] + BurstTimeAux[i];
		
		System.out.println("\nPROCESS \tBT \tWT \tST");
		
		try {
			for (int i = 0; i < quant; i++){ 
				System.out.println("   P" + (i + 1)
									+ "    \t" + BurstTimeAux[i]
									+ " \t"+ WaitTime[i]
									+ " \t" + SomaTime[i]);
				Thread.sleep(auxTempo);
			}
		} 
		catch (Exception e) {
		}		
				
		for (int j = 0; j < quant; j++) {
			SomaTimeWait += WaitTime[j];
		}
		
		for (int j = 0; j < quant; j++) {
			SomaTimeTotal += SomaTime[j];
		}
		
		System.out.println("\nTempo de espera: " + (SomaTimeWait/quant + "ms") 
							+ "\nTempo Total: " + (SomaTimeTotal/quant) + "ms");
	}
}