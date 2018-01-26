package array_unidimensionales;

import java.util.Scanner;

public class buscarelemento {
/*
 * Programa para ingresar n elementos en un arreglo y luego mostrarlo en la
 * pantalla. Adem�s ingresar un n�mero y verificar si este se encuentra en el arreglo,
 * si se encuentra escribir la posici�n donde se encontr� y si no se encontr� escribir
 * el mensaje "n�mero no se encuentra".
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tama�o array");
		int[] array = new int[entrada.nextInt()];
		int buscar;
		boolean encontrado=false;
		
		for(int i=0;i<array.length;i++){
			System.out.println("Introduce un n�mero");
			array[i]=entrada.nextInt();
		}
		
		System.out.print("El array es el siguiente:\n|");
		for(int e:array)
			System.out.printf("%d|",e);
		
		System.out.println("Introduce el n�mero a buscar en el array");
		buscar=entrada.nextInt();
		
		for(int i=0;i<array.length&&!encontrado;i++)
			if(buscar==array[i]){
				encontrado=true;
				System.out.println("El n�mero "+buscar+" se encuentra en la posici�n "+(i+1)+".");
			}
		
		if(!encontrado)
			System.out.println("N�mero no se encuentra.");
		
		entrada.close();

	}

}
