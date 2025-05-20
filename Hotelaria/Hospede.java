package Hotelaria;

//Crie as classes Hospede e Reserva. Cada Reserva está associada a um único Hospede.
//Implemente os seguintes requisitos:
//• A classe Hospede deve conter nome, CPF e e-mail.
//• A classe Reserva deve conter número da reserva, data de entrada e data de saída.
//• Ao criar uma reserva, ela deve ser associada a um hóspede.
//• Crie um método exibirResumo() em Reserva que exibe os dados da reserva e os
//dados do hóspede.
//• Incluir nas classes pelo menos 2 métodos construtores e métodos get/set para os atributos
//


public class Hospede {
	private String nome;
	private Integer cpf;
	private String email;
	
	public Hospede() {
		this.nome = "";
		this.cpf = 0;
		this.email = "";
		
	}
	public Hospede(String nome, Integer cpf, String email ) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Hospede [nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	
	
	
	
}
