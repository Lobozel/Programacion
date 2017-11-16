package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio05.java"></a>
 * @author Miguel�ngel
 *
 */

public class Ejercicio05 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Escribir un programa que resuelva la ecuaci�n cuadr�tica (ax^2 + bx + c = 0)
	 * y comprobar que es exactamente una funci�n cuadr�tica.
	 */
public static void main(String[] args) { //Se abre el m�todo main

	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	final double a,b,c;
	double discriminante,x1,x2;
	//**************************
	
	System.out.println("Vamos a resolver una ecuaci�n cuadr�tica \"ax^2+bx+c=0\"");
	
	//Leer los valores de las constantes
	System.out.println("Introduce valor para el coeficiente de a.");
	a=entrada.nextDouble();
	System.out.println("Introduce valor para el coeficiente de b.");
	b=entrada.nextDouble();
	System.out.println("Introduce valor para el coeficiente de c.");
	c=entrada.nextDouble();
	//**************************
	
	discriminante=((b*b)-(4*(a*c))); //Determino cual es el discriminante
	
	//Compruebo si es una ecuaci�n cuadr�tica y si lo es cuantas soluciones tiene y las muestro.
	if(a==0)
		System.out.println("La ecuaci�n no es cuadr�tica.");
	else if (discriminante<0)
		System.out.println("La ecuaci�n no tiene soluciones reales.");
	else if(discriminante==0){
		System.out.println("La ecuaci�n solo tiene una soluci�n real:");
		x1=(-b)/(2*a);
		System.out.println("La solucion es: "+x1);
	}
	else{
		System.out.println("La ecuaci�n tiene dos soluciones reales.");
		x1=(-b)+Math.sqrt(discriminante)/(2*a);
		x2=(-b)-Math.sqrt(discriminante)/(2*a);
		System.out.println("Primera soluci�n:\n"+x1+"\nSegunda soluci�n:\n"+x2);
	}
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
