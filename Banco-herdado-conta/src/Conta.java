// nao pode instanciar classes abstratas, servem como referencia para cc e cp
public abstract class Conta {
	
      private Cliente titular;
      private int agencia;
      private int numero;
      protected double saldo;
      public static int total;
      
      
      public Conta(int agencia, int numero) {
    	  total++;
    	  System.out.println("o total de numero de contas é"+ total);
    	  this.agencia = agencia;
    	  this.numero = numero;
      }
      
     public abstract void deposita( double valor);
  
      
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
      
      public double getSaldo() {
    	  return this.saldo;
      }
      
      public int getAgencia() {
    	  return this.agencia;
      }
      
      public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
      
      public int getNumero() {
    	  return this.numero;
      }
      
      public void setNumero( int novoNumero) {
    	  this.numero= novoNumero;
      }
      
      public void setTitular(Cliente titular) {
		this.titular = titular;
	}
      public Cliente getTitular() {
		return titular;
	}
}
