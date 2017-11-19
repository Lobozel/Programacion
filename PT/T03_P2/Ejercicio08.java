package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio08.java"></a>
 * @author MiguelÁngel
 *
 */

public class Ejercicio08 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Encontrar y mostrar todos los números de cuatro cifras que cumplan la
	 * condición de que la suma de las cifras de orden impar es igual a la suma
	 * de las cifras de orden par.
	 */
public static void main(String[] args) { //Se abre el método main

	//Declaración de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int sumPar, sumImpar;
	//**************************
	
	for (int num=1000;num<=9999;num++){
		sumPar=(num%100/10)+(num%10000/1000);  //Le sumo el dígito 2 y el dígito 4, los cuales son sus cifras pares.
		sumImpar=(num%10)+(num%1000/100);      //Le sumo el dígito 1 y el dígito 3, los cuales son sus cifras impares.
		if (sumPar==sumImpar)
			System.out.println("El número "+num+" cumple con la condición."); //Muestro el número por pantalla.
	}
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el método main

} // Se cierra la clase
