package Clase11;

public class Alumno extends Persona {
	private int grupo;
	private String horario;
public Alumno (String nom, int edad, int grup, String hor)

{super(nom, edad);  //Super solo sube un nivel
this.grupo=grup;
this.horario=hor;

}



public void saludar ()
{System.out.println ("Soy un alumno de " + this.getEdad() + " años");}

}
