package Ajedrez;

import java.util.Scanner;

public class PruebaAjedrez {

	public static void main(String[] args) {
		Rey rey = new Rey();
		Scanner entrada = new Scanner(System.in);
		Direcci�n d=Direcci�n.NORTE;
		int menu=0;
		//menu para mover al rey y mostrar la posición del rey después
		//de cada movimiento
		//el menú se repetirá mientras no elijamos la opción salir
		while(menu!=9) {
		do {
			System.out.println("MENÚ:");
			System.out.println("1.-Mover al rey al Norte.");
			System.out.println("2.-Mover al rey al Noreste.");
			System.out.println("3.-Mover al rey al Este.");
			System.out.println("4.-Mover al rey al Sureste.");
			System.out.println("5.-Mover al rey al Sur.");
			System.out.println("6.-Mover al rey al Suroeste.");
			System.out.println("7.-Mover al rey al Oeste.");
			System.out.println("8.-Mover al rey al Noroeste.");
			System.out.println("9.-Dejar de mover al rey.");
			menu=entrada.nextInt();
		}while(menu<1 || menu>9);
		switch (menu) {
		case 1: d=Direcci�n.NORTE;
		break;
		case 2: d=Direcci�n.NORESTE;
		break;
		case 3: d=Direcci�n.ESTE;
		break;
		case 4: d=Direcci�n.SURESTE;
		break;
		case 5: d=Direcci�n.SUR;
		break;
		case 6: d=Direcci�n.SUROESTE;
		break;
		case 7: d=Direcci�n.OESTE;
		break;
		case 8: d=Direcci�n.NOROESTE;
		break;
		default: System.out.println("Gracias por jugar.");
		}
		if(menu>=1 && menu<=8) {
			rey.mueve(d);
			System.out.println(rey.toString());
		}
		}
		entrada.close();
	}

}
