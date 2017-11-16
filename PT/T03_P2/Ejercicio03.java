package T03_P2;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Ejercicio03 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Escribir un programa que lea la hora en notación de 24 horas y que 
	 * imprima en notación de 12; por ejemplo, si la entrada es 13:45, la salida 
	 * será 1:45 pm. El programa debe solicitar al usuario que introduzca 
	 * exactamente cinco caracteres para especificar una hora; por ejemplo, las 
	 * 9 en punto se debe introducir así: 09:00.
	 */
public static void main(String[] args) { //Se abre el método main

	//Declaración de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	String hora="";
	//**************************
	
	//Leer la hora
	do{
		System.out.println("Introduce la hora de la siguiente forma: hh:mm");
		hora=entrada.nextLine();
	}while(hora.length() != 5 || hora.charAt(2) != ':' ||
			Integer.parseInt(hora.substring(0, 2)) > 23 ||
			Integer.parseInt(hora.substring(0, 2)) < 0 ||
			Integer.parseInt(hora.substring(3, 5)) > 59 ||
			Integer.parseInt(hora.substring(3, 5)) < 0);
	/**
	 * <h2>Explicación del while</h2>
	 * Se repite mientras la cadena no tenga una longitud de 5, o el carácter en la segunda posición no sea ':',
	 * o el número que haya entre la posición 0 y la 2 sea mayor que 23 o menor que 0,
	 * o el número que haya entre la posición 3 y la 5 sea mayor que 59 o menor que 0.
	 */
	//**************************
	
	//Se comprueba si la hora supera las 12 y se le asigna pm o am según corresponda.
	if(Integer.parseInt(hora.substring(0, 2)) > 12) //Si el número que haya entre la posición 0 y la 2 es mayor que 12, se cumple la condición.
		//Se le resta 12 al primer número, se le concatena la cadena tal como estaba antes desde la posición 2 a la 5 de esta y se añade " pm" al final.
		hora =(Integer.parseInt(hora.substring(0, 2))-12)+hora.substring(2, 5)+" pm";
	else
		//Se añade a la cadena " am" al final de esta.
		hora +=" am";
	//**************************

	//Se muestra la hora
	System.out.println(hora);
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el método main

} // Se cierra la clase
