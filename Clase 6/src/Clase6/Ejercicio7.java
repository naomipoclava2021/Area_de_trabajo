package Clase6;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main (String[] args)
	{Scanner pal = new Scanner(System.in);
	String ejemplo="0";   //Inicializo las variables
	int aux=0, vocal=0, consonante=0;
	
	while (aux==0)
	 {  System.out.print("Ingrese una palabra ");
	  if (pal.hasNextInt())   //Evita ingresos de numeros 
	  { System.out.println("Ingreso no valido ");
	  pal.nextLine();}
	  else
		  {aux=1;
		  ejemplo = pal.nextLine (); }   } 

for (int i=0; i<ejemplo.length() ;i++)
    {if (ejemplo.charAt(i)=='a'||ejemplo.charAt(i)=='e'|| ejemplo.charAt(i)=='i'||ejemplo.charAt(i)=='o'||ejemplo.charAt(i)=='u' )
       {vocal++;}
    else 
    {if (ejemplo.charAt(i)!=' ')  //Salteo espacios
    {	consonante++;}}
    
    }
System.out.println("Cantidad de vocales " + " " + vocal);
System.out.println("Cantidad de consonantes " + " " + consonante);
	}
	
	
}
