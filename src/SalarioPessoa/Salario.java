package SalarioPessoa;

public class Salario {
		private Double valor;
		private Pessoa pessoa;
		private static Integer npessoas = 0;
		
		
		public Salario() {
			this.valor = 0.0;
			this.pessoa = new Pessoa();
			npessoas++;
		}
		public Salario(Double valor, String nome) {
			this.valor = valor;
			this.pessoa = new Pessoa(nome);
			npessoas++;
			
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		public Pessoa getPessoa() {
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		public Integer getnpessoas() {
			return npessoas;
		}
		public static void setpessoas(Integer npessoas) {
			npessoas++;
		}
		@Override
		public String toString() {
			return "Salario \n[valor=" + valor + "]\n"+ pessoa +"";
		}
		
}
