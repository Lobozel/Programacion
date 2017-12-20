package EjerciciosClase;
import java.util.Scanner;
public class Ejemplo12_vocal {

	public static void main(String[] args) {
		// Indicar si un carácter introducido desde teclado es vocal o no
		Scanner entrada = new Scanner(System.in);
		char c;
		System.out.println("Introduce un carácter.");
		c=entrada.next().charAt(0);
		switch (c){
			case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println("El carácter introducido es una vocal.");
				break;
			default:
				System.out.println("El carácter introducido no es una vocal.");
		}
		entrada.close();

	}

}
