package T02_P4;
import java.util.Scanner; //importo Scanner

/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E07 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa Java que pida las notas de las tres evaluaciones de un alumno
		y calcule la nota final (media). La nota final es un n�mero entero*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		int nota; //
		//------------------------
		
		//Lectura de notas
		System.out.println("Introduce la nota de la primera evaulaci�n.");
		nota=entrada.nextInt();
		System.out.println("Introduce la nota de la segunda evaulaci�n.");
		nota+=entrada.nextInt();
		System.out.println("Introduce la nota de la tercera evaulaci�n.");
		nota+=entrada.nextInt();
		
		//Muestra la media de las notas
		System.out.println("La nota final es "+nota/3);
		
		
		entrada.close(); //Se cierra el objeto Scanner.

	}//Se cierra el main

}//Se cierra la clase
