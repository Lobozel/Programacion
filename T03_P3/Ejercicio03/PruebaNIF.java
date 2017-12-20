package Ejercicio03;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaNIF { // se abre la clase
/**
 * Clase con método main para pruebas sobre la clase NIF
 * @param args
 */
	public static void main(String[] args) { // se abre el método main
		NIF nif1 = new NIF(); //nif1 con constructor por defecto, NIF no válido.
		NIF nif2 = new NIF(4560); //nif2 con constructor de clase, número de DNI no válido.
		System.out.println(nif1.toString()); //muestro nif1.
		System.out.println(nif2.toString()); //muestro nif2.
		nif1.setNumDNI(456); //le asigno un número no válido por set. NIF no válido.
		nif2.setNumDNI(54862178); //le asigno un número válido para el DNI.
		System.out.println(nif1.toString()); //muestro nif1.
		System.out.println(nif2.toString()); //muestro nif2.

	} //se cierra el método main

} // se cierra la clase
