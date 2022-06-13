package Clase11;

public class Persona {
 private String nombre;
 private int edad;
 private Mascota mascota;
 
 
 public Persona (String nom, int edad)
 {this.nombre=nom;
 this.edad= edad;
 this.mascota= new Mascota ("Boby", "Caniche");
 
 }
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
 
//Debo hacer set y getter de mascota
 public Mascota getMascota() {
	return mascota;
}
public void setMascota(Mascota mascota) {
	this.mascota = mascota;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public void saludar ()

 {System.out.println ("Hola soy una persona");}
 
}

