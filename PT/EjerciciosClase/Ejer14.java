package EjerciciosClase;
import java.util.Scanner;
public class Ejer14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float cat1, cat2;
		System.out.println("Introduce la longutid del primer cateto.");
		cat1=entrada.nextFloat();
		System.out.println("Introduce la longitud del segundo cateto.");
		cat2=entrada.nextFloat();
		System.out.println("La longitud de la hipotenusa es: "+(Math.pow(Math.pow(cat1, 2)+Math.pow(cat2, 2), 0.5)));
		entrada.close();
	}

}
