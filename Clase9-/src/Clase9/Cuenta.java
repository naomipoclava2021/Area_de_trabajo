package Clase9;

public class Cuenta {
 private String titular;
 private double cantidad;
 //Constructores
 public Cuenta ()
 {}
 //Constructor 1
 public Cuenta(String titular, double cantidad)
 {this.titular=titular;
 this.cantidad=cantidad;}
//Constructor 2
 public Cuenta (String titular)
 {this.titular=titular;}
 
//Atributos 
public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getCantidad() {
	return cantidad;
}

public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}

//Funciones
 public void mostrar()
 {System.out.println("Nombre del titular " + this.titular);
 System.out.println("Cantidad en cuenta " + this.cantidad);}
 
 public void ingresar (double cant)
 {if (cant>0)
   {this.cantidad +=cant;}
 }

 public void retirar (double cant)
 {if (cant>0)
 {this.cantidad-=cant;}	 
 }

public static void main (String [] args)

{Cuenta cuenta1 = new Cuenta ("Martin", 2000);

cuenta1.mostrar();

cuenta1.retirar(2500);
System.out.println (cuenta1.getCantidad());
cuenta1.ingresar (3200);

System.out.println (cuenta1.getCantidad());

}


}
