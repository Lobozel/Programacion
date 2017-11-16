package T03_P2;

import java.util.Scanner;

/**
 * 
 * @author Miguel�ngel
 *
 */

public class Ejercicio02 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Dada una secuencia de n�meros terminada en cero (0), elaborar un 
	 * algoritmo para calcular el porcentaje y la suma de los n�meros impares, 
	 * el porcentaje y la suma de los n�meros pares, la suma de todos los 
	 * n�meros y cuantos n�meros fueron ingresados, muestre finalmente 
	 * estos resultados al usuario.
	 */
public static void main(String[] args) { //Se abre el m�todo main

	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int sumImP=0, sumP=0, sumT=0, num=1;//suma de impares, suma de pares, suma total, numero.
	float contP=0, contImP=0, contT=0; //contador de pares, contador de impares, contador total.
	//**************************
	
	//Bucle que lee n�meros, cuenta los n�meros introducidos y suma los impares, los pares y todos los introducidos.
	while(num!=0){
		System.out.println("Introduce un n�mero.");
		num=entrada.nextInt();
		if(num!=0){ //Este if es para que no cuente el 0 en las siguientes operaciones.
			sumT+=num;
			contT++;
			if(num%2==0){
				sumP+=num;
				contP++;
			}
			else {
				sumImP+=num;
				contImP++;
			}
		}
		
	}
	//**************************
	
	//Muestra la informaci�n al usuario.
	System.out.println("Se han introducido "+(int)contT+" n�meros.");
	System.out.println("La suma total de estos es "+sumT+".");
	System.out.println("La suma de los n�meros pares es "+sumP+".");
	System.out.println("La suma de los n�meros impares es "+sumImP+".");
	System.out.printf("%s %.2f%s\n","Se ha introducido un",contP*100/contT,"% de n�meros pares.");
	System.out.printf("%s %.2f%s\n","Se ha introducido un",contImP*100/contT,"% de n�meros impares.");
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
