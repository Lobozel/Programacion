package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo20_for {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota=1, suma=0, cont;
		for (cont=0;nota!=0;cont++) {
			do {
				System.out.println("Introduce una nota.");
				nota=entrada.nextInt();
			}while(nota<0 || nota>10);
				suma+=nota;
		}
		System.out.println("La media de las notas es "+suma/cont);	
		entrada.close();

	}

}
