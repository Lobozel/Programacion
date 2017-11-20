package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo07_aprobado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce tu nota.");
		nota=entrada.nextInt();
		if (nota>=0 && nota<=4)
			System.out.println("Has suspendido.");
		else if (nota>=5 && nota<=10)
			System.out.println("Has aprobado.");
		else
			System.out.println("No es una nota válida.");
		entrada.close();

	}

}
