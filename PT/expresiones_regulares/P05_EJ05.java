package expresiones_regulares;

import java.util.Scanner;

public class P05_EJ05 {

	protected static boolean validarBinario(String num) {
		String aux=num;
		
		for(int i=0;i<aux.length();i++)
			if(Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48!=0 ||
					Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48!=1)
					return false;
		
		return true;
	}
	
	protected static boolean validarOctal(String num) {
		String aux=num;
		
		for(int i=0;i<aux.length();i++)
			if(Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48<0 ||
					Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48>7)
					return false;
		
		return true;
	}
	
	protected static boolean validarHexadecimal(String num) {
		String aux=num;
		
		for(int i=0;i<aux.length();i++)
			if(Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48<0 ||
					Character.isDigit(aux.charAt(i)) && Integer.valueOf(aux.charAt(i))-48>9 ||
					Character.isLetter(aux.charAt(i)) && aux.charAt(i)<'A' ||
					Character.isLetter(aux.charAt(i)) && aux.charAt(i)>'F')
					return false;
		
		return true;
	}
	
	public static int binarioADecimal(String num) {
		int decimal;
		
		decimal=Integer.parseInt(num,2);
		
		return decimal;
	}
	
	public static int octalADecimal(String num) {
		int decimal;
		
		decimal=Integer.parseInt(num,8);
		
		return decimal;
	}
	
	public static int hexadecimalADecimal(String num) {
		int decimal;
		
		decimal=Integer.parseInt(num,16);
		
		return decimal;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu=0;
		String num="";
		do {
			System.out.println("¿Qué quieres pasar a decimal?\n"
					+ "1.-Binario\n"
					+ "2.-Octal\n"
					+ "3.-Hexadecimal\n"
					+ "4.-Nada");
			menu=entrada.nextInt();
		}while(menu<1 || menu>4);
		
		switch(menu) {
		case 1:
			do {
				System.out.println("Introduce un número binario.");
				num=entrada.nextLine();
			}while(!validarBinario(num));
			
			System.out.println("El número en decimal es: "+binarioADecimal(num));
			break;
		case 2:
			do {
				System.out.println("Introduce un número octal.");
				num=entrada.nextLine();
			}while(!validarOctal(num));
			
			System.out.println("El número en decimal es: "+octalADecimal(num));
			break;
		case 3:
			do {
				System.out.println("Introduce un número hexadecimal.");
				num=entrada.nextLine();
			}while(!validarHexadecimal(num));
			
			System.out.println("El número en decimal es: "+hexadecimalADecimal(num));
			break;
		case 4: System.out.println("Gracias por usar mi programa.");
		}
		
		entrada.close();

	}

}
