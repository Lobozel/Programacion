package EjerciciosClase;
import java.util.Scanner;
public class Ejer15 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un número.");
		num=entrada.nextInt();
		if (num%2==0)
			System.out.println("El número es par.");
			else
				System.out.println("El número es impar.");
		entrada.close();

	}

}
