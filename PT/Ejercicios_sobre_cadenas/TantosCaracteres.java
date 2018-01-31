package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author Miguelángel
 *
 */
public class TantosCaracteres {
/*
 * Ingresar una cadena de caracteres formadas por números y letras, en
 * ese orden y obtenga otra cadena donde aparezca cada letra tantas
 * veces como lo indique el numero que lo precede. Ejemplo: Si la cadena
 * es 2w4r5f debemos obtener la siguiente cadena: wwrrrrfffff
 */
	public static String tantosCaracteres(String cad) {
		String result="";
		for(int i=0;i<cad.length()-1;i+=2)
				for(int j=Integer.parseInt(cad.substring(i,i+1));j>=0;j--){
					result+=cad.charAt(i+1);
				}
		return result;
	}
	protected static boolean verificar(String cad){
		if(cad.length()%2==0)
			for(int i=0;i<cad.length();i++){
				if(i%2==0){
					if(!Character.isDigit(cad.charAt(i))){
						System.out.println("Cadena no válida.");
						return false;
					}
				}else
					if(!Character.isLetter(cad.charAt(i))){
						System.out.println("Cadena no válida.");
						return false;
					}
			}
		return true;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad;
		do {
		System.out.println("Introduce una cadena formada por números y letras, en ese orden."
				+ "\nPor ejemplo: 2w4r5f.");
		cad=entrada.nextLine();
		}while(!verificar(cad));
		System.out.println("El resultado será el siguiente: "+tantosCaracteres(cad));
		entrada.close();
	}

}
