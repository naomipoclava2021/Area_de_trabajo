package Clase6;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main (String[] args)
	{Scanner nom = new Scanner(System.in);
		String nombres []= new String [10];  //Vector de nombres
		int ban=0;
	for (int i=0; i<10; i++) //Cargo el vector
	{int aux=0;
		while (aux==0)
	 {  System.out.print("Ingrese el nombre " + (i+1)+ " ");
	  if (nom.hasNextInt())   //Evita ingresos de numeros 
	  { System.out.println("Ingreso no valido ");
	  nom.nextLine();}
	  else
		  {aux=1;
		  nombres[i] = nom.nextLine (); }   } 
		}
     
	System.out.println("Ingrese nombre a buscar ");
	   
	   String busqueda=nom.nextLine();
	   
	for (int i=0; i<10; i++)
	  {if (busqueda.equals(nombres[i]))
	    {ban=1;
	    break;}	
	  }
	   if (ban==1)
	   {System.out.println("Nombre encontrado ");}
	   else
	   {System.out.println("Nombre no encontrado ");}
	
	
	
	}
}
