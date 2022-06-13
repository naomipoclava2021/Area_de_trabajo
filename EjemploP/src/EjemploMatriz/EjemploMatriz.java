package EjemploMatriz;
import java.util.Scanner;
import java.util.ArrayList;
public class EjemploMatriz {
	 public static void main (String[] args)   
	 { Scanner num = new Scanner(System.in);  //Inicializa el Scanner
	   ArrayList <String> vector2 = new ArrayList <String>();  //Vector con un indice indefinido
       int []vector = new int [5]; 
	  int [][] matriz = new int [2][2];
     for (int i=0; i<2; i++)
     {
    	 for (int j=0; j<2; j++)
      {System.out.print (" " + matriz [j][i]+ " " );	 }
    	System.out.println();
     }
     
     System.out.print (" " + matriz [0][0]+ " " );
     System.out.print (" " + matriz [0][1]+ " " );
     System.out.print (" " + matriz [1][0]+ " " );
     
	 }
 

        }
 