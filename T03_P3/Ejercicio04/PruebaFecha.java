package Ejercicio04;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaFecha { // se abre la clase

	public static void main(String[] args) { // se abre el main
		
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha(2,3,2015);
		
		//modifico fecha1 con leer
//		fecha1.leer();
		
		
		System.out.println(); // salto de l�nea
		
		
		//Leo la fecha de forma corta de fecha1
				System.out.println(fecha1.corta());
				
		//compruebo si fecha1 es bisiesto
		if(fecha1.bisiesto())
			System.out.println(fecha1.getA�o()+" es bisiesto.");
		else
			System.out.println(fecha1.getA�o()+" no es bisiesto.");
		
		//devuelvo el n� de d�as que tiene el mes de fecha1
		System.out.println("El mes "+fecha1.getMes()+" tiene "+fecha1.diasMes(fecha1.getMes())+" d�as.");
		
		
		System.out.println(); // salto de l�nea
		
		
		//Muestro cuantos d�as han pasado desde 1-1-1900 hasta fecha2
		System.out.println("Desde el 01-01-1900 hasta "+fecha2.corta()+" han transcurrido "+
							fecha2.diasTranscurridos()+" d�as.");
		
		//Leo la fecha de forma larga de fecha2
		System.out.println(fecha2.larga());
		
		/*
		 * hago que la fecha sea la correspondiente a haber transucrrido los
		 * d�as que se indiquen desde el 1-1-1900 con fecha2
		 */
		fecha2.fechaTrans(2000);
		
		//Leo la fecha de forma larga de fecha2
		System.out.println(fecha2.larga());
		
		
		System.out.println(); // salto de l�nea
		
		
		//dia siguiente de fecha2
		fecha2.siguiente();
	    System.out.println(fecha2.larga());
	    
	    //dia anterior de fecha2
	    fecha2.anterior();
	    System.out.println(fecha2.larga());
	
		
		System.out.println(); // salto de l�nea
		
		
	    //compruebo si las fechas son iguales o no
		if (fecha1.igualQue(fecha2))
			System.out.println("Las dos fechas son la misma.");
		else
			System.out.println("Las fechas son distintas.");
		
		//compruebo si fecha1 es menor que fecha2
		if(fecha1.menorQue(fecha2))
			System.out.println("La primera fecha es menor.");
		else
			System.out.println("La segunda fecha es menor.");
		
		//compruebo si fecha1 es mayor que fecha2
		if(fecha1.mayorQue(fecha2))
			System.out.println("La primera fecha es mayor.");
		else
			System.out.println("La segunda fecha es mayor.");
		
	} // se cierra el main

} // se cierra la clase
