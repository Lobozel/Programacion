package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P4_E09 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Realiza un programa Java que lea un número por teclado que pida
		 * el precio de un producto (puede tener decimales) y calcule el
		 * precio final con IVA. El IVA será una constante que será del 21%*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		final double IVA=0.21;
		double precioProducto;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca el precio del producto.");
		precioProducto=entrada.nextDouble();
		
		//Precio final del producto
		System.out.println("El producto más IVA costará: "+(precioProducto+precioProducto*IVA));
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase