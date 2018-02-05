package Ejercicios_sobre_cadenas;

import java.util.Scanner;
/**
 * 
 * @author Miguel¡ngel
 *
 */
public class P04_E16 {
/*
 * Hacer un programa que elimine todas las ocurrencias de una subcadena
 * dentro de una cadena
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		System.out.println("Introduce la subcadena a eliminar");
		String subcad=entrada.nextLine();
		cad=cad.replaceAll(subcad, "");
		System.out.println(cad);
		entrada.close();
	}

}
