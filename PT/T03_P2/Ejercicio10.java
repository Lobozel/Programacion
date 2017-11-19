package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio10.java"></a>
 * @author MiguelÁngel
 *
 */

public class Ejercicio10 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Hacer un programa que muestre el siguiente menú:
	 * <table width=10% border=1><tr><td>
	 * MENÚ<br>
	 * 1.- Números Primos<br>
	 * 2.- Suma succesión<br>
	 * 3.- Mayor Menor<br>
	 * 4.- Raíz cuadrada<br>
	 * 5.- Salir
	 * </td></tr></table>
	 * · Si el usuario pulsa la opción 1: se le pedirá un número entero,
	 * positivo y distinto de 0, y se escribirá un mensaje indicando si el
	 * número es primo o no. Un número es primo cuando es divisible
	 * por si mismo y por la unidad. (El 1 no es primo).
	 * · Si el usuario pulsa la opción 2: se le pedirá un número entero,
	 * `positivo y mayor que 0, y se escribirá la suma de los términos
	 * 1,1/2,1/3,..... hasta siendo n el número que se ha introducido por
	 * teclado.
	 * · Si el usuario pulsa la opción 3: se le pedirá un número entero,
	 * positivo y distinto de 0, a continuación se pedirán tantos números
	 * enteros como indique el número introducido y se mostrará el
	 * mayor valor, el menor valor y si se ha introducido algún 0.
	 * · Si el usuario pulsa la opción 4: se le pedirá un número entero,
	 * positivo y distinto de 0 y mostrará la raíz cuadrada de dicho
	 * número y su resto
	 * P.e. la raíz cuadrada de 13 es 3
	 *         Resto es 4 (13-3*3=4)
	 */
public static void main(String[] args) { //Se abre el método main
	
	//Declaración de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	/*
	 * menu se usará para leer una opción del menu
	 * num será el número entero positivo diferente a 0 que pide leer cada programa
	 * contaDiv para contar cuantos multiplos tiene el número y así saber si es primo o no.
	 * suma para sumar la sucesion de números en el programa 2
	 * numeros será la que lea números en el programa 3
	 * menor almacenará el menor número introducido en el programa 3, al revés con mayor.
	 * hayCero se utilizará para saber si se ha introducido un 0 en el programa 3 (false para no, true para si)
	 */
	int menu, num, contaDiv=0, suma=0, numeros, menor=Integer.MAX_VALUE,mayor=Integer.MIN_VALUE;
	boolean hayCero=false;
	//**************************
	
	//Muestra el menú y lee una opción.
	do{
	System.out.println("MENÚ");
	System.out.println("1.-Números primos");
	System.out.println("2.-Suma succesión");
	System.out.println("3.-Mayor Menor");
	System.out.println("4.-Raíz cuadrada");
	System.out.println("5.-Salir");
	menu=entrada.nextInt();
	}while(menu<1 || menu>5);
	//**************************
	
	//Para no repetir código, se lee un número antes del switch, ya que se usará en las opciones 1 a la 4.
	do{
	System.out.println("Introduce un número entero, positivo y distinto de 0.");
	num=entrada.nextInt();
	}while(num<=0);
	//**************************
	
	//Según la opción que haya escogido el usuario se realizará una cosa u otra
	switch (menu){
		//Si menu=1, el programa hace lo siguiente:
	case 1:
		System.out.println("***** HA ESCOGIDO LA OPCIÓN DE NÚMEROS PRIMOS *****");
		for (int cont=1;cont<=num;cont++)
			  if(num%cont==0)
			  contaDiv++;
		  if(contaDiv<=2 && num!=1)
			  System.out.println(num+" es un número primo.");
		  else
			  System.out.println(num+" no es un número primo.");
		break;
		//Si menu=2, el programa hace lo siguiente:
	case 2:
		System.out.println("***** HA ESCOGIDO LA OPCIÓN DE SUMA SUCCESIÓN *****");
		for(int cont=1;cont<=num;cont++){
			suma+=1/cont;
		}
		System.out.println("El resultado de la succesión es: "+suma);
		break;
		//Si menu=3, el programa hace lo siguiente:
	case 3:
		System.out.println("***** HA ESCOGIDO LA OPCIÓN DE MAYOR MENOR *****");
		for(int cont=0;cont<=num;cont++){
		System.out.println("Introduce un número.");
		numeros=entrada.nextInt();
		if(numeros<menor)
			menor=numeros;
		if(numeros>mayor)
			mayor=numeros;
		if(numeros==0 && !hayCero)
			hayCero=true;
	}
	System.out.println("El menor número introducido es "+menor);
	System.out.println("El mayor número introducido es "+mayor);
	if(hayCero)
		System.out.println("Se ha leido al menos un 0.");
	else
		System.out.println("No se ha leido ningún 0.");
		break;
		//Si menu=4, el programa hace lo siguiente:
	case 4:
		System.out.println("***** HA ESCOGIDO LA OPCIÓN DE RAÍZ CUADRADA *****");
		//Con Math.sqrt retorno la raíz del número y con (int) convierto el resultado en un entero. El resto es numero-raíz*raíz
		System.out.println("La raíz cuadrada de "+num+" es "+(int)(Math.sqrt(num))+" y su resto es "+(num-(int)(Math.sqrt(num))*(int)(Math.sqrt(num))));
		break;
		//Si menu=5, el programa hace lo siguiente:
	case 5:
		System.out.println("***** HA ESCOGIDO LA OPCIÓN DE SALIR *****");
		System.out.println("Gracias por usar este programa.");
	}
	
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el método main

} // Se cierra la clase
