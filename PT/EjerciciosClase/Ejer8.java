package EjerciciosClase;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int m, h; //siendo m mujeres y h hombres.
		System.out.println("Introduce el número de mujeres en esta empresa.");
		m=entrada.nextInt();
		System.out.println("Introduce el número de hombres en esta empresa.");
		h=entrada.nextInt();
		System.out.println("El porcentaje de mujeres es: "+(float)m*100/(m+h)+"%");
		System.out.println("El porcentaje de hombres es: "+(float)h*100/(m+h)+"%");
		entrada.close();
	}

}
