
public class testeControle {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("luis");
		g1.setSalario(1000);
		double total= g1.geraBonificacao();
		System.out.println(total);
		
		Gerente g2 = new Gerente();
		g2.setSalario(2000);
		
		controleBonificaçao controle = new controleBonificaçao();
		controle.registra(g1);
		controle.registra(g2);
		double soma = controle.getSoma();
		System.out.println(soma);
		
		System.out.println(g2.geraBonificacao());

	}

}
