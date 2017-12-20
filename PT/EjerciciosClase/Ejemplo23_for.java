package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo23_for {

	public static void main(String[] args) {
		int num;
		final int conts=10;
		Scanner entrada=new Scanner(System.in);
		for(num=1;num!=conts;) {
			System.out.println("Adivina mi número.");
			num=entrada.nextInt();
		}
		entrada.close();

	}

}
