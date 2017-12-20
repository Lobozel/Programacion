package EjerciciosClase;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2, nota3; //variables para las notas
		System.out.println("Introduce la nota del primer trimestre.");
		nota1=entrada.nextInt();
		System.out.println("Introduce la nota del segundo trimestre.");
		nota2=entrada.nextInt();
		System.out.println("Introduce la nota del tercer trimestre.");
		nota3=entrada.nextInt();
		System.out.println("La nota media es: "+(nota1+nota2+nota3)/3);
		entrada.close();
	}

}
