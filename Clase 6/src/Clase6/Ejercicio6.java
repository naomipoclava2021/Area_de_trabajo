package Clase6;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main (String[] args)
	{Scanner num = new Scanner(System.in);
     String ejemplo="0";  //Inicializo las variables globales
	 int ban=0, aux2=0; 
	
	  while (aux2==0)
	 {  System.out.print("Ingrese una palabra ");
	  if (num.hasNextInt())  //Evita ingresos de numeros 
	  { System.out.println("Ingreso no valido ");
	  num.nextLine();}
	  else
		  {aux2=1;
		  ejemplo = num.nextLine (); }   } 
	  
	 int  aux = ejemplo.length()/2;  //Valor medio para comparar palabras
	  
	  
	  for (int i=0; i<aux; i++)    
	  {if   (ejemplo.charAt(i)!=ejemplo.charAt(ejemplo.length()-1-i))  //Comparo caracteres
	  {ban=1;
	  break;}
	  
	  }
	  
	  if (ban==0)        //Bandera para ver si es palindromo
	  { System.out.println ("Es palindromo"); }
	  else
	  {System.out.println ("No es palindromo");}
	  		
	}
 
}

