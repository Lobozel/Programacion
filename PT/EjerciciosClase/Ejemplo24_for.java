package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo24_for {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		for (int cont=0;cont<10;cont++) {
			System.out.println("Introduce un número.");
			num+=entrada.nextInt();
		}
			System.out.println("La media de los números introducidos es "+num/10);
		entrada.close();

	}

}
