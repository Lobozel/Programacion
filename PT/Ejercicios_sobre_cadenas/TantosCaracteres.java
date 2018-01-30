package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author Miguelángel
 *
 */
public class TantosCaracteres {
/*
 * Ingresar una cadena de caracteres formadas por números y letras, en
 * ese orden y obtenga otra cadena donde aparezca cada letra tantas
 * veces como lo indique el numero que lo precede. Ejemplo: Si la cadena
 * es 2w4r5f debemos obtener la siguiente cadena: wwrrrrfffff
 */
	public static String tantosCaracteres(String cad) {
		String result="";
		
		
				
		
		return result;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad;
		do {
		System.out.println("Introduce una cadena formada por números y letras, en ese orden."
				+ "\nPor ejemplo: 2w4r5f.");
		cad=entrada.nextLine();
		}while(Character.isLetter(cad.charAt(0)));
		System.out.println("El resultado será el siguiente: "+tantosCaracteres(cad));
		entrada.close();
	}

}
