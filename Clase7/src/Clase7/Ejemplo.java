package Clase7;

public class Ejemplo {

	//ATRIBUTOS
	private int cant_ruedas;
	private String modelo;
	private int cant_puertas;
	private String marca;
	private String tipo_motor;
	private boolean levanta_cristales;
	private String patente;
	private String color;
	
	public Ejemplo()  //Constructor por defecto
	{}
	
	//Constructor copia
	public Ejemplo (Ejemplo ejemplo)
	{this.modelo=modelo;
	this.tipo_motor=tipo_motor;
	this.marca=marca;
	this.color=color;}
	
	
	public Ejemplo(String modelo, String tipo_motor, String marca, String color)
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
	
	
	 public static void main (String[] args) 
	 {Ejemplo clio = new Ejemplo ("Clio", "1.4", "Renault", "Gris");
     String marca=clio.modelo;	

     clio.mostrar();
     Ejemplo clio2 = new Ejemplo (clio);
     clio2.mostrar();
	 }
	 
	
}
