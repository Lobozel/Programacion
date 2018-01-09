package EjerciciosClase;

import java.util.Scanner;

//Calcular la media de cada alumno
//cuantos alumnos superan la media
//Cuantos alumnos están aprobados
//Calcular la media de cada evaulación
//nº de alumnos se pido por teclado
public class MediaConArrays {

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de alumnos.");
		int[][] alumnos = new int [entrada.nextInt()][3];
		int alumAprob=0, alumSupMed=0,suma;
		
		//Le doy notas aleatorias entre el 1 y el 10
		for(int filas=0;filas<alumnos.length;filas++)
			for (int colum=0;colum<alumnos[filas].length;colum++)
				alumnos[filas][colum]=(int)(Math.random()*10+1);
		
		//Media de cada alumno
		for(int filas=0;filas<alumnos.length;filas++) {
			suma=0;
			for (int colum=0;colum<alumnos[filas].length;colum++) {
				suma+=alumnos[filas][colum];
			}
			System.out.println("La media del alumno "+(filas+1)+" es "+(int)(suma/3));
			if(suma/3>=5)
				alumAprob++;
		}
		
		//alumnos aprobados
		System.out.println("Han aprobado "+alumAprob+" alumnos.");
		System.out.println();
		
		//media de cada evaulación
		for(int colum=0;colum<alumnos[colum].length;colum++) {
			suma=0;
			for(int filas=0;filas<alumnos.length;filas++)
				suma+=alumnos[filas][colum];
			System.out.println("La media del trimestre "+(colum+1)+" es "+(int)(suma/alumnos.length));
		}
		
		
		
		entrada.close();
	}
}
