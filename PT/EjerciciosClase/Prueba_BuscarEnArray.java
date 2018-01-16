package EjerciciosClase;

import java.util.Scanner;

public class Prueba_BuscarEnArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int menu=0, buscar, resultado=-1;
		
		int[] array = new int[(int)(Math.random()*(10-1)+10)]; //Declara array de tamaño random
		
		//Llena el array de valores random
		for(int i=0;i<array.length;i++)
			array[i]=(int)(Math.random()*(100-1)+1);
		
		//Muestra el array
		System.out.println("Array:");
		for(int elemento:array)
			System.out.print(elemento+" ");
		
		//Lee número a buscar dentro del array
		System.out.println("\n\nIntroduce el número que deseas buscar.");
		buscar=entrada.nextInt();
		
		//El usuario escoge el método que prefiera para buscar en el array
		do {
		System.out.println("\nEligue método de busquedad:\n"
				+ "1.-Busquedad Lineal.\n"
				+ "2.-Ordenar y después busquedad lineal.\n"
				+ "3.-Ordenar y después busquedad Binario.");
		menu=entrada.nextInt();
		}while(menu<1 || menu>3);
		
		if(menu>1)
			OrdenarArray.BurbujaMejorado(array);
		
		//Se llama al método escogido por el usuario
		switch(menu) {
			case 1: 
				resultado=BuscarEnArray.Lineal(array, buscar);
				break;
			case 2:
				resultado=BuscarEnArray.LinealOrdenado(array, buscar);
				break;
			case 3: resultado=BuscarEnArray.Binario(array, buscar);
				break;
			
		}
		
		//Comprueba si se ha encontrado o no
		if(resultado==-1)
			System.out.println(buscar+" no se encuentra en el array.");
		else
			System.out.println(buscar+" se encuentra en la posición "+resultado);
		
		entrada.close();

	}

}
