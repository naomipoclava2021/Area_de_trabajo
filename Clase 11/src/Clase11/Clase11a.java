package Clase11;
//La clase suprema es la de persona
public class Clase11a {
 public static void main (String [] arg)
 { Alumno mi_alumno = new Alumno ("Martin",23, 3, " Cinco de la tarde ");
  mi_alumno.saludar();
	 
   Empleado mi_empleado= new Empleado ("Mario", 35);
   mi_empleado.saludar();
	//Lo traigo a todo de las clases creadas
   System.out.println(mi_alumno.getMascota().getNombre());
   mi_alumno.getMascota().ladrar();
	 
 }
 
 
}
