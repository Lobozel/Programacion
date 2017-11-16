package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio01.java"></a>
 * @author MiguelÁngel
 *
 */

public class Ejercicio01 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Dado un número entero que se lee desde teclado, indicar el número de 
	 * dígitos que contiene y escribir los dígitos del número cada uno en una 
	 * línea empezando por la unidad.
	 */
public static void main(String[] args) { //Se abre el método main
	
	//Declaración de variables
	Scanner entrada = new Scanner(System.in); //Creo un objeto Scanner para leer.
	int num; 
	int digitos=0;
	//**************************
	
	//Lee un número entero
	System.out.println("Introduce un número entero.");
	num=entrada.nextInt();
	//**************************
	
	//Comprobar si es negativo y pasarlo a positivo para que no de error
	if(num<0)
		num=-num;
	//**************************
	
	//Contar dígitos del número leido
	digitos=(int)(Math.log10(num)+1);
	/**
	 * <h2>Otras formas de conseguir los dígitos de un número en java.</h2>
	 */
	//digitos=Integer.toString(num).length();
	/*
	  while(num !=0)
	   {
	   num = num/10;
	   digitos++;
	   }
	 */
	System.out.println("\n"+num+" tiene "+digitos+" dígitos.");
	//**************************
	
	//Mostrar dígitos del número leido
	System.out.println("\nSus dígitos empezando por la unidad son los siguientes: ");
	for (int cont=1;cont<=digitos;cont++){
		System.out.print((int)(num%(Math.pow(10, cont))/(Math.pow(10, cont-1)))+"   ");
	}
	/**
	 * <h2>Explicación:</h2>
	 * dígito1 = numero % 10;
	 * dígito2 = numero % 100 / 10;
	 *  ...
	 * dígito5 = numero % 100000 / 10000;
	 */
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
	
} // Se cierra el método main

} // Se cierra la clase
