package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class CuatroVocales {
/*
 * Escribir un programa que cuente el número de palabras en un texto, que
 * tengan al menos cuatro vocales diferentes
 */
	public static int cuatroVocales(String cad) {
		int cont=0;
		String contVocal;
		cad=UnEspacio.limpiarBlancos(cad);
		String cadena[]=cad.split(" ");
		for(int i=0;i<cadena.length;i++) {
			contVocal="";
			for(int j=0;j<cadena[i].length();j++) {
				if(ContarVocales.esVocal(cadena[i].charAt(j)) &&
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
