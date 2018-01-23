package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelAngel
 *
 */
public class ContarVocales {
/*
 * Contar el número de vocales que se encuentran en una cadena.
 */
	/**
	 * Método que devuelve true si el parámetro introducido es una vocal
	 * @param c
	 * @return
	 */
	public static boolean esVocal(char c) {
		//Lo hago con un array para no tener problemas al comparar con vocales con tildes
		char[] vocal = new char[] {'a','á','e','é','i','í','o','ó','u','ú'};
		for(int i=0;i<vocal.length;i++)
			if(vocal[i]==c)
				return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad;
		int cont=0;
		System.out.println("Introduce una cadena.");
		cad=entrada.nextLine();
		cad=cad.toLowerCase(); //Convierto la cadena a minúscula
		for(int i=0;i<cad.length();i++)
			if(esVocal(cad.charAt(i)))
				cont++;
		System.out.println("Has introducido "+cont+" vocales."
				+ "\nSin considerar la 'y' como vocal.");
		entrada.close();

	}

}
