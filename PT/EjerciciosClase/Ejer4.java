package EjerciciosClase;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float r; // declaro una variable para el radio
		System.out.println("Introduce el radio de la esfera.");
		r=entrada.nextFloat(); //Leo el valor de radio
		System.out.println("El volumen de la esfera es: "+(4/3*Math.PI*Math.pow(r, 3))+".");
		System.out.println("La superficia de la esfera es: "+(4*Math.PI*Math.pow(r, 2))+".");
		entrada.close();

	}

}
