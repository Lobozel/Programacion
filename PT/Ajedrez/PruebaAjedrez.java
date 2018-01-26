package Ajedrez;

import java.util.Scanner;

public class PruebaAjedrez {

	public static void main(String[] args) {
		Rey rey = new Rey();
		Scanner entrada = new Scanner(System.in);
		DirecciÛn d=DirecciÛn.NORTE;
		int menu=0;
		//menu para mover al rey y mostrar la posici√≥n del rey despu√©s
		//de cada movimiento
		//el men√∫ se repetir√° mientras no elijamos la opci√≥n salir
		while(menu!=9) {
		do {
			System.out.println("MEN√ö:");
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
		case 1: d=DirecciÛn.NORTE;
		break;
		case 2: d=DirecciÛn.NORESTE;
		break;
		case 3: d=DirecciÛn.ESTE;
		break;
		case 4: d=DirecciÛn.SURESTE;
		break;
		case 5: d=DirecciÛn.SUR;
		break;
		case 6: d=DirecciÛn.SUROESTE;
		break;
		case 7: d=DirecciÛn.OESTE;
		break;
		case 8: d=DirecciÛn.NOROESTE;
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
