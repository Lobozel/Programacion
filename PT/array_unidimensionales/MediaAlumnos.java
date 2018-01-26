package array_unidimensionales;

import java.util.Scanner;

public class MediaAlumnos {
/*
 * Programa que lee por teclado la nota de los alumnos de una clase y calcula la
 * nota media del grupo. También muestra los alumnos con notas superiores a la
 * media. El número de alumnos se lee por teclado
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos tienes?");
		double[] alumnos = new double[entrada.nextInt()];
		double media=0;
		
		for(int i=0;i<alumnos.length;i++){
			do{
			System.out.println("Introduce la nota del alumno "+(i+1));
			alumnos[i]=entrada.nextDouble();
			}while(alumnos[i]<1 || alumnos[i]>10);
			media+=(double)alumnos[i];
		}
		
		media=media/alumnos.length;
		
		System.out.printf("%s%.2f\n","La nota media del grupo es: ",media);
		
		for(int i=0;i<alumnos.length;i++)
			if(alumnos[i]>media)
				System.out.printf("%s%d%s%.2f\n","El alumno ",(i+1)," supera la media con una nota de ",alumnos[i]);
		
		entrada.close();

	}

}
