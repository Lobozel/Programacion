package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class BuscarSubcadena {
/*
 * Construir una función para que busque una subcadena en una cadena a
 * partir de una determinada posición y que devuelva la posición donde se 
 * encuentra la subcadena en caso contrario que devuelva cero.
 */
	public static int buscarSubcadena(String cad, String subcad, int i) {
		for(;i<cad.length()-subcad.length()+1;i++) 
			if(subcad.compareTo(cad.substring(i, i+subcad.length()))==0) 
				return i+1;
		return 0;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		System.out.println("Introduce una subcadena");
		String subcad=entrada.nextLine();
		do {
		System.out.println("Introduce un índice a partir de donde empezar a buscar.\n"
				+ "Debe ser mayor o igual que 0 y menor que "+cad.length());
		i=entrada.nextInt();
		}while(i<0 || i>=cad.length());
		i=buscarSubcadena(cad,subcad,i);
		if(i>0)
			System.out.println("La subcadena se ha encontrado en la posición "+i);
		else
			System.out.println("No se ha encontrado la subcadena.");
		entrada.close();

	}

}
