
public class SistemaInterno {
	
	private int senha=22;
	
     public  void autenticando(Autenticavel a) {
		
		boolean autenticou = a.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("entra");
		}else {
			System.out.println("na entra");
		}
		
	}

}
