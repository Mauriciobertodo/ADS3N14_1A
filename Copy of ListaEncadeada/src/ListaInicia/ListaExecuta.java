package ListaInicia;

import javax.swing.JOptionPane;

public class ListaExecuta {

	ListadeContatos Primeiro;
	ListadeContatos Ultimo;
	int tamanho = 0;
	
	
	public ListaExecuta(){
		Primeiro = null;
		Ultimo = Primeiro;		
	}
	
	public void Adicionar(String contatos){
		if(Primeiro == null){
			Primeiro = new ListadeContatos();
			Ultimo = Primeiro;
			ListadeContatos novo = new ListadeContatos();
			novo.setContatos(contatos);
			novo.setProximo(null);
			Ultimo.setProximo(novo);
			tamanho++;
		}
		else{
			ListadeContatos novo = new ListadeContatos();
			novo.setContatos(contatos);
			novo.setProximo(null);
			Ultimo.setProximo(novo);
			Ultimo = novo;
			tamanho++;
		}		
	}

	public void Exibir(){
		ListadeContatos percorre = Primeiro.getProximo();
		while(percorre != null){
			JOptionPane.showMessageDialog(null, percorre.getContatos());
			percorre = percorre.getProximo();
		}
		
	}
	
}
