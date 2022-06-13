package Clase10;

public class Agenda {
private String nombre;
private int telefono;

public Agenda ()
{}

public Agenda (String nom, int tel)
{this.nombre= nom;
this.telefono=tel;}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public boolean equals (Agenda agenda)
{return this.nombre.equals(agenda.getNombre());
}

public String toString()  //Permite mostrar los datos privados
{return "Nombre " + this.nombre + " Numero " + this.telefono;  }

public static void main (String [] args)
{ Agenda contacto1 = new Agenda ("Martin", 12343212);
	
System.out.println (contacto1);

}
}
