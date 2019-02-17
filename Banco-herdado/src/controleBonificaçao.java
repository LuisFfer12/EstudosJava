
public class controleBonificaçao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		
		double boni =  f.geraBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
