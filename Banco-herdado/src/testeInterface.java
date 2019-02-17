
public class testeInterface {

	public static void main(String[] args) {
		 Autenticavel luis = new Cliente();
		SistemaInterno si = new SistemaInterno();
		
		luis.setSenha(22);
		System.out.println(luis.autentica(21));
		si.autenticando(luis);
		

	}

}
