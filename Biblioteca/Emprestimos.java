package Biblioteca;
import java.time.LocalDate;

public class Emprestimos {

	private String nomeL;
	private LocalDate dataEmp;
	private Leitor leitor;
	
	public Emprestimos() {
		this.nomeL = "";
		this.dataEmp = LocalDate.now();
        this.leitor = new Leitor();
	}
	public Emprestimos(String nomeL, Integer empdia, Integer empmes, Integer empano, String nome, Integer numMatricula) {
		this.nomeL = nomeL;
		this.dataEmp = LocalDate.of(empano,empmes , empdia);
		this.leitor = new Leitor(nome, numMatricula);
		
	}
	public String getNomeL() {
		return nomeL;
	}
	public void setNomeL(String nomeL) {
		this.nomeL = nomeL;
	}
	public LocalDate getDataEmp() {
		return dataEmp;
	}
	public void setDataEmp(LocalDate dataEmp) {
		this.dataEmp = dataEmp;
	}
	public Leitor getLeitor() {
		return leitor;
	}
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	@Override
	public String toString() {
		return "Emprestimos [\nnome do Livro=" + nomeL + ", \ndata do Emprestimo=" + dataEmp + ", \n" + leitor + "\n]";
	}
	
	
}

