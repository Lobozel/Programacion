package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E13 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Dado un n�mero entero que se introduce por teclado, determinar si
		 * se encuentra en el intervalo cerrado 51-100*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		int num;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un n�mero.");
		num=entrada.nextInt();
		
		//Comprobaci�n de si se encuentra en el intervalo cerrado 51-100
		if (num>=51 && num<=100)
			System.out.println("El n�mero introducido se encuentra dentro del intervalo cerrado 51-100.");
		else
			System.out.println("El n�mero introducido no est� dentro del intervalo cerrado 51-100.");

		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase