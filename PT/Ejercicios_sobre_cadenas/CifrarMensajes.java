package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class CifrarMensajes {
/*
 * Un grupo de inteligencia militar desea codificar los mensajes secretos de
 * tal forma que no puedan ser interpretados con una lectura directa, para
 * lo cual han establecido las siguientes reglas:
 * a) Todo mensaje debe estar sus letras en mayúsculas.
 * b) Reemplazar cada letra por la que sigue según abecedario, excepto Z
 * que se deberá reemplazar con la letra A
 * c)Reemplazar cada dígito encontrado por el siguiente número excepto
 * el 9 que deberá ser reemplazado por el 0
 */
	public static String mensajeCifrado(String cad) {
		String result="";
		cad=cad.toUpperCase();
		for(int i=0;i<cad.length();i++) {
			if(Character.isLetter(cad.charAt(i)) || Character.isDigit(cad.charAt(i))) 
				if(cad.charAt(i)=='z')
					result+='z';
				else if(cad.charAt(i)=='9')
					result+='0';
				else
					result+=(char)((int)(cad.charAt(i)+1));
			else
				result+=cad.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		System.out.println(mensajeCifrado(cad));
	
		entrada.close();

	}

}
