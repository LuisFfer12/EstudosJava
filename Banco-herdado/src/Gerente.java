
public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacao();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
	public double geraBonificacao() {
		return 2;
	}

	
}
