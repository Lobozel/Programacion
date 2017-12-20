package Ejercicio01;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaRect�ngulo { // se abre la clase

	public static void main(String[] args) { // se abre el main
		/*
		 * Creo 4 objetos de tipo Punto que pasar� despu�s por par�metros
		 * para un instancia de un objeto de clase Rect�ngulo.
		 */
		Punto Punto1 = new Punto(1,1);
		Punto Punto2 = new Punto(2,2);
		Punto Punto3 = new Punto(3,3);
		Punto Punto4 = new Punto(4,4);
		
		
		/*
		 * Utilizo el constructor par�metrizado que me pide par�metros de tipo
		 * Punto para crear una instancia de tipo Rect�ngulo a la que llamo rect�ngulo1
		 */
		Rect�ngulo rect�ngulo1 = new Rect�ngulo(Punto1,Punto2,Punto3,Punto4);
		/*
		 * Utilizo el constructor par�metrizado que me pide los par�metros 
		 * int base e int altura para crear una instancia de tipo Rect�ngulo a la que
		 * llamo rect�ngulo2
		 */
		Rect�ngulo rect�ngulo2 = new Rect�ngulo(1,2);
		/*
		 * Utilizo el constructor por defecto para crear una tercera instancia de tipo
		 * Rect�ngulo a la que llamo rect�ngulo3
		 */
		Rect�ngulo rect�ngulo3 = new Rect�ngulo();
		
		
		
		//Muestro los vertices del rect�ngulo1
		System.out.println(rect�ngulo1.toString());
		//Muestro el �rea del rect�ngulo1
		System.out.println("El �rea del rect�ngulo 1 es: "+rect�ngulo1.area());
		
		
		//Hago un salto para diferenciar m�s entre un rect�ngulo y otro
		System.out.println("/////////////////////////////////////////////");
		
		
		//Muestro los vertices del rect�ngulo2
		System.out.println(rect�ngulo2.toString());
		//Muestro el per�metro del rect�ngulo2
		System.out.println("El per�metro del rect�ngulo 2 es: "+rect�ngulo2.perimetro());
		
		
		//Hago un salto para diferenciar m�s entre un rect�ngulo y otro
		System.out.println("/////////////////////////////////////////////");
				
				
		//Muestro los vertices del rect�ngulo3
		System.out.println("Antes de darle valor:\n"+rect�ngulo3.toString());
		//Utilizo los set para darle valor
		rect�ngulo3.setVerInfIzq(Punto1);
		rect�ngulo3.setVerInfDer(Punto2);
		rect�ngulo3.setVerSupIzq(Punto3);
		rect�ngulo3.setVerSupDer(Punto4);
		//Desplazo los vertices del rect�ngulo3 seg�n un punto dado
		rect�ngulo3.desplazar(Punto1);
		//Muestro de nuevo los vertices del rect�ngulo3
		System.out.println("Despu�s de darle valor:\n"+rect�ngulo3.toString());
		
	} // se cierra el main

} // se cierra la clase
