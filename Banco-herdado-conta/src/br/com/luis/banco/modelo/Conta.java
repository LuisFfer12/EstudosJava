package br.com.luis.banco.modelo;


/**
 * Classe modelo para conta corrente e conta poupança
 * @author Luis Fernando
 *
 */

// nao pode instanciar classes abstratas, servem como referencia para cc e cp
public abstract class Conta {
	
      private Cliente titular;
      private int agencia;
      private int numero;
      protected double saldo;
      public static int total;
      
      /**
       * Contrutor da conta
       * @param agencia
       * @param numero
       */
      public Conta(int agencia, int numero) {
    	  total++;
    	  System.out.println("o total de numero de contas é"+ total);
    	  this.agencia = agencia;
    	  this.numero = numero;
      }
      
      /**
       * metodo deposita 
       * @param valor
       */
     public abstract void deposita( double valor);
  
      
      public void saca (double valor) {
    	  if(this.saldo< valor) {
    		  throw new SaldoInvalidoException("deu errado, saldo insuficiente");
    	  }
    	  
    	  this.saldo -= valor;
    	  
    	
    	  
      }
      
      /**
       * metodo para transferir
       * @param valor
       * @param destino
       * @return
       */
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
