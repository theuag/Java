package ifsp;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Integer prontint = 0;
		Scanner sc = new Scanner(System.in);
		String pront = "";
		do {
		System.out.println("Digite o 5 primeiros digitos do prontuario:");
		pront = sc.next();
		}while(pront.length()!= 5);
			char digito0 = pront.charAt(0);
			char digito1 = pront.charAt(1);
			char digito2 = pront.charAt(2);
			char digito3 = pront.charAt(3);
			char digito4 = pront.charAt(4);
			Integer prontint0= Integer.valueOf(digito0)-48;
			Integer prontint1= Integer.valueOf(digito1)-48;
			Integer prontint2= Integer.valueOf(digito2)-48;
			Integer prontint3= Integer.valueOf(digito3)-48;
			Integer prontint4= Integer.valueOf(digito4)-48;
			
			
		//digito 1
		for (int x = 0; x <= 311; x++ ) {
			if (x % 2 != 0)
			System.out.println(x);
		}
		
		
		//digito 2
		Integer soma = 0;
		int y= 1;
		for (y = 1; y <= prontint1; y++ ) {
			soma += y;
		}
		System.out.println(soma + prontint1);
		
		
		//digito 3
		for(int x = 0; x <= 10; x++) {
			Integer tabuada = x*prontint2;
			System.out.println(x +" * "+ prontint2 +" = "+ tabuada);
		}
		
		
		//digito 4
		switch (prontint3) {
			case 1:
			System.out.println("janeiro");
			break;
			case 2:
			System.out.println("fevereiro");
			break;
			case 3:
			System.out.println("março");
			break;
			case 4:
			System.out.println("abril");
			break;
			case 5:
			System.out.println("maio");
			break;
			default:
			System.out.println("Mes invalido");
		}
		//digito 5
		for (int x = 0; x <= 100; x++ ) {
			if (x % prontint4 == 0)
				System.out.println(x);
		}
	}
}