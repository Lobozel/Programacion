package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo22_while {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x=1;
		while(x!=0) {
			System.out.println("Introduce un número.");
			x=entrada.nextInt();
			if (x==0)
				continue;
			System.out.println("Resultado: "+(x*Math.log(x)));
		}
		entrada.close();

	}

}
