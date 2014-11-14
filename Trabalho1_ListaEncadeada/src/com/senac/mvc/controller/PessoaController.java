package com.senac.mvc.controller;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.senac.estruturas.*;
import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.CompactView;
import com.senac.mvc.view.ContatoView;

public class PessoaController<T> {
	
	String nome = null;
	String telefone = null;
	
	//Scanner entrada = new Scanner(System.in);
	
	PessoaController<T> novoContato = new PessoaController();
	CompactView exibe = new CompactView();
	Pessoa contatoPessoa = new Pessoa();
	
	public void criarContato(){
		
		String caminho = "D:\\Documents\\SENAC\\3°Semestre\\Algoritimos e Programação III\\ADS3N14_1A\\Trabalho1_ListaEncadeada\\ListaEncadeada de Contatos.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(caminho));
			String str = null;
			
			while (in.ready()) {
				str = in.readLine();
				process(str);
				
				nome = str.substring(str.indexOf("+")+1,str.indexOf("-"));
				telefone = str.substring(str.indexOf("-")+1,str.indexOf("#")-1);
							
				novoContato.contatoPessoa.setNome(nome);
				novoContato.contatoPessoa.setTelefone(telefone);
				
				//novoContato.criarContato();
				
				exibe.printContato(nome, telefone);
			}
			in.close();
		} 
		catch (IOException e) {
		}
	}
	public void process(String str) {
	}
	public void exibirContato( ContatoView view ){
		//view.printContato(contatoPessoa.getNome(), contatoPessoa.getTelefone());
	}
	
	
	
}
