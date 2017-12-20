package Ejercicio02;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaCafetera { // se abre la clase

	public static void main(String[] args) { // se abre el main
		/*
		 * Creo una instancia de un objeto tipo Cafetera al cual llamo cafetera1
		 * usando el constructor por defecto
		 */
		Cafetera cafetera1 = new Cafetera();
		/*
		 * Creo una instancia de un objeto tipo Cafetera al cual llamo cafetera2
		 * usando el constructor que pide la capacidad m�xima de la cafetera
		 */
		Cafetera cafetera2 = new Cafetera(3000);
		/*
		 * Creo una instancia de un objeto tipo Cafetera al cual llamo cafetera3
		 * usando el constructor que pide la capacidad m�xima de la cafetera
		 * y la cantidad actual de caf� que tiene 
		 */
		Cafetera cafetera3 = new Cafetera(2000, 1000);
		
		
		
		//Lleno la cafetera3
		System.out.println("Procedo a llenar la cafetera n�mero 3:");
		cafetera3.llenarCafetera();
		
		
		//Vacio la cafetera2
		System.out.println("\nProcedo a vacar la cafetera n�mero 2:");
		cafetera2.vaciarCafetera();
		
		
		//agrego caf� en exceso a la cafetera1
		System.out.println("\nVoy a agregar 2000c.c. de caf� a la cafetera n�mero 1:");
		cafetera1.agregarCafe(2000);
		
		
		//Sirvo caf� en exceso desde la cafetera3
		System.out.println("\nVoy a servir 8000c.c. de caf� desde la cafetera n�mero 3:");
		cafetera3.servirTaza(8000);
		

	} // se cierra el main

} // se cierra la clase
