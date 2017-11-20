package EjerciciosClase;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num;
		System.out.println("Introduce un número.");
		num=entrada.nextFloat();
		System.out.println("La quinta parte de ese número es: "+num/5);
		System.out.println("El resto de dividir ese número entra 5 es: "+num%5);
		System.out.println("La tercera parte de la quinta parte de ese número es: "+(num/5/3));
		entrada.close();

	}

}
