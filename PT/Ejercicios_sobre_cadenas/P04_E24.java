package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class P04_E24 {
/*
 * Escribir un programa que cuente el número de palabras en un texto, que
 * tengan al menos cuatro vocales diferentes
 */
	/**
	 * Método del ejercicio 21 que utilizo en este ejercicio.
	 * @param cad
	 * @return
	 */
	protected static String limpiarBlancos(String cad) {
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
	
	/**
	 * Método del ejercicio 2 que utilizo en este ejercicio
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
	
	/**
	 * 
	 * @param cad
	 * @return
	 */
	public static int cuatroVocales(String cad) {
		int cont=0;
		String contVocal;
		cad=limpiarBlancos(cad);
		String cadena[]=cad.split(" ");
		for(int i=0;i<cadena.length;i++) {
			contVocal="";
			for(int j=0;j<cadena[i].length();j++) {
				if(esVocal(cadena[i].charAt(j)) &&
						!contVocal.contains(String.valueOf(cadena[i].charAt(j))))
				contVocal+=cadena[i].charAt(j);
			}
			if(contVocal.length()>=4)
				cont++;
		}
		return cont;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println("Hay "+cuatroVocales(cad)+" palabras con 4 o más vocales diferentes.");
		entrada.close();

	}

}
