package br.com.luis.banco.modelo;

public class contacorrente extends Conta implements Tributavel {

	public contacorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void saca(double valor) {
		double valorSaque = valor + 1;
		 super.saca(valorSaque);
	}

	@Override
	public void  deposita(double valor) {
         super.saldo += valor;
		
	}

	@Override
	public double getImposto() {
		return super.saldo*0.1;	
	}
    
	@Override
	public String toString() {
		return "ContaCorrente :" +this.getNumero()+ ",Agencia:"+ this.getNumero();
	}

	


		
		
		
	
}
