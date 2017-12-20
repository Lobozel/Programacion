package Ejercicio03;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaNIF { // se abre la clase
/**
 * Clase con m�todo main para pruebas sobre la clase NIF
 * @param args
 */
	public static void main(String[] args) { // se abre el m�todo main
		NIF nif1 = new NIF(); //nif1 con constructor por defecto, NIF no v�lido.
		NIF nif2 = new NIF(4560); //nif2 con constructor de clase, n�mero de DNI no v�lido.
		System.out.println(nif1.toString()); //muestro nif1.
		System.out.println(nif2.toString()); //muestro nif2.
		nif1.setNumDNI(456); //le asigno un n�mero no v�lido por set. NIF no v�lido.
		nif2.setNumDNI(54862178); //le asigno un n�mero v�lido para el DNI.
		System.out.println(nif1.toString()); //muestro nif1.
		System.out.println(nif2.toString()); //muestro nif2.

	} //se cierra el m�todo main

} // se cierra la clase
