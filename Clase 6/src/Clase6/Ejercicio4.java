package Clase6;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio4 {
	 public static void main (String[] args)   
	 { Scanner num = new Scanner(System.in);  //Inicializa el Scanner
	 int i=0, b=0,aux=0;
	  ArrayList <Integer> vector = new ArrayList <Integer>();  //Vector con un indice indefinido
	  ArrayList <Integer> vectorPar = new ArrayList <Integer>();
	  ArrayList <Integer> vectorImpar = new ArrayList <Integer>();
	  while (aux==0)
	 { 
	  System.out.print("Ingrese numero ");
	  if (!num.hasNextInt())
	  { if (num.next().equals("fin"))
	  {aux=1;}
	  else
		  {System.out.println("Caracter no valido ");
		  num.nextLine();}}
	  else
	  {b = num.nextInt ();
	 vector.add (b);
	  i++;}
	 }
	 Collections.sort(vector);

	  
	   for (i=0; i<vector.size(); i++)
	   { if (vector.get(i)%2==0)
	    {vectorPar.add (vector.get(i));}
	   else
	   {vectorImpar.add (vector.get(i));}
		   
		   
	   }	 
	 
	   System.out.println (vector);
	   System.out.println (vectorImpar);
	   System.out.println (vectorPar);
	 
	 }
	 
}
