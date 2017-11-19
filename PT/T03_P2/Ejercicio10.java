package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio10.java"></a>
 * @author Miguel�ngel
 *
 */

public class Ejercicio10 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Hacer un programa que muestre el siguiente men�:
	 * <table width=10% border=1><tr><td>
	 * MEN�<br>
	 * 1.- N�meros Primos<br>
	 * 2.- Suma succesi�n<br>
	 * 3.- Mayor Menor<br>
	 * 4.- Ra�z cuadrada<br>
	 * 5.- Salir
	 * </td></tr></table>
	 * � Si el usuario pulsa la opci�n 1: se le pedir� un n�mero entero,
	 * positivo y distinto de 0, y se escribir� un mensaje indicando si el
	 * n�mero es primo o no. Un n�mero es primo cuando es divisible
	 * por si mismo y por la unidad. (El 1 no es primo).
	 * � Si el usuario pulsa la opci�n 2: se le pedir� un n�mero entero,
	 * `positivo y mayor que 0, y se escribir� la suma de los t�rminos
	 * 1,1/2,1/3,..... hasta siendo n el n�mero que se ha introducido por
	 * teclado.
	 * � Si el usuario pulsa la opci�n 3: se le pedir� un n�mero entero,
	 * positivo y distinto de 0, a continuaci�n se pedir�n tantos n�meros
	 * enteros como indique el n�mero introducido y se mostrar� el
	 * mayor valor, el menor valor y si se ha introducido alg�n 0.
	 * � Si el usuario pulsa la opci�n 4: se le pedir� un n�mero entero,
	 * positivo y distinto de 0 y mostrar� la ra�z cuadrada de dicho
	 * n�mero y su resto
	 * P.e. la ra�z cuadrada de 13 es 3
	 *         Resto es 4 (13-3*3=4)
	 */
public static void main(String[] args) { //Se abre el m�todo main
	
	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	/*
	 * menu se usar� para leer una opci�n del menu
	 * num ser� el n�mero entero positivo diferente a 0 que pide leer cada programa
	 * contaDiv para contar cuantos multiplos tiene el n�mero y as� saber si es primo o no.
	 * suma para sumar la sucesion de n�meros en el programa 2
	 * numeros ser� la que lea n�meros en el programa 3
	 * menor almacenar� el menor n�mero introducido en el programa 3, al rev�s con mayor.
	 * hayCero se utilizar� para saber si se ha introducido un 0 en el programa 3 (false para no, true para si)
	 */
	int menu, num, contaDiv=0, suma=0, numeros, menor=Integer.MAX_VALUE,mayor=Integer.MIN_VALUE;
	boolean hayCero=false;
	//**************************
	
	//Muestra el men� y lee una opci�n.
	do{
	System.out.println("MEN�");
	System.out.println("1.-N�meros primos");
	System.out.println("2.-Suma succesi�n");
	System.out.println("3.-Mayor Menor");
	System.out.println("4.-Ra�z cuadrada");
	System.out.println("5.-Salir");
	menu=entrada.nextInt();
	}while(menu<1 || menu>5);
	//**************************
	
	//Para no repetir c�digo, se lee un n�mero antes del switch, ya que se usar� en las opciones 1 a la 4.
	do{
	System.out.println("Introduce un n�mero entero, positivo y distinto de 0.");
	num=entrada.nextInt();
	}while(num<=0);
	//**************************
	
	//Seg�n la opci�n que haya escogido el usuario se realizar� una cosa u otra
	switch (menu){
		//Si menu=1, el programa hace lo siguiente:
	case 1:
		System.out.println("***** HA ESCOGIDO LA OPCI�N DE N�MEROS PRIMOS *****");
		for (int cont=1;cont<=num;cont++)
			  if(num%cont==0)
			  contaDiv++;
		  if(contaDiv<=2 && num!=1)
			  System.out.println(num+" es un n�mero primo.");
		  else
			  System.out.println(num+" no es un n�mero primo.");
		break;
		//Si menu=2, el programa hace lo siguiente:
	case 2:
		System.out.println("***** HA ESCOGIDO LA OPCI�N DE SUMA SUCCESI�N *****");
		for(int cont=1;cont<=num;cont++){
			suma+=1/cont;
		}
		System.out.println("El resultado de la succesi�n es: "+suma);
		break;
		//Si menu=3, el programa hace lo siguiente:
	case 3:
		System.out.println("***** HA ESCOGIDO LA OPCI�N DE MAYOR MENOR *****");
		for(int cont=0;cont<=num;cont++){
		System.out.println("Introduce un n�mero.");
		numeros=entrada.nextInt();
		if(numeros<menor)
			menor=numeros;
		if(numeros>mayor)
			mayor=numeros;
		if(numeros==0 && !hayCero)
			hayCero=true;
	}
	System.out.println("El menor n�mero introducido es "+menor);
	System.out.println("El mayor n�mero introducido es "+mayor);
	if(hayCero)
		System.out.println("Se ha leido al menos un 0.");
	else
		System.out.println("No se ha leido ning�n 0.");
		break;
		//Si menu=4, el programa hace lo siguiente:
	case 4:
		System.out.println("***** HA ESCOGIDO LA OPCI�N DE RA�Z CUADRADA *****");
		//Con Math.sqrt retorno la ra�z del n�mero y con (int) convierto el resultado en un entero. El resto es numero-ra�z*ra�z
		System.out.println("La ra�z cuadrada de "+num+" es "+(int)(Math.sqrt(num))+" y su resto es "+(num-(int)(Math.sqrt(num))*(int)(Math.sqrt(num))));
		break;
		//Si menu=5, el programa hace lo siguiente:
	case 5:
		System.out.println("***** HA ESCOGIDO LA OPCI�N DE SALIR *****");
		System.out.println("Gracias por usar este programa.");
	}
	
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
