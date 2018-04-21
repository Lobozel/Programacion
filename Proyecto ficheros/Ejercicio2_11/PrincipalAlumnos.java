package Ejercicio2_11;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class PrincipalAlumnos {
/**
 * 
 * @statement Crear un fichero de alumnos con los datos de los alumnos de un curso:
 * nombre, dirección, edad y nota media. Crear los métodos para crear el archivo
 * y mostrar datos. Leer desde el teclado y escribir por pantalla los datos de cada
 * uno de los alumnos.
 * 
 */
	
	public static void crearFichero(String ruta){
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			FileOutputStream nuevo = new FileOutputStream(ruta);
			do{
				leerAlumnos(leer, nuevo);
				System.out.println("Introduce la letra f si NO desea introducir otro alumno.\n"
						+ "Cualquier otro carácter servirá para continuar introduciendo alumnos: ");
			}while(leer.readLine().toLowerCase().charAt(0)!='f');
			mostrarFichero(ruta);
			leer.close();
			nuevo.close();
		}catch(IOException io){
			System.out.println("Error en la entrada o salida de datos.");
		}
			
	}
	
	protected static void leerAlumnos(BufferedReader leer, FileOutputStream nuevo){
		DataOutputStream entrada = new DataOutputStream(nuevo);
		
		String nombre=null; String direccion=null; int edad=0; double notaMedia=0;
		
		try {
			System.out.println("Introduce el nombre del alumno: ");
			nombre=leer.readLine();
			System.out.println("Introduce la dirección del alumno: ");
			direccion=leer.readLine();
		} catch (IOException io) {
			System.out.println("Error al leer los datos introducidos.");
		}
		
		/**
		 * La persona más vieja conocida <<Jeanne Calment>> murió con 122 años y 164 días.
		 * Por ello pongo el máximo de edad en 125.
		 * 
		 */
		do{
			try{
				System.out.println("Introduce la edad del alumno: ");
				edad = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException nf) {
				System.out.println("No se han introducido datos de tipo númerico.");
				edad=-1;
			} catch (IOException io) {
				System.out.println("Error al leer los datos introducidos.");
				edad=-1;
			}
		}while(edad<0 || edad>125);
		do{
			try{
				System.out.println("Introduce la nota media del alumno: ");
				notaMedia=Double.parseDouble(leer.readLine());
			} catch (NumberFormatException nf) {
				System.out.println("No se han introducido datos de tipo númerico.");
				notaMedia=-1;
			} catch (IOException io) {
				System.out.println("Error al leer los datos introducidos.");
				notaMedia=-1;
			}
		}while(notaMedia<0 || notaMedia>10);
		
		try {
			entrada.writeUTF(nombre);
			entrada.writeUTF(direccion);
			entrada.writeInt(edad);
			entrada.writeDouble(notaMedia);
		} catch (IOException io) {
			System.out.println("Error al escribir los datos en el archivo.");
		}
		
		
		try {
			entrada.close();
		} catch (IOException e) {
			System.out.println("Error inesperado. Ejecute el programa de nuevo porfavor.");
		}
	}
	
	protected static void mostrarFichero(String ruta){
		try {
			FileInputStream fichero=new FileInputStream(ruta);
			try(DataInputStream salida = new DataInputStream(fichero)){
				while(true){
					System.out.println(salida.readUTF());
					System.out.println(salida.readUTF());
					System.out.println(salida.readInt());
					System.out.println(salida.readDouble());
				}
			}catch(IOException io){
				System.out.println("Error inesperado.");
			}
		} catch (FileNotFoundException e404) {
			System.out.println("Archivo no encontrado.");
		}
	}
	
	public static void main(String[] args) {
		String ruta="C:/Ficheros/Alumnos.txt";
		crearFichero(ruta);
		
		

	}

}
