package SalarioPessoa;
import java.util.Scanner;
public class TesteFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual digite nome:");
		String nome = sc.next();
		System.out.println("Qual digite Salaraio:");
		Integer salario = sc.nextInt();
		Double valor = 1.0*salario;
		
		Salario a1 = new Salario( valor, nome );
		System.out.println(a1);
		
	
	}
	
}
