package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo17_WhileconCentinela {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float suma=0, numAlumnos=0, nota=1;
		while(nota>0) {
			System.out.println("Introduce la nota de un alumno.");
			nota=entrada.nextInt();
			if (nota>=0 && nota<=10) {
				numAlumnos++;
				suma+=nota;
				}
			else
				System.out.println("La nota no es válida");
		}
		System.out.printf("%s %.2f","La media de las notas del curso de Programación es",suma/numAlumnos);
		entrada.close();

	}

}
