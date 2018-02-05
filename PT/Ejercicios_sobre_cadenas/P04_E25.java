package Ejercicios_sobre_cadenas;

import java.util.Scanner;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P04_E25 {
/*
 * Escriba un programa que calcule la frecuencia de aparición de las 
 * vocales de un texto proporcionado por el usuario. Esta solución se debe
 * presentar en forma de histograma, por ejemplo:
 * a 15 ***************
 * e 8 ********
 */
	public static void recuentoDeVocales(String cad) {
		char[] vocal = new char[] {'a','e','i','o','u'};
		int[] contVocal = new int[5];
		for(int i=0;i<cad.length();i++)
			for(int j=0;j<5;j++)
				if(cad.charAt(i)==vocal[j])
					contVocal[j]++;
		for(int i=0;i<5;i++) {
			System.out.print(vocal[i]+" "+contVocal[i]+" ");
			for(int j=0;j<contVocal[i];j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cad=entrada.nextLine();
		recuentoDeVocales(cad);
		entrada.close();

	}

}
