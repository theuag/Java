package Biblioteca;

public class Leitor {

	private String nome;
	private Integer numMatricula;
	
	public Leitor() {
		this.nome= "";
		this.numMatricula= 0;
	}
	public Leitor(String nome, Integer numMatricula) {
		this.nome= nome;
		this.numMatricula= numMatricula;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Integer getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(Integer numMatricula) {
		this.numMatricula = numMatricula;
	}
	@Override
	public String toString() {
		return "----------------------------------------------------------\nLeitor [\nNome=" + nome + ", \nnumMatricula=" + numMatricula + "]";
	}
}
