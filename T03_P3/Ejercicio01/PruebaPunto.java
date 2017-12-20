package Ejercicio01;

import java.util.Scanner;

/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaPunto { // se abre la clase 
	
	public static void main(String[] args) { // se abre el main
		Scanner entrada = new Scanner(System.in);
		Punto punto1 = new Punto();
		System.out.println("Introduce las coordenadas de un punto, por separado.");
		Punto punto2 = new Punto(entrada.nextInt(),entrada.nextInt());
		Punto punto3 = new Punto(punto2);
		System.out.println("Las coordenadas del Punto2 son: "+punto2.toString());
		punto2.setCoordenadaX(2);
		punto2.setCoordenadaY(2);
		System.out.println("Las coordenadas modificadas del Punto2 son: "+punto2.toString());
		System.out.println("La distancia entre el punto1 y el punto 2 es: "+punto1.distancia(punto2));
		Punto puntoMedio = new Punto(punto2.puntoMedio(punto3));
		System.out.println("Las coordenadas de PuntoMedio son: "+puntoMedio.toString());
		punto3.cuadrante();
		entrada.close();
		
	} // se cierra el main

} // se cierra la clase