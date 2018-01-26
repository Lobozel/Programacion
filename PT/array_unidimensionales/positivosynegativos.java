package array_unidimensionales;

import java.util.Scanner;

public class positivosynegativos {
/*
 * Programa Java que guarda en un array 10 n�meros enteros que se leen por
 * teclado. A continuaci�n se recorre el array y calcula cu�ntos n�meros son
 * positivos, cu�ntos negativos y cu�ntos ceros, mostrando el array y los resultados
 * en pantalla.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		int positivos=0, negativos=0, ceros=0;
		
		for(int i=0;i<numeros.length;i++){
			System.out.println("Introduce un n�mero.");
			numeros[i]=entrada.nextInt();
			if(numeros[i]>0)
				positivos++;
			else if(numeros[i]<0)
				negativos++;
			else
				ceros++;
		}
		
		System.out.println("El array es el siguiente:");
		for(int e:numeros)
			System.out.print(e+" ");
		
		System.out.println("\nSe han introducido:\n"+positivos+" n�meros positivos."
				+ "\n"+negativos+" n�meros negativos.\n"+ceros+" ceros.");
		
		entrada.close();

	}

}
