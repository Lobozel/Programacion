package T03_P2;

import java.util.Scanner;

/**
 * 
 * @author Miguel�ngel
 *
 */

public class Ejercicio03 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Escribir un programa que lea la hora en notaci�n de 24 horas y que 
	 * imprima en notaci�n de 12; por ejemplo, si la entrada es 13:45, la salida 
	 * ser� 1:45 pm. El programa debe solicitar al usuario que introduzca 
	 * exactamente cinco caracteres para especificar una hora; por ejemplo, las 
	 * 9 en punto se debe introducir as�: 09:00.
	 */
public static void main(String[] args) { //Se abre el m�todo main

	//Declaraci�n de variables
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
	 * <h2>Explicaci�n del while</h2>
	 * Se repite mientras la cadena no tenga una longitud de 5, o el car�cter en la segunda posici�n no sea ':',
	 * o el n�mero que haya entre la posici�n 0 y la 2 sea mayor que 23 o menor que 0,
	 * o el n�mero que haya entre la posici�n 3 y la 5 sea mayor que 59 o menor que 0.
	 */
	//**************************
	
	//Se comprueba si la hora supera las 12 y se le asigna pm o am seg�n corresponda.
	if(Integer.parseInt(hora.substring(0, 2)) > 12) //Si el n�mero que haya entre la posici�n 0 y la 2 es mayor que 12, se cumple la condici�n.
		//Se le resta 12 al primer n�mero, se le concatena la cadena tal como estaba antes desde la posici�n 2 a la 5 de esta y se a�ade " pm" al final.
		hora =(Integer.parseInt(hora.substring(0, 2))-12)+hora.substring(2, 5)+" pm";
	else
		//Se a�ade a la cadena " am" al final de esta.
		hora +=" am";
	//**************************

	//Se muestra la hora
	System.out.println(hora);
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
