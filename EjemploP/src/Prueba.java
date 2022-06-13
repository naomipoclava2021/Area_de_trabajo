import java.util.Scanner;
public class Prueba {
	 public static void main (String[] args)
	 { Scanner num = new Scanner(System.in);  //Inicializa el Scanner
	 
	 int lado1, lado2, lado3;
	 System.out.println ("Ingrese lado 1");
	 lado1= num.nextInt();
	 System.out.println ("Ingrese lado 2");
	 lado2= num.nextInt();
	 System.out.println ("Ingrese lado 3");
	 lado3= num.nextInt();
 
	 if (lado1==lado2 && lado2==lado3)
	 {	 System.out.println ("Triangulo Equilatero");}
	 
	 else
		  {if (lado1==lado2 || lado1==lado3 || lado2==lado3)
		    { System.out.println ("Triangulo Isoceles");  }
		  else
			  
		  {System.out.println ("Triangulo Escaleno"); }
			  
		 
		  }
		 
	 

}}
