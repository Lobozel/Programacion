package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo18_WhileConBandera {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma, num;
		boolean negativo=false;
		suma=0;
		while(!negativo) {
			System.out.println("Introduce un número entero.");
			num=entrada.nextInt();
			if(num<0)
				negativo=true;
			else
				suma+=num;
		}
		System.out.println("La suma de los valores introducidos es: "+suma);
		entrada.close();
	}

}
