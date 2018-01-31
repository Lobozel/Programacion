package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class IntercalarPalabras {
/*
 * Hacer un programa que al recibir como datos dos cadenas de caracteres
 * forme una tercera cadena intercalando los caracteres de las palabras de
 * las cadenas recibidas
 */
	public static String intercalarPalabras (String cad1, String cad2) {
		String result="";
		String menor="";
		String mayor="";
		
		
		if(cad1.length()<=cad2.length()) {
			menor=cad1;
			mayor=cad2;
		} else {
				menor=cad2;
				mayor=cad1;
		}
		
		
		for(int i=0;i<menor.length();i++) {
			result+=menor.charAt(i);
			result+=mayor.charAt(i);
		}
		
		result+=mayor.substring(menor.length(), mayor.length());
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena.");
		String cad1=entrada.nextLine();
		System.out.println("Introduce otra cadena.");
		String cad2=entrada.nextLine();
		
		System.out.println(intercalarPalabras(cad1,cad2));
		
		entrada.close();

	}

}
