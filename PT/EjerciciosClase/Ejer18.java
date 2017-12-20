package EjerciciosClase;
import java.util.Scanner;
public class Ejer18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		System.out.println("Introduce tu nota.");
		nota=entrada.nextInt();
		if (nota>=1 && nota<=4)
			System.out.println("Estas suspenso.");
		else if (nota >=5 && nota <=10)
			System.out.println("Estas aprobado.");
		else
			System.out.println("La nota introducida es incorrecta.");
		entrada.close();

	}

}
