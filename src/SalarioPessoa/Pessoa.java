package SalarioPessoa;

public class Pessoa {
		private String nome;
		
		
		public Pessoa() {
			this.nome = "";
			
		}
		
		public Pessoa(String nome) {
			this.nome = nome;
			
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	

		@Override
		public String toString() {
			return "Pessoa\n [nome=" + nome + "]";
		}
}
