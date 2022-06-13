package Clase7;

public class Ejemplo2 {
	
	//Primero se declaran los atributos
		//ATRIBUTOS
		private int cant_ruedas;
		private String modelo;
		private int cant_puertas;
		private String marca;
		private String tipo_motor;
		private boolean levanta_cristales;
		private String patente;
		private String color;
		
		public Ejemplo2()  //Constructor por defecto
		{}  
		//Se declara parecido a una funcion
		public Ejemplo2(String modelo, String tipo_motor, String marca, String color)
		{this.modelo=modelo;
		this.tipo_motor=tipo_motor;
		this.marca=marca;
		this.color=color;
		}
		
		public void mostrar ()  //Funcion a mostrar
		{System.out.println("modelo " + this.modelo);
		System.out.println("tipo de motor " + this.tipo_motor);
		System.out.println("marca " + this.marca);
		System.out.println("color " + this.color);}
		
		public String getModelo()
		{return this.modelo;}
		public String getMarca()
		{return this.marca;}
		
		 public static void main (String[] args) 
		 {Ejemplo2 clio = new Ejemplo2 ("Clio", "1.4", "Renault", "Gris");
		 System.out.println("modelo " + clio.getModelo());
		 System.out.println("marca " + clio.getMarca());
		 }
		 
	

}
