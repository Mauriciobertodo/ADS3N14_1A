package com.senac.estrutura.lista.view;

import static java.lang.System.out;
import java.util.Scanner;

public class ConsoleView {

	private Scanner teclado = new Scanner(System.in);

	public void message(String message) {
		out.println(message);
	}

	public String read(String prompt) {
		out.print(prompt+": ");
		return teclado .nextLine();
	}
	
	public void printContato(String nome, String telefone) {
		message("Nome: " + nome);
		message("Telefone: " + telefone);
	}

	public void logError(String message) {
		message("Error: " + message);
	}
}
