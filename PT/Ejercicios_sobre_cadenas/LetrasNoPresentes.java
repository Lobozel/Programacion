package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class LetrasNoPresentes {
/*
 * Ingrese un texto e indique que letras no han aparecido en el texto
 */
	public static String letrasNoPresentes(String cad) {
		String result="";
		cad=cad.toLowerCase();
		cad=limpiarDeTildes(cad);
		boolean encontrado=false;
		boolean enie=false;
			for(char c='a';c<='z';c++) {
				encontrado=false;
				for(int i=0;!encontrado && i<cad.length();i++) {
					if(cad.charAt(i)==c)
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
	
	protected static String limpiarDeTildes(String cad){
		return cad.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u');
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		System.out.println("No has introducido las siguientes letras:\n"+letrasNoPresentes(cad));
		entrada.close();

	}

}
