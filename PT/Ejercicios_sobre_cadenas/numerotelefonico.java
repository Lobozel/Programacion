package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class numerotelefonico {
/*
 * Ingresar un número telefónico en formato de cadena y luego lo convierta
 * de la siguiente manera: Número Telefónico: 525628400 Nueva
 * Cadena:(52)-5-6284000
 */
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
        String cad="";
        
        do{
        System.out.println("Ingrese un número de teléfono que empiece por 52 y tenga 9 cifras en total");
        cad=entrada.nextLine();
        }while(cad.length()!=9 || Integer.parseInt(cad.substring(0, 2))!=52 ||
        		Integer.parseInt(cad.substring(3,9))<0 || Integer.parseInt(cad.substring(3,9))>9999999);

        System.out.println("("+cad.substring(0, 2)+")-"+cad.charAt(2)+"-"+cad.substring(3,9));

        entrada.close();
}
}
