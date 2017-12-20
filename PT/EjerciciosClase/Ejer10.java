package EjerciciosClase;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numhorasn, numhorase, sueldohorasn, sueldohorase;
		System.out.println("¿Cuánto ganas a la hora?");
		sueldohorasn=entrada.nextFloat();
		System.out.println("¿Cuánto ganas cada hora extra?");
		sueldohorase=entrada.nextFloat();
		System.out.println("¿Cuántas horas has trabajado este mes?");
		numhorasn=entrada.nextFloat();
		System.out.println("¿Cuántas horas extra has trabajado?");
		numhorase=entrada.nextFloat();
		System.out.println("Este mes tienes un sueldo de: "+(numhorasn*sueldohorasn+numhorase*sueldohorase)+"€");
		entrada.close();

	}

}
