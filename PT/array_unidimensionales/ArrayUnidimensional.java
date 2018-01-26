package array_unidimensionales;

import java.util.Scanner;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class ArrayUnidimensional {
/*
 * Crea un array o arreglo unidimensional con un tamaño de 5, inserte valores
 * leyéndolos desde el teclado y muestralos por pantalla.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[5];
		for(int i=0;i<array.length;i++) {
			System.out.println("Introduce un valor para el array en la posición "+(i+1));
			array[i]=entrada.nextInt();
		}
		
		System.out.print("\nVisualización del array:\n|");
		for(int elemento:array) {
			System.out.print(elemento+"|");
		}
		entrada.close();

	}

}
