package br.com.luis.banco.testes;

import br.com.luis.banco.modelo.Conta;
import br.com.luis.banco.modelo.contacorrente;

public class TesteToString {

	public static void main(String[] args) {
		
		Conta cc = new contacorrente(20,40);
		System.out.println(cc);//.tostring() é implicitamente utilizado aqui
		
	}

}
