
public class Programador extends Funcionario implements Autenticavel {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public double geraBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
