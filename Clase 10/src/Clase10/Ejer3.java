package Clase10;



//PROGRAMACION ORIENTADA A OBJETOS

public class Ejer3 {
   //ATRIBUTOS  
	private String nombre;
	private String apellido;
	private String domicilio;
	private String dni;
	private int edad;
	private String cuil;
	private double altura;
	private double peso;
	private double sueldo;
	
	
	//CONSTRUCTORES
	public Ejer3 ()  //Constructor por defecto
	{}
	public Ejer3 (String nombre, String apellido, String dni, int edad, double sueld) //Traigo las variables
	{this.nombre =nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.edad = edad;
	this.sueldo = sueld;
	}
	
	public void mostrar ()  //Funcion a mostrar
	{System.out.println("Nombre" + this.nombre);
	System.out.println("Apellido " + this.apellido);
	System.out.println("Dni " + this.dni);
	System.out.println("edad " + this.edad);
	System.out.println("sueldo " + sueldo);}
	
	public double Calculasueldo(int horas)
	{this.sueldo= this.sueldo*horas;
	System.out.println (sueldo);
		return sueldo;
		
	}
	
	 public static void main (String[] args) 
	 {Ejer3 Martin = new Ejer3 ("Martin", "Pasqua", "123123", 23, 500);
		 System.out.println(Martin); //No lo permite porque es privado
		 
		Martin.Calculasueldo(5);
	Martin.mostrar();	 
	 }
	 
	
}

