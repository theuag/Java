package ifsp;


public class Relogio {
	
		private Integer hora;
		private Integer min;
		private Integer seg;
		
		public Relogio(Integer a, Integer b, Integer c) {
			hora = a;
			min = b;
			seg = c;
		}

	    public void setHoras(Integer a) {
	    	this.hora = a;
	    }
		public Integer getHoras() {
			return hora;
			}
	    public void setSegundos(Integer b) {
	    	this.seg = b;
	    }
		public Integer getSegundos() {
			return seg;
			}
		public void setMinutos(Integer c) {
		   this.min = c;
		    }
		public Integer getMinutos() {
				return min;
				}
		
	    public void setRelogio(Integer a, Integer b, Integer c) {
	    	this.hora = a;
	    	this.min = b;
	    	this.seg = c;
	    	
	    }
	    public static void main(String[] args) {
	    	Relogio tempo = new Relogio(10, 8, 40);
	    	tempo.setHoras(22);
	    	System.out.println(tempo.getHoras() + ":" + tempo.getMinutos() +":"+tempo.getSegundos());
	    	
	    }
	    
	    
}


//Escreva o código fonte da classe Relógio, incluir 3 atributos, 3 métodos construtores,
//métodos de acesso get/set;