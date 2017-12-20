package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo15_Mes {

	public static void main(String[] args) {
		// Escribir mes en letra
		int mes;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el mes numéricamente.");
		mes=entrada.nextInt();
		if (mes>=1 && mes <=12)
			switch (mes) {
			case 1: System.out.println("Enero.");
			break;
			case 2: System.out.println("Febrero.");
			break;
			case 3: System.out.println("Marzo.");
			break;
			case 4: System.out.println("Abril.");
			break;
			case 5: System.out.println("Mayo.");
			break;
			case 6: System.out.println("Junio.");
			break;
			case 7: System.out.println("Julio.");
			break;
			case 8: System.out.println("Agosto.");
			break;
			case 9: System.out.println("Septiembre.");
			break;
			case 10: System.out.println("Octubre.");
			break;
			case 11: System.out.println("Noviembre.");
			break;
			case 12: System.out.println("Diciembre.");
			}
		else
			System.out.println("El mes introducido no es correcto.");
		entrada.close();

	}

}
