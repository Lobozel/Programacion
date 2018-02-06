package expresiones_regulares;

import java.util.Scanner;
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P05_EJ05 {
/*
 * Crear un programa que pida al usuario el cambio de base deseado
 * (de binario, octal o hexadecimal a decimal) y escriba el n�mero en su
 * equivalente en decimal. La petici�n del cambio se realizar� usando un
 * men� y el programa seguir� realizando cambios mientras que el usuario
 * as� lo desee.
 */
	
	/***************
	 **VALIDACIONES*
	 ***************/
	protected static boolean validarBinario(String num) {
		String aux=num;
		
		for(int i=0;i<aux.length();i++)
			if(Character.isDigit(aux.charAt(i)) &&
					Integer.valueOf(aux.charAt(i))-48!=0 &&
					Integer.valueOf(aux.charAt(i))-48!=1)
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
	
	/******************
	 **CAMBIO*DE*BASES*
	 ******************/
	
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
	
	/**
	 * MAIN
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu=0;
		String num="";
		do{
		do {
			System.out.println("�Qu� quieres pasar a decimal?\n"
					+ "1.-Binario\n"
					+ "2.-Octal\n"
					+ "3.-Hexadecimal\n"
					+ "4.-Nada");
			menu=entrada.nextInt();
		}while(menu<1 || menu>4);
		
		entrada.nextLine(); //Borramos el retorno de carro
		
		switch(menu) {
		case 1:
			do {
				System.out.println("Introduce un n�mero binario.");
				num=entrada.nextLine();
				System.out.println(Integer.valueOf(num.charAt(0)-48));
				System.out.println(validarBinario(num));
			}while(!validarBinario(num));
			
			System.out.println("El n�mero en decimal es: "+binarioADecimal(num)+"\n\n");
			break;
		case 2:
			do {
				System.out.println("Introduce un n�mero octal.");
				num=entrada.nextLine();
			}while(!validarOctal(num));
			
			System.out.println("El n�mero en decimal es: "+octalADecimal(num)+"\n\n");
			break;
		case 3:
			do {
				System.out.println("Introduce un n�mero hexadecimal.");
				num=entrada.nextLine();
			}while(!validarHexadecimal(num));
			
			System.out.println("El n�mero en decimal es: "+hexadecimalADecimal(num)+"\n\n");
			break;
		case 4: System.out.println("Gracias por usar mi programa.");
		}
		
		}while(menu!=4);
		
		entrada.close();

	}

}
