package Ejercicio4_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Texto04 {

/**
 * 
 * @statement Repetir los apartados anteriores seleccionando desde teclado
 * la ruta y el fichero a copiar.
 * 
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		File origen=null;
		File destino=null;
		
		do{
			System.out.println("Introduce la ruta del fichero a leer: ");
			origen = new File(entrada.nextLine());
			System.out.println("Introduce la ruta del fichero donde se volcará el contenido del primero en mayúsculas: ");
			 destino = new File(entrada.nextLine());
			 
			 if(!origen.exists() || !destino.exists())
				 System.out.println("Al menos una de las rutas no está bien escrita o no existe.");
			 
		}while(!origen.exists() || !destino.exists());
		
			try {
				FileReader leer = new FileReader(origen);
				PrintWriter escribir = new PrintWriter(destino);
				System.out.println("\nEste es el contenido del archivo origen: ");
				while((num=leer.read())!=-1){
					char letra=(char)num;
					System.out.print(letra);
					escribir.print(String.valueOf(letra).toUpperCase());
				}
				leer.close();
				escribir.close();
			} catch (FileNotFoundException e) {
				System.out.println("Fichero no encontrado.");
			} catch (IOException e) {
				System.out.println("Error al leer los datos.");
			}
			
			try {
				FileReader leer = new FileReader(destino);
				System.out.println("\n\nEste es el contenido del archivo destino: ");
				while((num=leer.read())!=-1){
					char letra=(char)num;
					System.out.print(letra);
				}
				leer.close();
			} catch (FileNotFoundException e) {
				System.out.println("Fichero no encontrado.");
			} catch (IOException e) {
				System.out.println("Error al leer los datos.");
			}
		
		
		
		
		entrada.close();
		
		

	}

}
