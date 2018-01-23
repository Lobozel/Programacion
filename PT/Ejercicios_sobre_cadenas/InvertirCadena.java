package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class InvertirCadena {
//Dada una Cadena de caracteres, invertirla.
	/**
	 * Método al que se le pasa un string y devuelve este de forma invertida
	 * @param cad
	 * @return
	 */
	public static String invertirCadena(String cad) {
		String invertida="";
		for(int i=cad.length()-1;i>=0;i--)
			invertida+=cad.charAt(i);
		return invertida;
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad;
		System.out.println("Introduce una cadena.");
		cad=entrada.nextLine();
		System.out.println("La cadena invertida quedaría de la siguiente forma:"
				+ "\n"+invertirCadena(cad));
		entrada.close();

	}

}
