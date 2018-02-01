package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class ContarSubcadenas {
//Contar cuantas veces se encuentra una subcadena dentro de una cadena.
	public static int contarSubcadenas(String cad, String subcad) {
		int cont=0;
		for(int i=0;i<cad.length()-subcad.length()+1;i++) 
			if(subcad.compareTo(cad.substring(i, i+subcad.length()))==0) 
				cont++;
		return cont;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad,subcad;
		System.out.println("Introduce una cadena.");
		cad=entrada.nextLine();
		cad=cad.toLowerCase();
		System.out.println("Introduce la subcadena a buscar dentro de la cadena previa.");
		subcad=entrada.nextLine();
		subcad=subcad.toLowerCase();
		System.out.println(subcad+" se encuentra "+contarSubcadenas(cad,subcad)+" veces en:\n"+cad);
		
		entrada.close();

	}

}
