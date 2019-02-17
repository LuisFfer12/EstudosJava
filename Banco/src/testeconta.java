
public class testeconta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		primeiraConta.saldo=1000;
		primeiraConta.agencia=20;
		segundaConta.saldo= 1000;
		primeiraConta.transfere(500, segundaConta);
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
	}

}
