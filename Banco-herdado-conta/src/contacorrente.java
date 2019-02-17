
public class contacorrente extends Conta {

	public contacorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + 1;
		return super.saca(valorSaque);
	}

	@Override
	public void  deposita(double valor) {
         super.saldo += valor;
		
	}

}
