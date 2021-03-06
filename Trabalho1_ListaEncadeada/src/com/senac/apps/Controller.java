package com.senac.apps;

import com.senac.apps.views.ConsoleView;
import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;

public class Controller {

	private ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();

	private ConsoleView view = new ConsoleView();

	public void iniciaLista() {
		for (int i = 0; i < 20; ++i) {
			Nodo<Integer> pessoa = new Nodo<Integer>();
			pessoa.setChave(null);
			lista.insert(pessoa);
		}
	}

	public void imprimeLista() {
		Nodo<Integer> nodo = lista.getHead();
		while (nodo != null) {
			view.imprimeInteiro(nodo.getChave());
			nodo = nodo.getNext();
		}
	}
}


