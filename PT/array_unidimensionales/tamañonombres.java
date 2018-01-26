package array_unidimensionales;

import java.util.Scanner;

public class tamañonombres {
/*
 * Crea dos arrays unidimensionales que tengan el mismo tamaño (lo pedirá por
 * teclado), en uno de ellos almacenaras nombres de personas como cadenas, en el
 * otro array o arreglo irá almacenando la longitud de los nombres. Muestra por
 * pantalla el nombre y la longitud que tiene.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tamaño de los arrays.");
		int tamaño=entrada.nextInt();
		String[] nombres = new String[tamaño];
		int[] longitud = new int[tamaño];
		
		for(int i=0;i<tamaño;i++){
			System.out.println("Introduce un nombre.");
			nombres[i]=entrada.next();
			longitud[i]=nombres[i].length();
		}
		
		for(int i=0;i<tamaño;i++)
			System.out.println("El nombre "+nombres[i]+" tiene una longitud de "+longitud[i]);
		
		entrada.close();

	}

}
