package EjerciciosClase;
import java.util.Scanner;
public class Ejer13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float kmh;
		System.out.println("Introduce unos KM/h.");
		kmh=entrada.nextFloat();
		System.out.println("Equivalen a "+kmh*1000/3600+"M/s.");		
		entrada.close();

	}

}
