package Clase6;
import java.util.Scanner;
public class PracticoVector {
	 public static void main (String[] args)
	 {  int[] vector = new int [10];
	cargar (vector);
	
	 imprimir (vector);
	 }
	 
	 
	public static void cargar (int [] vector)
	{  int b=0;
		Scanner lectura = new Scanner (System.in);
		for (int i=0; i<10; i++)
	{System.out.print ("Ingrese el número " + (i+1) + " : ");
	  vector [i] = lectura.nextInt ();}	
	System.out.print ("Ingrese posicion a borrar ");
    while (b==0) 
    {  int i=lectura.nextInt ();
     if (i<10)
     { 
      b=1;}
     else
     {System.out.print("Numero incorrecto, vuelva a ingresarlo");}	 
	   }
		
	}
	
	
	public static void imprimir (int [] vector)
	{for (int i=0; i<10; i++)
	{System.out.println ("Numero" + (i+1) + " " + vector[i]);}	
	
	}
	
	
}
