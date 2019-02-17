
public class Conta {
      String titular;
      int agencia;
      int numero;
      double saldo;
      
      void deposita( double valor) {
    	  this.saldo= this.saldo +valor;
      }
      
      public boolean saca (double valor) {
    	  if(this.saldo>=valor) {
    		  this.saldo= this.saldo - valor;
    		  System.out.println("sua transação foi efetivado com sucesso o saldo atual é de"
    		  		+ this.saldo + "reais");
    		  return true;
    	  }
    	  else {
    		  System.out.println("Infelizmente o seu saldo é de " +this.saldo + "reais");
    		  return false;
    	  }
    	  
      }
      
      public boolean transfere (double valor, Conta destino) {
    	  
    	  if(this.saldo>=valor) {
    		  this.saldo -= valor;
    		  destino.saldo += valor;
    		  return true;
    	  }
    	  else {
    		  System.out.println("infelizmente nao deu certo");
    		  return false;
    	  }
      }
}
