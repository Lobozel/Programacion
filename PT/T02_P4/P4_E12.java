package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P4_E12 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa que lea un carácter y compruebe si es un número*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		char c;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un número.");
		c=entrada.next().charAt(0);
		
		//Comprobación de si es un número o no
		if (c>=48 && c<=57)
            System.out.println("Has introducido un número.");
        else
        	System.out.println("No has introducido un número.");
		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase