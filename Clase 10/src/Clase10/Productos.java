
package Clase10;

import java.util.ArrayList;

public class Productos {
private String nombre;
private double precio;
private int vencimiento;
private boolean perecedero;


public Productos()
{}

public Productos (String nom, double prec, int venc, boolean pereceder)
{this.nombre=nom;
this.precio = prec;
this.vencimiento=venc;
this.perecedero = pereceder;

}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public int getVencimiento() {
	return vencimiento;
}

public void setVencimiento(int vencimiento) {
	this.vencimiento = vencimiento;
}

public boolean isPerecedero() {
	return perecedero;
}

public void setPerecedero(boolean perecedero) {
	this.perecedero = perecedero;
}


public double calcular( int cantidad)
{double precio_final= this.precio*cantidad;
if (this.perecedero == false)
{;}
else
{if (this.vencimiento == 3) 
{precio_final = precio_final/2;}
else
{if (this.vencimiento == 2)
{precio_final = precio_final/3;}
else
{if (this.vencimiento == 1)
	{precio_final = precio_final/4;}}

}

}

return precio_final;	
}

public void mostrar()
{
double precio_final=calcular(1);
System.out.println ("Producto " + this.nombre);
System.out.println ("Precio " +  precio_final); //Problema modificando el precio
System.out.println ("Es perecedero " + this.perecedero);
if (this.perecedero)
{	
System.out.println ("Vencimiento " + this.vencimiento);
}}


public static void main (String [] args)
{ ArrayList<Productos> lista = new ArrayList <Productos> ();
	System.out.println (lista);
	Productos producto1 = new Productos ("Oreo", 150, 120, true);
	producto1.mostrar();
	Productos producto2 = new Productos ("Pati", 150, 2, true);
    producto2.mostrar();
	Productos producto3 = new Productos ("Jabon", 250, 120, false);
	producto3.mostrar();
	lista.add(producto1);
	lista.add(producto2);
	lista.add(producto3);
	System.out.println (lista.get(1).getNombre());  //Muestro el nombre en el vector
	
	double preciofinal=0;
	for (int i=0; i<lista.size();i++)
	{double precio_producto = lista.get(i).calcular(2);
		preciofinal+=precio_producto;
		//lista.get(i).getPrecio() para imprimir el precio original
		System.out.println ("Producto " + lista.get(i).getNombre()+ " Precio " + precio_producto);
		}
	System.out.println ("Precio total " + preciofinal);
 }


}
