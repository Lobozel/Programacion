package PracticaArraysBidimensionales;

import java.util.Scanner;
/**
 * 
 * @author Miguel�ngel
 *
 */
public class LIBROMIX {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] libros = new String[]
				{
						"Las Luces de Septiembre",
						"El Pr�ncipe de la Niebla",
						"El Palacio de Medianoche",
						"Marina",
						"La Sombra del Viente",
						"El Juego del �ngel"
						};
		//cantVentas [n�libro][n�caseta]
		int[][] cantVentas = new int[6][3];
		//Q equivale a Cantidad Vendida en econom�a
		int[] Q = new int[3];
		int mayor=0;
		int menor=0;
		
		for(int fila=0;fila<cantVentas.length;fila++)
		for(int columna=0;columna<cantVentas[fila].length;columna++){
			System.out.println("�Cu�ntos ejemplares del libro \""+libros[fila]+"\""
					+ " se han vendido en la caseta n�"+(columna+1)+"?");
			cantVentas[fila][columna]=entrada.nextInt();
		}
		
		
		for(int columna=0;columna<cantVentas[0].length;columna++){
			for(int fila=0;fila<cantVentas.length;fila++)
				Q[columna]+=cantVentas[fila][columna];
		}
		
		
		for(int cont=1;cont<Q.length;cont++)
			if(Q[mayor]<Q[cont])
				mayor=cont;
		
		System.out.println("\nLa caseta que m�s ha vendido es la n�"+(mayor+1)+""
				+ " con un total de "+Q[mayor]+" libros.");

		
		System.out.println("\nInformaci�n sobre el libro \""+libros[5]+"\":");
		for(int cont=0;cont<cantVentas[0].length;cont++)
			System.out.println("En la caseta n�"+(cont+1)+" se han vendido "+cantVentas[5][cont]+" ejemplares.");
		
		for(int cont=1;cont<cantVentas[0].length;cont++)
			if(cantVentas[5][menor]>cantVentas[5][cont])
				menor=cont;
		
		System.out.print("\nLa caseta en la que menos se ha vendido es la n�"+(menor+1)+""
				+ " con un total de "+cantVentas[5][menor]+" libros.");


		entrada.close();
				
	}

}