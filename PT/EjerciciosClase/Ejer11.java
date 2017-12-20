package EjerciciosClase;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float C; //para grados centigrados
		System.out.println("Convertir grados centígrados en grados Fahrenheit.\nIntroduce grados centígrados.");
		C=entrada.nextFloat();
		System.out.println("Equivalen a "+(32+(9*C/5))+"F.");
		entrada.close();

	}

}
