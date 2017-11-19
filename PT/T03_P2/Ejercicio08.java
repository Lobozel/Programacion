package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio08.java"></a>
 * @author Miguel�ngel
 *
 */

public class Ejercicio08 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Encontrar y mostrar todos los n�meros de cuatro cifras que cumplan la
	 * condici�n de que la suma de las cifras de orden impar es igual a la suma
	 * de las cifras de orden par.
	 */
public static void main(String[] args) { //Se abre el m�todo main

	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int sumPar, sumImpar;
	//**************************
	
	for (int num=1000;num<=9999;num++){
		sumPar=(num%100/10)+(num%10000/1000);  //Le sumo el d�gito 2 y el d�gito 4, los cuales son sus cifras pares.
		sumImpar=(num%10)+(num%1000/100);      //Le sumo el d�gito 1 y el d�gito 3, los cuales son sus cifras impares.
		if (sumPar==sumImpar)
			System.out.println("El n�mero "+num+" cumple con la condici�n."); //Muestro el n�mero por pantalla.
	}
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
