package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo16_WhileConVariableControl {

	public static void main(String[] args) {
		/*
		 * Programa que calcule la media de programación de una clase de 30 alumnos
		 * (no hay validacion de notas pero debería)
		 */
		Scanner entrada = new Scanner(System.in);
		int suma, numAlumnos, nota;
		suma=0;
		numAlumnos=0;
		while (numAlumnos<30){
			System.out.println("Introduce la nota de un alumno.");
			nota=entrada.nextInt();
			if (nota>=0 && nota<=10) {
				suma+=nota;
				numAlumnos++;
			}
			else
				System.out.println("Nota no válida.");
		}
		System.out.println("La media es "+suma/numAlumnos);
		entrada.close();

	}

}
