package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelAngel
 *
 */
public class ContarConsonantes {
	/*
	 * Contar el número de consonantes que se encuentran en una cadena.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad;
		int cont=0;
		System.out.println("Introduce una cadena.");
		cad=entrada.nextLine();
		cad=cad.toLowerCase(); //Convierto la cadena a minúscula
		for(int i=0;i<cad.length();i++)
			//Character.isLetter devuelve true si el carácter es una letra
			//Compruebo que sea una letra y que además no sea vocal
			if(Character.isLetter(cad.charAt(i)) && !ContarVocales.esVocal(cad.charAt(i)))
				cont++;
		System.out.println("Has introducido "+cont+" consonantes."
				+ "\nConsiderando 'y' como consonante en lugar de como vocal.");
		entrada.close();

	}

}
