package com.senac.arquivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.CompactView;

public class LerArquivo {
	String nome = null;
	String telefone = null;
	
	public void abrirArquivo() {
		
		PessoaController novoContato = new PessoaController();
		CompactView exibe = new CompactView();
		novoContato.criarContato();
				
		String caminho = "D:\\Documents\\SENAC\\3°Semestre\\Algoritimos e Programação III\\ListaEncadeada de Contatos.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(caminho));
			String str = null;
			
			while (in.ready()) {
				str = in.readLine();
				process(str);
				
				nome = str.substring(str.indexOf("+")+1,str.indexOf("-"));
				telefone = str.substring(str.indexOf("-")+1,str.indexOf("#")-1);
				
				novoContato.contato.setNome(nome);
				novoContato.contato.setTelefone(telefone);
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