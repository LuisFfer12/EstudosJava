
public class TestaContas {

	public static void main(String[] args) {
		
		contacorrente cc = new contacorrente(33,44);
		contapoupanca cp = new contapoupanca(22,55);
		cc.deposita(500);
		cp.deposita(500);
		
		System.out.println("Saldo antes " + cc.getSaldo());
		System.out.println("Saldo antes " + cp.getSaldo());
		
		cc.saca(200);
		
		//System.out.println("Saldo depois " + cc.getSaldo());
		System.out.println("Saldo depois " + cc.getSaldo());
		
	}

}
