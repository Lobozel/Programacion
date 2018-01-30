package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class nombrealreves {
/*
 * Hacer un programa que permita la entrada de un nombre consistente en
 * un nombre, un primer apellido y un segundo apellido, en ese orden, y
 * que imprima a continuación el último apellido, seguido del primer
 * apellido y el nombre
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre y tus dos apellidos.");
		String nombre=entrada.nextLine();
		String[] inverso = new String[1];
		nombre=MinusculasAMayusculas.minusculasAMayusculas(nombre);
		inverso=nombre.split(" ");
		for(int i=inverso.length-1;i>=0;i--)
			System.out.print(inverso[i]+" ");
		entrada.close();

	}

}
