package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo25_for {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce un número.");
		num1=entrada.nextInt();
		do {
		System.out.println("Introduce un número mayor al anterior.");
		num2=entrada.nextInt();
		}while(num2<=num1);
		for (int x=num1;x<=num2;x++)
			System.out.println(Math.pow(Math.E, x)-x);
		entrada.close();

	}

}
