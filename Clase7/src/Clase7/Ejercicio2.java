package Clase7;

public class Ejercicio2 {
//Constructor por ejemplo, por copia y normal
	//Primero se declaran los atributos
			//ATRIBUTOS
			private String titulo;
			private int numtemporadas;
			private String genero;
			private String creador;
			
			//Constructor por defecto
			public Ejercicio2()
			{}

			public Ejercicio2(String titulo, int numtemporadas, String genero, String creador)
			{this.titulo=titulo;
			this.numtemporadas=numtemporadas;
			this.genero=genero;
			this.creador=creador;}

			public String getTitulo() {
				return titulo;
			}

			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}

			public int getNumtemporadas() {
				return numtemporadas;
			}

			public void setNumtemporadas(int numtemporadas) {
				this.numtemporadas = numtemporadas;
			}

			public String getGenero() {
				return genero;
			}

			public void setGenero(String genero) {
				this.genero = genero;
			}

			public String getCreador() {
				return creador;
			}

			public void setCreador(String creador) {
				this.creador = creador;
			}
			
			public void imprimir ()
			{System.out.println("titulo " + this.titulo);
			 System.out.println("numtemporadas " + this.numtemporadas);
			 System.out.println("genero " + this.genero);
			 System.out.println("creador " + this.creador);	
				
			}
			 public static void main (String[] args) 
			 {Ejercicio2 serie1 = new Ejercicio2 ("It", 2, "Suspenso", "Patricio");
				serie1.imprimir();
				serie1.setTitulo ("El juego del calamar");
				serie1.setNumtemporadas (4);
				serie1.setCreador ("Nacho");
				serie1.setGenero ("Terror");
				 serie1.imprimir();
			 }
			
			
			
}
