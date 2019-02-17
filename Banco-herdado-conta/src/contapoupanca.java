
public class contapoupanca extends Conta {

	public contapoupanca(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
