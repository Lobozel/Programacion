package array_unidimensionales;

import java.util.Scanner;

public class buscarelemento {
/*
 * Programa para ingresar n elementos en un arreglo y luego mostrarlo en la
 * pantalla. Además ingresar un número y verificar si este se encuentra en el arreglo,
 * si se encuentra escribir la posición donde se encontró y si no se encontró escribir
 * el mensaje "número no se encuentra".
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tamaño array");
		int[] array = new int[entrada.nextInt()];
		int buscar;
		boolean encontrado=false;
		
		for(int i=0;i<array.length;i++){
			System.out.println("Introduce un número");
			array[i]=entrada.nextInt();
		}
		
		System.out.print("El array es el siguiente:\n|");
		for(int e:array)
			System.out.printf("%d|",e);
		
		System.out.println("Introduce el número a buscar en el array");
		buscar=entrada.nextInt();
		
		for(int i=0;i<array.length&&!encontrado;i++)
			if(buscar==array[i]){
				encontrado=true;
				System.out.println("El número "+buscar+" se encuentra en la posición "+(i+1)+".");
			}
		
		if(!encontrado)
			System.out.println("Número no se encuentra.");
		
		entrada.close();

	}

}
