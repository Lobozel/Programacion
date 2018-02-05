package array_unidimensionales;

import java.util.Scanner;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P01_EJ09 {
/*
 * Hacer un programa para ingresar n valores reales en un arreglo y los muestre en
 * la pantalla, además informará del mayor, el menor y el promedio.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tamaño array.");
		double[] numeros = new double[entrada.nextInt()];
		double mayor=Double.MIN_VALUE, menor=Double.MAX_VALUE, promedio=0;
		
		for (int i=0;i<numeros.length;i++){
			System.out.println("Introduce un número real.");
			numeros[i]=entrada.nextDouble();
			promedio+=numeros[i];
			if(mayor<numeros[i])
				mayor=numeros[i];
			if(menor>numeros[i])
				menor=numeros[i];
		}
		promedio=promedio/numeros.length;
		
		System.out.print("El array es el siguiente:\n|");
		for(double e:numeros)
			System.out.printf("%.2f|",e);
		
		System.out.printf("\n%s%.2f.\n%s%.2f.\n%s%.2f.",
				"El número menor introducido es ",menor,
				"El número mayor introducido es ",mayor,
				"El promedio de los números introducidos es ",promedio);
		
		entrada.close();
	}

}
