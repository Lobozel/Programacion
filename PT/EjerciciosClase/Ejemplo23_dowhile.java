package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo23_dowhile {

	public static void main(String[] args) {
		int num;
		final int conts=10;
		Scanner entrada=new Scanner(System.in);
		do {
			System.out.println("Adivina mi número.");
			num=entrada.nextInt();
		}while(num!=conts);
		entrada.close();

	}

}
