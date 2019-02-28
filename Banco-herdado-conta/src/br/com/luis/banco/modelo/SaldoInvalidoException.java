package br.com.luis.banco.modelo;

public class SaldoInvalidoException extends RuntimeException{
	
	public SaldoInvalidoException(String msg) {
		super(msg);
	}

}
