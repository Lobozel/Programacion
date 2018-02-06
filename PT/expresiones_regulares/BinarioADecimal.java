package expresiones_regulares;

import java.util.Scanner;

public class BinarioADecimal {
/*
 * Leer un número binario y escribir su equivalencia en decimal.
 */
	
	protected static boolean validarBinario(int num) {
		int aux=num;
		
		while(aux!=0) {
			if(aux%10!=0 && aux%10!=1)
				return false;
			aux/=10;
		}
		
		return true;
	}
	
	public static int binarioADecimal(int num) {
		String aux="";
		
		aux=String.valueOf(num);
		
		num=Integer.parseInt(aux,2);
		
		return num;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num=0;
		
		do {
		System.out.println("Introduce un número binario");
		num=entrada.nextInt();
		}while(!validarBinario(num));
		
		System.out.println("Número binario: "+num);
		
		System.out.println("Número decimal: "+binarioADecimal(num));
		
		entrada.close();

	}

}
