package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class LetrasNoPresentes {
/*
 * Ingrese un texto e indique que letras no han aparecido en el texto
 */
	public static String letrasNoPresentes(String cad) {
		String result="";
		cad=cad.toLowerCase();
		boolean encontrado=false;
		boolean enie=false;
			for(char c='a';c<='z';c++) {
				encontrado=false;
				for(int i=0;!encontrado && i<cad.length();i++) {
					if(cad.charAt(i)==0)
						encontrado=true;
					if(cad.charAt(i)=='ñ')
						enie=true;
				}
				if(!encontrado)
					result+=c;
			}
			if(!enie)
				result+='ñ';
			return result;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println("No has introducido las siguientes letras (sin contar las tildes):\n"+letrasNoPresentes(cad));
		entrada.close();

	}

}
