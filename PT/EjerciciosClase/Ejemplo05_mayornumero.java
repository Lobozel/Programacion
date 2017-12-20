package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo05_mayornumero {

	public static void main(String[] args) {
		// escribe el mayor de dos números
		Scanner entrada = new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce un número.");
		num1=entrada.nextInt();
		System.out.println("Introduce otro número.");
		num2=entrada.nextInt();
		System.out.print("El número mayor introducido es ");
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		entrada.close();
	}

}
