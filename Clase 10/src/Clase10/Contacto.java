package Clase10;

public class Contacto {
private Agenda[] contactos;

	public Contacto()
	{}
	
	public Contacto (int tamaño)
	{this.contactos = new Agenda [tamaño];}
	
	public int Huecos()
	{int contador=0;
	for (int i=0; i< contactos.length; i++)
	{if (contactos [i]== null)
	{contador++;}
			}
	return contador;
	}
	
	public static void main (String [] args)
	{ Contacto mi_agenda = new Contacto (10);}
	//System.out.println (this.contactos);
}
