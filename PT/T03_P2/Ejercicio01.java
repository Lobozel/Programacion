package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio01.java"></a>
 * @author Miguel�ngel
 *
 */

public class Ejercicio01 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Dado un n�mero entero que se lee desde teclado, indicar el n�mero de 
	 * d�gitos que contiene y escribir los d�gitos del n�mero cada uno en una 
	 * l�nea empezando por la unidad.
	 */
public static void main(String[] args) { //Se abre el m�todo main
	
	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in); //Creo un objeto Scanner para leer.
	int num; 
	int digitos=0;
	//**************************
	
	//Lee un n�mero entero
	System.out.println("Introduce un n�mero entero.");
	num=entrada.nextInt();
	//**************************
	
	//Comprobar si es negativo y pasarlo a positivo para que no de error
	if(num<0)
		num=-num;
	//**************************
	
	//Contar d�gitos del n�mero leido
	digitos=(int)(Math.log10(num)+1);
	/**
	 * <h2>Otras formas de conseguir los d�gitos de un n�mero en java.</h2>
	 */
	//digitos=Integer.toString(num).length();
	/*
	  while(num !=0)
	   {
	   num = num/10;
	   digitos++;
	   }
	 */
	System.out.println("\n"+num+" tiene "+digitos+" d�gitos.");
	//**************************
	
	//Mostrar d�gitos del n�mero leido
	System.out.println("\nSus d�gitos empezando por la unidad son los siguientes: ");
	for (int cont=1;cont<=digitos;cont++){
		System.out.print((int)(num%(Math.pow(10, cont))/(Math.pow(10, cont-1)))+"   ");
	}
	/**
	 * <h2>Explicaci�n:</h2>
	 * d�gito1 = numero % 10;
	 * d�gito2 = numero % 100 / 10;
	 *  ...
	 * d�gito5 = numero % 100000 / 10000;
	 */
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
	
} // Se cierra el m�todo main

} // Se cierra la clase
