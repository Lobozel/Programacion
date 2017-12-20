package EjerciciosClase;
import java.util.Scanner;
public class Ejer17 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce un número.");
		num1=entrada.nextInt();
		System.out.println("Introduce otro número.");
		num2=entrada.nextInt();	
		if (num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		entrada.close();

	}

}
