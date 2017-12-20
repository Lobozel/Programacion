package EjerciciosClase;

import java.util.Scanner;

public class Ejemplo22_dowhile {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduce un número.");
			x=entrada.nextInt();
			if (x==0)
				continue;
			System.out.println("Resultado: "+(x*Math.log(x)));
		}while(x!=0);
		entrada.close();

	}

}
