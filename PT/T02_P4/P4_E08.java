package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P4_E08 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa que pida al usuario un valor para una variable X
		y calcule y escriba el valor de y en la función y=6x^2+8x-17*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		double x,y;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca el valor de la variable x.");
		x=entrada.nextDouble();
		
		//Solución de la ecuación
		y=6*Math.pow(x, 2)+8*x-17;
		System.out.println("La solución de la ecuación es: "+y);
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase
