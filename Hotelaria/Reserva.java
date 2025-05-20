package Hotelaria;
import java.time.LocalDate;


public class Reserva {
	private Integer numero;
	private LocalDate entrada;
	private LocalDate saida;
	private Hospede hospede;
	
	public Reserva() {
		this.numero = 0;
		this.entrada = LocalDate.now();
		this.saida = LocalDate.now();
		this.hospede = new Hospede();
		
	}
	public Reserva(
			Integer numero, 
			Integer entradaDia,
			Integer entradaMes,
			Integer entradaAno,
			Integer saidaDia,
			Integer saidaMes,
			Integer saidaAno,
			String nome,
			Integer cpf,
			String email
	) {
		this.numero = numero;
		this.entrada = LocalDate.of( entradaAno, entradaMes, entradaDia );
		this.saida = LocalDate.of( saidaAno, saidaMes, saidaDia );
		this.hospede = new Hospede( nome, cpf, email );
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public LocalDate getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}
	
	public LocalDate getSaida() {
		return saida;
	}
	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}
	
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	@Override
	public String toString() {
		return "Reserva [\nnumero=" + numero + ", \nentrada=" + entrada + ", \nsaida=" + saida + ", \nhospede=" + hospede + "]";
	}
	
	
	
}
