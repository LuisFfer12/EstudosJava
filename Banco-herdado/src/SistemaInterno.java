
public class SistemaInterno {
	
	private int senha;
	
     public  void autenticando(Autenticavel a) {
		
		boolean autenticou = a.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("entra");
		}else {
			System.out.println("nao entra");
		}
		
	}

}
