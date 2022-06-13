package Clase9;

public class Raices {
//Atributos
	private double a;
	private double b;
	private double c;
	
	//Constructor por defecto
	public Raices ()
	{}
	
	public Raices (double a, double b, double c)
	{this.a=a;
	this.b=b;
	this.c=c;}

	//Getter y Setter
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public void obtenerRaices()
	{double raiz1 = (-this.b+ Math.sqrt(getDiscriminante()))/(2*this.a);
	System.out.println ("La raiz uno es " + raiz1);
	double raiz2 = (-this.b - Math.sqrt(getDiscriminante()))/(2*this.a);
	System.out.println ("La raiz dos es " + raiz2);
	}
	
	public void obtenerRaiz()
	{ if (this.getDiscriminante () ==0 )
	{double raiz1 = (-this.b+ Math.sqrt(getDiscriminante()))/(2*this.a);
	System.out.println ("Unica Raíz " + raiz1);} 	
	}	
	
	
	public double getDiscriminante()
	{ 
	return ((this.b*this.b)-4*this.a*this.c);
	}
	//Returna un booleano de verdadero o falso
	public boolean tieneRaices ()
	{return (this.getDiscriminante()>0); }
	
	public boolean tieneRaiz()
	{return (this.getDiscriminante() == 0 );}
	
	public void calcular ()
	{if (this.tieneRaices())
		{this.obtenerRaices() ;   }
	else if (this.tieneRaiz())
	{this.obtenerRaiz();}
	else
	{System.out.println ("El sistema no tiene raices reales");}
	}
	
	public static void main (String [] args)
	{ Raices raiz1= new Raices (2,9,2);
	System.out.println (raiz1.getDiscriminante()); //Imprimo el discriminante
	 raiz1.calcular();
		
		
	}
	
}
