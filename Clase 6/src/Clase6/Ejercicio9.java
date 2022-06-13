package Clase6;

public class Ejercicio9 {
	 public static void main (String[] args) 
	 {
	  int [][] matriz = new int [3][3];
	  int cont=1;
	     for (int i=0; i<3; i++)
	     {
	    	 for (int j=0; j<3; j++)
	      {matriz [j][i]=cont;
	        cont++;
	        System.out.print (" " + matriz [j][i]+ " " );	 }
	    	System.out.println();
	     }
	     
}
}