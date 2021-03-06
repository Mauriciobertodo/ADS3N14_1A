package com.senac.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.senac.estruturas.ListaOrdenada;
import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.CompactView;

public class LerArquivo {
	
	String nome = null;
	String telefone = null;
	
	@SuppressWarnings("rawtypes")
	PessoaController novoContato = new PessoaController();
	CompactView exibe = new CompactView();
	
	public void abrirArquivo() {		
				
		String caminho = "D:\\Documents\\SENAC\\3�Semestre\\Algoritimos e Programa��o III\\ADS3N14_1A\\Trabalho1_ListaEncadeada\\ListaEncadeada de Contatos.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(caminho));
			String str = null;
			
			while (in.ready()) {
				str = in.readLine();
				process(str);
				
				nome = str.substring(str.indexOf("+")+1,str.indexOf("-"));
				telefone = str.substring(str.indexOf("-")+1,str.indexOf("#")-1);
				
				//novoContato.contatoPessoa.setNome(nome);
				//novoContato.contatoPessoa.setTelefone(telefone);
				
				novoContato.criarContato();
				
				exibe.printContato(nome, telefone);
			}
			in.close();
		} 
		catch (IOException e) {
		}
	}	
	public void process(String str) {
	}
}