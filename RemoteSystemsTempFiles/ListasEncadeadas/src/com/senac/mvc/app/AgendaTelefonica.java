package com.senac.mvc.app;

/*
import com.senac.apps.Controller;
import com.senac.mvc.controller.PessoaController;
import com.senac.mvc.view.ExtendedView;
*/
import com.senac.arquivo.LerArquivo;

public class AgendaTelefonica {

	public static void main(String[] args) {
		//PessoaController controller = new PessoaController();
		//controller.criarContato();
		
		//controller.exibirContato(new ExtendedView());
		
		//Controller controller1 = new Controller();
		//controller1.iniciaLista();
		
		LerArquivo mostar = new LerArquivo();
		mostar.abrirArquivo();
	}
}
