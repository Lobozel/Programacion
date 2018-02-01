package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class PalabrasEnColumnas {
/*
 * Escriba un programa que lea una frase y a continuación visualice cada
 * palabra de la frase en columnas, seguida del número de letras que tiene
 * cada palabra
 */
	public static void palabrasEnColumnas(String cad) {
		String[] cadena = new String[1];
		UnEspacio.limpiarBlancos(cad);
		cadena=cad.split(" ");
		System.out.println("Palabra   Longitud");
		for(int i=0;i<cadena.length;i++)
			System.out.println(cadena[i]+"         "+cadena[i].length());
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		palabrasEnColumnas(cad);
		entrada.close();

	}

}
