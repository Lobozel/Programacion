package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo24_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0,cont=0;
		while (cont<10) {
			System.out.println("Introduce un número.");
			num+=entrada.nextInt();
			cont++;
		}
			System.out.println("La media de los números introducidos es "+num/10);
		entrada.close();

	}

}
