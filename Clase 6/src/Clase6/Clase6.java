package Clase6;
import java.util.Scanner;
public class Clase6 {
	 public static void main (String[] args)
	 {  int[] vector = new int [10];
	 
	cargar (vector);
	 imprimir (vector);
	 }
	 
	 
	public static void cargar (int [] vector)
	{  Scanner lectura = new Scanner (System.in);
		for (int i=0; i<10; i++)
	{System.out.print ("Ingrese el n�mero " + (i+1) + " : ");
	  vector [i] = lectura.nextInt ();}
	
	
	
	}
	public static void imprimir (int [] vector)
	{for (int i=0; i<10; i++)
	{System.out.println ("Numero " + (i+1) + vector[i]);}	
	
	}
	
	
}
