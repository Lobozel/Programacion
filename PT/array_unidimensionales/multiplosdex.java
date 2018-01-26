package array_unidimensionales;

import java.util.Scanner;

public class multiplosdex {
/*
 * Crea un array unidimensional, él tamaño lo leeremos por teclado y rellene el
 * array o arreglo con los múltiplos de un número pedido por teclado. Por ejemplo, si
 * defino un array de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 9,
 * 12, 15. Muéstrtalos por pantalla.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array.");
		int[] multiplos = new int[entrada.nextInt()];
		System.out.println("Introduce un múltiplo.");
		int multiplo=entrada.nextInt();
		
		for(int i=0;i<multiplos.length;i++)
			multiplos[i]=multiplo*(i+1);
		
		System.out.println("Los "+multiplos.length+" múltiplos de "+multiplo+" son:");
		
		for(int e:multiplos)
			if(e!=multiplos[multiplos.length-1] && e!=multiplos[multiplos.length-2])
			System.out.print(e+", ");
			else if(e==multiplos[multiplos.length-2])
				System.out.print(e+" y ");
			else
				System.out.println(e);
		
		entrada.close();

	}

}
