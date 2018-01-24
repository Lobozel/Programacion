package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class CaracteresImpares {
/*
 * Ingresar una cadena de caracteres y obtener otra con todos los
 * caracteres de las posiciones impares de la cadena
 */
	public static String caracteresImpares(String cad) {
		String charimpar="";
		for(int i=0;i<=cad.length()-1;i=i+2)
			charimpar+=cad.charAt(i);
		return charimpar;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println("La cadena, con solo los caracteres impares, quedaría tal que:"
				+ "\n"+caracteresImpares(cad));
		entrada.close();
	}
}
