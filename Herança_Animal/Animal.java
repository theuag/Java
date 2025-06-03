package Herança_Animal;

//Crie uma classe Animal com os atributos nome e idade, e um método emitirSom().
//Depois, crie duas subclasses: Cachorro e Gato. Ambas devem sobrescrever o método
//emitirSom() para exibir "Latido" e "Miau", respectivamente. Incluir os métodos equals e
//toString da classe Object

public class Animal {
	private String nome;
	private Integer idade;
	private String animal;
	
	public Animal() {
		this.nome = "";
		this.idade = 0;
		this.animal = "";
	}
	
	public Animal(String nome, Integer idade, String animal) {
		this.nome = nome;
		this.idade = idade;
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "\nAnimal [nome=" + this.nome + ", idade=" + this.idade + ", animal=" + this.animal + "]\n";
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void emitirSom() {
		
		if (this.animal == "Cachorro")
			System.out.println("Latido");
		else if (this.animal == "Gato")
			System.out.println("Miado");
	}
	

}
