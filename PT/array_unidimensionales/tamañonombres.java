package array_unidimensionales;

import java.util.Scanner;

public class tama�onombres {
/*
 * Crea dos arrays unidimensionales que tengan el mismo tama�o (lo pedir� por
 * teclado), en uno de ellos almacenaras nombres de personas como cadenas, en el
 * otro array o arreglo ir� almacenando la longitud de los nombres. Muestra por
 * pantalla el nombre y la longitud que tiene.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tama�o de los arrays.");
		int tama�o=entrada.nextInt();
		String[] nombres = new String[tama�o];
		int[] longitud = new int[tama�o];
		
		for(int i=0;i<tama�o;i++){
			System.out.println("Introduce un nombre.");
			nombres[i]=entrada.next();
			longitud[i]=nombres[i].length();
		}
		
		for(int i=0;i<tama�o;i++)
			System.out.println("El nombre "+nombres[i]+" tiene una longitud de "+longitud[i]);
		
		entrada.close();

	}

}
