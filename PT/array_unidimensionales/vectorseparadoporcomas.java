package array_unidimensionales;

import java.util.Scanner;

public class vectorseparadoporcomas {
/*
 * Cargar un vector de n enteros desde teclado y mostrar sus valores por pantalla
 * separados por comas
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tamaño del array");
		int[] array = new int[entrada.nextInt()];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Introduce un número");
			array[i]=entrada.nextInt();
		}
		
		System.out.println("El array es el siguiente:");
		for(int i=0;i<array.length;i++)
			if(i==array.length-1)
				System.out.print(array[i]);
			else
				System.out.print(array[i]+", ");
		
		entrada.close();

	}

}
