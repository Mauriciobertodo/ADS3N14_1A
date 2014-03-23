package com.senac.apps;

import com.senac.apps.views.ConsoleView;
import com.senac.arquivo.LerArquivo;
import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;
import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

public class Controller {
	
	private ListaOrdenada<String>
			
	lista = new ListaOrdenada<String>();
	
	private ConsoleView view = new ConsoleView();
	
	public void iniciaLista() {
		
		/*
		for (int i = 0; i < 50; ++i) {
			Nodo<Integer> novo = new Nodo<Integer>();
			novo.setChave((int)(Math.random() * 10000));
			lista.insert(novo);
		}
		*/		
	}
	
	public void imprimeLista() {
		Nodo<String> nodo = lista.getHead();
		while (nodo != null) {
			//view.imprimeInteiro(nodo.getChave());
			nodo = nodo.getNext();
		}
	}	
}









