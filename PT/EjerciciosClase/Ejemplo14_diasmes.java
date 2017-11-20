package EjerciciosClase;
import java.util.Scanner;

public class Ejemplo14_diasmes {

	public static void main(String[] args) {
		// Escribir número de días del mes
		int mes, anio;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el año en el que estas.");
		anio=entrada.nextInt();
		System.out.println("Introduce el mes numéricamente.");
		mes=entrada.nextInt();
		if (mes>=1 && mes <=12)
			switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("El mes tiene 31 días");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("El mes tiene 30 días.");
				break;
			case 2:
				if (anio%400==0 || anio%4==0 && anio%100!=0)
					System.out.println("El mes tiene 29 días.");
				else
					System.out.println("El mes tiene 28 días.");
			}
		else
			System.out.println("El mes introducido no es correcto.");
		entrada.close();

	}

}
