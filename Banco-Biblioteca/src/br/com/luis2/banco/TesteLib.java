package br.com.luis2.banco;

import br.com.luis.banco.modelo.Conta;
import br.com.luis.banco.modelo.contacorrente;

public class TesteLib {
	
	public static void main(String[] args) {
		Conta c = new contacorrente(100,20);
		c.deposita(20);
	}

}
