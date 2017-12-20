package Ejercicio01;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaRectángulo { // se abre la clase

	public static void main(String[] args) { // se abre el main
		/*
		 * Creo 4 objetos de tipo Punto que pasaré después por parámetros
		 * para un instancia de un objeto de clase Rectángulo.
		 */
		Punto Punto1 = new Punto(1,1);
		Punto Punto2 = new Punto(2,2);
		Punto Punto3 = new Punto(3,3);
		Punto Punto4 = new Punto(4,4);
		
		
		/*
		 * Utilizo el constructor parámetrizado que me pide parámetros de tipo
		 * Punto para crear una instancia de tipo Rectángulo a la que llamo rectángulo1
		 */
		Rectángulo rectángulo1 = new Rectángulo(Punto1,Punto2,Punto3,Punto4);
		/*
		 * Utilizo el constructor parámetrizado que me pide los parámetros 
		 * int base e int altura para crear una instancia de tipo Rectángulo a la que
		 * llamo rectángulo2
		 */
		Rectángulo rectángulo2 = new Rectángulo(1,2);
		/*
		 * Utilizo el constructor por defecto para crear una tercera instancia de tipo
		 * Rectángulo a la que llamo rectángulo3
		 */
		Rectángulo rectángulo3 = new Rectángulo();
		
		
		
		//Muestro los vertices del rectángulo1
		System.out.println(rectángulo1.toString());
		//Muestro el área del rectángulo1
		System.out.println("El área del rectángulo 1 es: "+rectángulo1.area());
		
		
		//Hago un salto para diferenciar más entre un rectángulo y otro
		System.out.println("/////////////////////////////////////////////");
		
		
		//Muestro los vertices del rectángulo2
		System.out.println(rectángulo2.toString());
		//Muestro el perímetro del rectángulo2
		System.out.println("El perímetro del rectángulo 2 es: "+rectángulo2.perimetro());
		
		
		//Hago un salto para diferenciar más entre un rectángulo y otro
		System.out.println("/////////////////////////////////////////////");
				
				
		//Muestro los vertices del rectángulo3
		System.out.println("Antes de darle valor:\n"+rectángulo3.toString());
		//Utilizo los set para darle valor
		rectángulo3.setVerInfIzq(Punto1);
		rectángulo3.setVerInfDer(Punto2);
		rectángulo3.setVerSupIzq(Punto3);
		rectángulo3.setVerSupDer(Punto4);
		//Desplazo los vertices del rectángulo3 según un punto dado
		rectángulo3.desplazar(Punto1);
		//Muestro de nuevo los vertices del rectángulo3
		System.out.println("Después de darle valor:\n"+rectángulo3.toString());
		
	} // se cierra el main

} // se cierra la clase
