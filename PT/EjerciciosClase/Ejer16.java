package EjerciciosClase;
import java.util.Scanner;
public class Ejer16 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un número.");
		num=entrada.nextInt();
		if (num%10==0)
			System.out.println("El número es múltiplo de 10.");
			else
				System.out.println("El número no es múltiplo de 10.");
		entrada.close();

	}

}
