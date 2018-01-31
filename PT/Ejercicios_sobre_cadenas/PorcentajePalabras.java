package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class PorcentajePalabras {
/*
 * Ingrese un texto e indique el procentaje de palabras que tiene menos de
 * 5 caracteres y el porcentaje de palabras con 5 o más caracteres
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra="";
		float palabrasLargas=0, palabrasCortas=0, totalPalabras=0;
		
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		
		for(int i=0;i<cad.length();i++) {
			if(cad.charAt(i)!=' ')
				palabra+=cad.charAt(i);
			else {
				totalPalabras++;
				if(palabra.length()<5 && palabra.length()>0)
					palabrasCortas++;
				else
					palabrasLargas++;
				palabra="";
			}
		}
		
		System.out.printf("%s%.2f\n","El porcentaje de palabras con 5 o más caracteres es de: ",(palabrasLargas/totalPalabras*100),"%");
		System.out.printf("%s%.2f\n","El porcentaje de palabras con menos de 5 caracteres es de: ",(palabrasCortas/totalPalabras*100),"%");

		entrada.close();
	}

}
