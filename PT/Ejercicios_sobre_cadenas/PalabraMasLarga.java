package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class PalabraMasLarga {
/*
 * Leer una frase y encontrar la palabra de mayor longitud. El programa
 * debe imprimir la palabra como el número de caracteres de la misma.
 */
	public static String palabraMasLarga(String cad) {
		String palabraLarga="";
		String aux="";
		for(int i=0;i<cad.length();i++) 
			if(Character.isLetter(cad.charAt(i))) {
				for(int j=i;j<cad.length()&&!Character.isSpaceChar(cad.charAt(j));j++) {
					aux+=cad.charAt(j);
					i=j;
				}
				if(palabraLarga.length()<aux.length())
					palabraLarga=aux;
				aux="";
			}
		return "La palabra más larga es "+palabraLarga+" con "+palabraLarga.length()+" caracteres.";
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println(palabraMasLarga(cad));
		entrada.close();

	}

}
