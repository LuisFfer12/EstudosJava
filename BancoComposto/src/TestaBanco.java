
public class TestaBanco {

	public static void main(String[] args) {
		Cliente luis = new Cliente();
		luis.cpf="123";
		luis.profissao="pedreiro";
		
		Conta contaLuis = new Conta();
		
		contaLuis.titular= luis;
System.out.println(contaLuis.titular);
	}

}
