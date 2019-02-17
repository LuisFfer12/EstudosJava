
public abstract class Funcionario {
        private double salario;
        private String cpf;
        private String nome;
        
        public abstract double geraBonificacao() ;
        	
        
        
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
        
}
