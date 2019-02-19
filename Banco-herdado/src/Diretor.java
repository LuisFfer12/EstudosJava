
public class Diretor extends Funcionario implements Autenticavel {

private Autenticacao autenticador;
	
	public Diretor() {
		this.autenticador = new Autenticacao();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

	@Override
	public double geraBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
