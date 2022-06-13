package Clase11;

public class Empleado extends Persona {
public Empleado (String nom, int edad)

{super(nom, edad);}

public void saludar ()
{System.out.println ("Soy un empleado " + this.getEdad() + " años");}

}
