package PracticaArraysBidimensionales;

import java.util.Scanner;

public class ArraysBidimensionales {
private static Scanner entrada = new Scanner(System.in);

	public static int[][] LeerValores(int f, int c){
		int[][] a = new int[f][c];
		for(int fila=0;fila<a.length;fila++)
			for (int columna=0;columna<a[0].length;columna++){
				System.out.println("Introduce un valor para la fila "+(fila+1)+" en la columna "+(columna+1)+".");
				a[fila][columna]=entrada.nextInt();
			}
		return a;
	}
	public static void ImprimirXFilas(int[][] a){
		for(int fila=0;fila<a.length;fila++){
			for (int columna=0;columna<a[0].length;columna++)
				System.out.print(a[fila][columna]+" ");
			System.out.println();
			}
	}
	public static void ImprimirXColumnas(int[][] a){
		for(int columna=0;columna<a[0].length;columna++){
			for (int fila=0;fila<a.length;fila++)
				System.out.print(a[fila][columna]+" ");
			System.out.println();
			}
	}
	public static int ValorMáximo(int[][] a){
		int max=Integer.MIN_VALUE;
		for(int fila=0;fila<a.length;fila++)
			for (int columna=0;columna<a[0].length;columna++)
				if(max<a[fila][columna])
					max=a[fila][columna];
		return max;			
}
	public static int ValorMínimo(int[][] a){
		int min=Integer.MAX_VALUE;
		for(int fila=0;fila<a.length;fila++)
			for (int columna=0;columna<a[0].length;columna++)
				if(min>a[fila][columna])
					min=a[fila][columna];
		return min;			
}

}
