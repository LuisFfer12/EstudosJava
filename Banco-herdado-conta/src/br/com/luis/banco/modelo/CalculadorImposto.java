package br.com.luis.banco.modelo;
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
	

}
