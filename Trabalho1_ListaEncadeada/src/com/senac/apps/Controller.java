package com.senac.apps;

import com.senac.apps.views.ConsoleView;
import com.senac.estruturas.ListaEncadeada;
import com.senac.estruturas.Nodo;
import com.senac.mvc.controller.PessoaController;

public class Controller {
	
	private ConsoleView view = new ConsoleView();
	
	private ListaEncadeada<PessoaController>
	
	lista = new ListaEncadeada<PessoaController>();
	
	public void iniciaLista() {
		
		//Nodo<PessoaController> novo = new Nodo<PessoaController>();
		//novo.setChave(null);
		//lista.insert(novo);	
	}	
	public void imprimeLista() {
		
		Nodo<PessoaController> mostar = lista.getHead();
		while (mostar != null) {
			view.imprimeInteiro(mostar.getChave());
			mostar = mostar.getNext();
		}	
	}	
}









