package ListaInicia;
//import LeituraArquivo.LerArquivo;

public class ListadeContatos {
	
	String Contatos;
	ListadeContatos Proximo;
	
	public ListadeContatos(){
		
	}

	public String getContatos() {
		return Contatos;
	}

	public void setContatos(String contatos) {
		Contatos = contatos;
	}

	public ListadeContatos getProximo() {
		return Proximo;
	}

	public void setProximo(ListadeContatos proximo) {
		Proximo = proximo;
	}
}
