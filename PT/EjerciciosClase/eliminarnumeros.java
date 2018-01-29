package EjerciciosClase;


import java.util.Scanner;
import java.util.regex.Pattern;

public class eliminarnumeros {
/*
 * Cadena compuesta exclusivamente de carácteres y números, eliminar los números.
 */
	public static String eliminarNumeros(String cad){
		String result="";
		for(int i=0;i<cad.length();i++) {
			boolean b = Pattern.matches("\\D",""+cad.charAt(i));
			if (b)
				result+=cad.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena.");
		String cadena=entrada.nextLine();
		System.out.println(cadena);
//		System.out.println(cadena.replaceAll("[0-9]", ""));
		System.out.println(eliminarNumeros(cadena));
		entrada.close();	
		
		

	}

}
