package ifsp;
import java.util.Scanner;

public class Relogio {
	
		private Integer hora;
		private Integer min;
		private Integer seg;
		
		public Relogio(Integer a, Integer b, Integer c) {
			hora = a;
			min = b;
			seg = c;
		}

	    public void setHora(Integer a) {
	    	this.hora = a;
	    }
		public Integer getHora() {
			return hora;
			}
	    public void setSeg(Integer c) {
	    	this.seg = c;
	    }
		public Integer getSeg() {
			return seg;
			}
		public void setMin(Integer b) {
		   this.min = b;
		    }
		public Integer getMin() {
				return min;
				}
		
	    public void setRelogio(Integer a, Integer b, Integer c) {
	    	this.hora = a;
	    	this.min = b;
	    	this.seg = c;
	    	
	    }
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Horas:");
		    	int a = sc.nextInt();
		     	System.out.println("Minutos:");
		    	int b = sc.nextInt();
		     	System.out.println("Segundos:");
		    	int c = sc.nextInt();
		    	
	    	
	    	Relogio tempo = new Relogio(a, b, c);
	    	System.out.println(tempo.getHora() + ":" + tempo.getMin() +":"+tempo.getSeg());
	    	
	    }
	    
	    
}


//Escreva o código fonte da classe Relógio, incluir 3 atributos, 3 métodos construtores,
//métodos de acesso get/set;