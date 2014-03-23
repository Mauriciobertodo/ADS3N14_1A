package com.senac.mvc.controller;
import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

public class PessoaController {

	public Pessoa contato;
	
	public void criarContato(){
		contato = new Pessoa();	
	}	
	public void exibirContato( ContatoView view ){
		//view.printContato(contato.getNome(), contato.getTelefone());
	}	
}
