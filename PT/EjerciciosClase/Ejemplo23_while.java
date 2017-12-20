package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo23_while {

	public static void main(String[] args) {
		int num=1;
		final int conts=10;
		Scanner entrada=new Scanner(System.in);
		while(num!=conts) {
			System.out.println("Adivina mi número.");
			num=entrada.nextInt();
		}
		entrada.close();

	}

}
