package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class MinusculasAMayusculas {
/*
 * Ingresa una frase y modificala convirtiendo el primer carácter de cada
 * palabra, si este fuese una letra, de minúsculas a mayúsculas.
 */
	public static String minusculasAMayusculas(String cad){
		String result="";
		for(int i=0;i<cad.length();i++){
			if(i==0 && Character.isLetter(cad.charAt(0)) ||
					Character.isLetter(cad.charAt(i)) && Character.isSpaceChar(cad.charAt(i-1)))
				result+=Character.toUpperCase(cad.charAt(i));
			else
				result+=cad.charAt(i);	
		}
		return result;
	}
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce una frase.");
	String cad=entrada.nextLine();
	System.out.println(cad);
	System.out.println(minusculasAMayusculas(cad));
	entrada.close();

	}

}
