package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E14 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Dado un n�mero que se introduce por teclado, si es positivo verificar
		 * si se encuentra en el intervalo abierto 60-90, de lo contrario emitir un mensaje de error.*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		int num;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un n�mero.");
		num=entrada.nextInt();
		
		//Comprobaci�n de si es positivo y si se encuentra en el intervalo abierto 60-90
		if (num>0)
		if (num>60 && num<90)
			System.out.println("El n�mero introducido se encuentra dentro del intervalo abierto 60-90.");
		else
			System.out.println("ERROR! El n�mero no se encuentra dentro de intervalo abierto 60-90.");
		else
			System.out.println("ERROR! El n�mero introducido no es positivo");

		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase