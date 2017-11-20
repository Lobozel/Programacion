package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo13_valoranota {

	public static void main(String[] args) {
		// Escribir en letra nota númerica
		int nota;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un tu nota.");
		nota=entrada.nextInt();
		if (nota>=1 && nota<=10)
		switch (nota) {
		case 1: case 2: case 3: case 4:
			System.out.println("Suspenso.");
			break;
		case 5:
			System.out.println("Aprobado.");
			break;
		case 6:
			System.out.println("Bien.");
			break;
		case 7:	case 8:
			System.out.println("Notable.");
			break;
		case 9: case 10:
			System.out.println("Sobresaliente.");
		}
		else
			System.out.println("No es una nota válida.");
		entrada.close();

	}

}
