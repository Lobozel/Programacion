package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo02_aprobado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce tu nota.");
		nota=entrada.nextInt();
		if (nota>=0 && nota<=4)
			System.out.println("Has suspendido.");
		if (nota>=5 && nota<=10)
			System.out.println("Has aprobado.");
		if (nota<0 || nota>10)
			System.out.println("No es una nota válida.");
		entrada.close();

	}

}
