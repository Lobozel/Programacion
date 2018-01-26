package array_unidimensionales;

import java.util.Scanner;

public class invertirelarray {
/*
 * Programa para ingresar n valores reales en un array y luego inverta el arreglo
 */
	public static double[] invertirArregloDouble(double[] a){
		double[] aux = new double[a.length];
		for(int i=0;i<aux.length;i++)
			aux[i]=a[a.length-1-(1*i)];
		return aux;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tama�o array");
		double[] array = new double[entrada.nextInt()];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Introduce un n�mero");
			array[i]=entrada.nextDouble();
		}
		
		System.out.print("El array quedar�a tal que:\n|");
		for(double e:array)
			System.out.printf("%.2f|",e);
		
		array=invertirArregloDouble(array);
		
		System.out.print("\nEl array invertido quedar�a tal que:\n|");
		for(double e:array)
			System.out.printf("%.2f|",e);
		
		entrada.close();

	}

}
