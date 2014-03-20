
public class PessoaController {

	private ExtendedView view = new ExtendedView();
	private Pessoa pessoa;

	public void criaPessoa() {
		
		pessoa = new Pessoa();
		pessoa.setNome("Mauricio");
		pessoa.setTelefone("051-91234567");
	}
	public void mostraPessoa() {
		view.imprimePessoa(pessoa.getNome(), pessoa.getTelefone());
	}
}
