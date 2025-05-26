package Hotelaria;

public class TesteReversa {

	public static void main(String[] args) {
		
		Reserva r1 = new Reserva(5, 10,5,2025,20,5,2025,"Bernardo",12345,"domingosber@gmail.com");
		
		System.out.println( r1 );
		
		System.out.println( "--------------------------------------");
		
		Reserva r2 = new Reserva(6, 1,6,2025,30,6,2025,"Matheus",54321,"matheus@gmail.com");

		System.out.println( r2 );
		
	}

}
