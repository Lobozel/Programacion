package T03_P2;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Ejercicio06 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Diseñar e implementar un programa que solicite a su usuario un valor no 
	 * negativo n y visualice la siguiente salida:
	 * 1     2     3 ........     n-1  n
	 * 1     2     3 ........    n-1
	 * ...
	 * 1     2     3
	 * 1     2
	 */
public static void main(String[] args) { //Se abre el método main

	//Declaración de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int num;
	//**************************
	
	//Leer un número entero positivo
	do{
		System.out.println("Introduce un número mayor que 0.");
		num=entrada.nextInt();
	}while(num<=0); //Si introduciera un 0 no podría realizarse la secuencia del enunciado, ya que empieza con un 1.
	//**************************
	
	//Mostrar la secuencia del enunciado
	System.out.println();
	for(int cont1=num;cont1>1;cont1--){ //El contador 1 empieza con el valor leido y baja hasta el valor 1.
		for(int cont2=1;cont2<=cont1;cont2++){ //El contador 2 empieza con el valor 1 y sube hasta el valor de contador 2.
			System.out.print(cont2+"    ");
		}
		System.out.println();
	}
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el método main

} // Se cierra la clase
