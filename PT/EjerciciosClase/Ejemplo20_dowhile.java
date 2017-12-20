package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo20_dowhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota, suma=0, cont=0;
		 do{
			 do {
					System.out.println("Introduce una nota.");
					nota=entrada.nextInt();
				}while(nota<0 || nota>10);
					suma+=nota;
					cont++;
		}while(nota!=0);
		System.out.println("La media de las notas es "+suma/cont);	
		entrada.close();

	}

}
