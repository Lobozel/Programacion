package Ejercicios_sobre_cadenas;

import java.util.Scanner;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class ContarPalabras {

	public static int contarPalabras(String cad) {
		int cont=0;
		for(int i=1;i<cad.length();i++) {
			if(Character.isSpaceChar(cad.charAt(i)) && !Character.isSpaceChar(cad.charAt(i-1))
			|| !Character.isSpaceChar(cad.charAt(i)) && i+2>cad.length())
				cont++;
		}
		return cont;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println("En la cadena: "+cad+""
				+ "\nHas introducido "+contarPalabras(cad)+" palabras.");
		entrada.close();
		
	}

}
