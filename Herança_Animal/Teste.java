package Herança_Animal;

public class Teste {

	public static void main(String[] args) {
		Cachorro d = new Cachorro("Mia", 3, "Cachorro");
		Gato e = new Gato("Eva", 4, "Gato");
		
		e.emitirSom();
		System.out.print(e.toString());
		d.emitirSom();
		System.out.print(d.toString());
	}

}
