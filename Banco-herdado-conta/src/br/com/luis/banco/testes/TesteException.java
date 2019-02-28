package br.com.luis.banco.testes;

import br.com.luis.banco.modelo.contacorrente;

public class TesteException {
	
	public static void main(String[] args) {
		
		contacorrente luis = new contacorrente(3300, 200);
		
		luis.deposita(300);
		luis.saca(290);
		
		
		
	}

}
