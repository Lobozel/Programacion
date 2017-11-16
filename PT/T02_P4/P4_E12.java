package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E12 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa que lea un car�cter y compruebe si es un n�mero*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		char c;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un n�mero.");
		c=entrada.next().charAt(0);
		
		//Comprobaci�n de si es un n�mero o no
		if (c>=48 && c<=57)
            System.out.println("Has introducido un n�mero.");
        else
        	System.out.println("No has introducido un n�mero.");
		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase