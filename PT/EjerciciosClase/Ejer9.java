package EjerciciosClase;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float sueldobase, venta1, venta2, venta3;
		System.out.println("Introduce tu sueldo base.");
		sueldobase=entrada.nextFloat();
		System.out.println("Introduce el valor de tu primera venta.");
		venta1=entrada.nextFloat();
		System.out.println("Introduce el valor de tu segunda venta.");
		venta2=entrada.nextFloat();
		System.out.println("Introduce el valor de tu tercera venta.");
		venta3=entrada.nextFloat();
		System.out.println("El sueldo de este mes es de: "+(sueldobase+(10*(venta1+venta2+venta3)/100))+"€");
		entrada.close();

	}

}
