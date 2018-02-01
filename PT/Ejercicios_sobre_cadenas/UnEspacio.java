package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class UnEspacio {
/*
 * Escriba un programa que lea una frase, sustituir todas las secuencias de
 * dos o varios blancos por un solo blanco y visualizar la frase obtenida
 */
	public static String limpiarBlancos(String cad) {
		String result="";
		String[] cadena = new String[1];
		cadena=cad.split(" ");
		for (int i=0;i<cadena.length;i++) {
			cadena[i]+=" ";
			if(!cadena[i].equals(" "))
				result+=cadena[i];
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena con muchos espacios en blanco.");
		String cad=entrada.nextLine();
		System.out.println(limpiarBlancos(cad));
		entrada.close();

	}

}
