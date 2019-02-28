
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("ini do maisn");
		try {
			metodo1();
		}
		catch(ArithmeticException | MinhaExcecao ex) {
		   String  msg = ex.getMessage();
		   System.out.println(msg);
			
		}
		
		System.out.println("fim do main");
	}
		private static void metodo1() throws MinhaExcecao {
			System.out.println("ini do metodo1");
			metodo2();
			System.out.println("fim do metdodo1");
			
		}
		
		private static void metodo2() {
			System.out.println("ini do metodo2");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				int a = 5/0;
			}
			System.out.println("fim do met2");
		}
	

}
