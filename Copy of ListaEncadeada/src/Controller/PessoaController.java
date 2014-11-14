package Controller;

import Model.Pessoa;
import View.ExtendedView;

public class PessoaController {

	private ExtendedView view = new ExtendedView();
	private Pessoa pessoa;

	public void criaPessoa() {
		
		pessoa = new Pessoa();
		
		pessoa.setNome("Mauricio");
		pessoa.setTelefone("555-1234");
	}
	public void mostraPessoa() {
		view.imprimePessoa(pessoa.getNome(), pessoa.getTelefone());
	}
}
