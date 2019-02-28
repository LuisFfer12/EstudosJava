package br.com.luis.banco.testes;

import br.com.luis.banco.modelo.CalculadorImposto;
import br.com.luis.banco.modelo.contacorrente;

public class TestaContas {

	public static void main(String[] args) {
		
		contacorrente cc = new contacorrente(33,44);
		cc.deposita(1000);
		
		//SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.registra(cc);
		//ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
		
	}

}
