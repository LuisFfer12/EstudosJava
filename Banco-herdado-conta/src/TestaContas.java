
public class TestaContas {

	public static void main(String[] args) {
		
		contacorrente cc = new contacorrente(33,44);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
		
		
		
	}

}
