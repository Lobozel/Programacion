package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo03_signo {

	public static void main(String[] args) {
		//Escribe el signo de un número real
		Scanner entrada = new Scanner(System.in);
		float num;
		System.out.println("Introduce un número.");
		num=entrada.nextFloat();
		if(num==0)
			System.out.println("Has introducido un cero.");
		else if(num>0)
			System.out.println("El número introducido es positivo.");
		else
			System.out.println("El número introducido es negativo.");
		entrada.close();
		
	}

}
