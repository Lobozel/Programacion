package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo08_mayordeedad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		System.out.println("Introduce tu edad.");
		edad=entrada.nextInt();
		if (edad>=18 && edad<=120)
			System.out.println("Eres mayor de edad.");
		else if (edad>=0 && edad<18)
			System.out.println("Eres menor de edad.");
		else
			System.out.println("La edad no es válida.");
		
		entrada.close();
	}

}
