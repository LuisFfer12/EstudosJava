
public class testa {

	public static void main(String[] args) {
		Conta primeira = new Conta(44,55);
		primeira.setNumero(30);
		Cliente luis = new Cliente();
		luis.setCpf("3123132");
		primeira.setTitular(luis);
		System.out.println(primeira.getAgencia());
		//System.out.println(primeira.getTitular().getCpf());

	}

}
