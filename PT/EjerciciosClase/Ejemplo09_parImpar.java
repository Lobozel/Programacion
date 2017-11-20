package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo09_parImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número.");
		num=entrada.nextInt();
		if(num%2==0)
			System.out.println("El número introducido es par.");
		else
			System.out.println("El número introducido es impar.");
		entrada.close();

	}

}
