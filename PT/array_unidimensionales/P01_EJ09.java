package array_unidimensionales;

import java.util.Scanner;
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P01_EJ09 {
/*
 * Hacer un programa para ingresar n valores reales en un arreglo y los muestre en
 * la pantalla, adem�s informar� del mayor, el menor y el promedio.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tama�o array.");
		double[] numeros = new double[entrada.nextInt()];
		double mayor=Double.MIN_VALUE, menor=Double.MAX_VALUE, promedio=0;
		
		for (int i=0;i<numeros.length;i++){
			System.out.println("Introduce un n�mero real.");
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
				"El n�mero menor introducido es ",menor,
				"El n�mero mayor introducido es ",mayor,
				"El promedio de los n�meros introducidos es ",promedio);
		
		entrada.close();
	}

}
