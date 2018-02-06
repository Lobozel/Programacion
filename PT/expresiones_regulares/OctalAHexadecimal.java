package expresiones_regulares;
import java.util.Scanner;

public class OctalAHexadecimal {
	/*
	 * Leer un número octal y escribir su equivalencia en hexadecimal.
	 */
		
		protected static boolean validarOctal(int num) {
			int aux=num;
			
			while(aux!=0) {
				if(aux%10<0 || aux%10>7)
					return false;
				aux/=10;
			}
			
			return true;
		}
		
		public static String octalAHexadecimal(int num) {
			String aux="";
			
			aux=String.valueOf(num);
			
			//Primero paso de Octal a decimal
			num=Integer.parseInt(aux,8);
			
			aux=Integer.toString(num,16);
			
			return aux;
		}
		
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int num=0;
			
			do {
			System.out.println("Introduce un número octal");
			num=entrada.nextInt();
			}while(!validarOctal(num));
			
			System.out.println("Número octal: "+num);
			
			System.out.println("Número hexadecimal: "+octalAHexadecimal(num));
			
			entrada.close();

		}

	}