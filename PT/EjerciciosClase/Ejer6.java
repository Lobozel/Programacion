package EjerciciosClase;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float base, altura;
		System.out.println("Introduce la medida de la base del rectángulo.");
		base=entrada.nextFloat();
		System.out.println("Introduce la medida de la altura del rectángulo.");
		altura=entrada.nextFloat();
		System.out.println("El área del rectángulo es: "+base*altura);
		entrada.close();
	}

}
