package EjerciciosClase;

import java.util.Scanner;

public class Prueba_OrdenarArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int menu=0;
		
		int[] array = new int[(int)(Math.random()*(10-1)+1)]; //Declara array de tamaño random
		
		//Llena el array de valores random
		for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*(100-1)+1);
		
		//Muestra el array sin ordenar
		System.out.println("Sin ordenar:");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		//El usuario escoge el método que prefiera para ordenar el array
		do {
		System.out.println("\n\nEligue método de ordenación:\n"
				+ "1.-Por selección.\n"
				+ "2.-Por intercambio.");
		menu=entrada.nextInt();
		}while(menu<1 || menu>2);
		
		//Se llama al método escogido por el usuario
		switch(menu) {
			case 1: OrdenarArray.OrdenarPorSeleccion(array);
				break;
			case 2: OrdenarArray.OrdenarPorIntercambio(array);
				break;
		}
		
		//Se muestra el array ordenado
		System.out.println("\nOrdenado:");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		
		entrada.close();

	}

}
