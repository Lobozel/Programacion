package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Prueba_BuscarEnArray {
	
	//Método para crear palabras aleatorias
	private static String getSaltString() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder cadena = new StringBuilder();
        Random numRandom = new Random();
        while (cadena.length() < 5) { // el 5 es la longitud de la cadena de cada palabra
            int i=(int)(numRandom.nextFloat()*caracteres.length());
            cadena.append(caracteres.charAt(i));
        }
        String cadenaRandom = cadena.toString();
        return cadenaRandom;

    }
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int menu=0, buscarInt, resultado=-1;
		String buscarString;
		
		do {
			System.out.println("Eligue:\n"
					+ "1.-Buscar un número.\n"
					+ "2.-Buscar un String.\n"
					+ "3.-Salir");
			menu=entrada.nextInt();
		}while(menu<1 || menu>3);
		
		switch(menu) {
		/**
		 * Enteros
		 */
		case 1:
			int[] arrayInt = new int[(int)(Math.random()*(10-1)+10)]; //Declara array de tamaño random
			
			//Llena el array de valores random
			for(int i=0;i<arrayInt.length;i++)
				arrayInt[i]=(int)(Math.random()*(100-1)+1);
			
			//Muestra el array
			System.out.println("Array de enteros:");
			for(int elemento:arrayInt)
				System.out.print(elemento+" ");
			
			//Lee número a buscar dentro del array
			System.out.println("\n\nIntroduce el número que deseas buscar.");
			buscarInt=entrada.nextInt();
			
			//El usuario escoge el método que prefiera para buscar en el array
			do {
			System.out.println("\nEligue método de busquedad:\n"
					+ "1.-Busquedad Lineal.\n"
					+ "2.-Ordenar y después busquedad lineal.\n"
					+ "3.-Ordenar y después busquedad Binario.");
			menu=entrada.nextInt();
			}while(menu<1 || menu>3);
			
			if(menu>1) { //Ordena el array y lo muestra ordenado
				OrdenarArray.BurbujaMejoradoInt(arrayInt);
				System.out.println("\nArray ordenado:");
				for(int elemento:arrayInt)
					System.out.print(elemento+" ");
				System.out.println();
			}
			
			//Se llama al método escogido por el usuario
			switch(menu) {
				case 1: 
					resultado=BuscarEnArray.LinealInt(arrayInt, buscarInt);
					break;
				case 2:
					resultado=BuscarEnArray.LinealOrdenadoInt(arrayInt, buscarInt);
					break;
				case 3: resultado=BuscarEnArray.BinarioInt(arrayInt, buscarInt);
					break;
				
			}
			
			//Comprueba si se ha encontrado o no
			if(resultado==-1)
				System.out.println(buscarInt+" no se encuentra en el array.");
			else
				System.out.println(buscarInt+" se encuentra en la posición "+resultado);
			break;
			
			
			
			/**
			 * Cadenas
			 */
		case 2:
			String[] arrayString = new String[(int)(Math.random()*(10-1)+10)];

			
//			Llena el array de valores random
			for(int i=0;i<arrayString.length;i++) 
				arrayString[i]=Prueba_BuscarEnArray.getSaltString();

			//Muestra el array
			System.out.println("\nArray de cadenas:");
			for(String elemento:arrayString)
				System.out.print(elemento+" ");

			//Lee la cadena a buscar dentro del array
			System.out.println("\n\nIntroduce la cadena a buscar.");
			buscarString=entrada.next();
			
			//El usuario escoge el método que prefiera para buscar en el array
			do {
			System.out.println("\nEligue método de busquedad:\n"
					+ "1.-Busquedad Lineal.\n"
					+ "2.-Ordenar y después busquedad lineal.\n"
					+ "3.-Ordenar y después busquedad Binario.");
			menu=entrada.nextInt();
			}while(menu<1 || menu>3);
			
			if(menu>1) { //Ordena el array y lo ordena
				OrdenarArray.BurbujaMejoradoString(arrayString);
				System.out.println("\nArray ordenado:");
				for(String elemento:arrayString)
					System.out.print(elemento+" ");
				System.out.println();
			}
			
			//Se llama al método escogido por el usuario
			switch(menu) {
				case 1: 
					resultado=BuscarEnArray.LinealString(arrayString, buscarString);
					break;
				case 2:
					resultado=BuscarEnArray.LinealOrdenadoString(arrayString, buscarString);
					break;
				case 3: 
					resultado=BuscarEnArray.BinarioString(arrayString, buscarString);
					break;
				
			}
			
			//Comprueba si se ha encontrado o no
			if(resultado==-1)
				System.out.println(buscarString+" no se encuentra en el array.");
			else
				System.out.println(buscarString+" se encuentra en la posición "+resultado);
			break;
		}
		
		entrada.close();

	}

}
