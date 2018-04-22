package Ejercicio4_12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Texto12 {

/**
 * 
 * @statement Hacer un programa que permita crear dos ficheros de texto que
 * contengan nombre de ciudades(Ciudades.txt) y de países(Paises.txt). El programa
 * debe dar al usuario la posibilidad de indicar la ruta en la que se van a crear
 * ambos ficheros que será la misma para los dos.
 * 
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] paises = new String[]{"Alemania, Brasil, Canadá, España, Grecia, Hungría, Japón"};
		String[] ciudades = new String[]{"Berlín, Brasilia, Ottawa, Madrid, Atenas, Budapest, Tokio"};
		
		File ruta=null;
		
		do{
			System.out.println("Introduce la ruta donde se crearán los archivos Ciudades.txt y Paises.txt: ");
			ruta = new File(entrada.nextLine());
			if(!ruta.exists() || !ruta.isDirectory())
				System.out.println("La ruta introducida está mal escrita, no existe o no es un directorio.");
		}while(!ruta.exists() || !ruta.isDirectory());
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(ruta+"/Ciudades.txt"));
			PrintWriter escribir = new PrintWriter(br);
			for(String e:ciudades)
				escribir.println(e);
			escribir.close();
			br.close();
		} catch (IOException e) {
			System.out.println("Error al leer los datos.");
		}
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(ruta+"/Paises.txt"));
			PrintWriter escribir = new PrintWriter(br);
			for(String e:paises)
				escribir.println(e);
			escribir.close();
			br.close();
		} catch (IOException e) {
			System.out.println("Error al leer los datos.");
		}
	
		System.out.println("Archivos creados, compruebelo en {"+ruta.getAbsolutePath()+"}");
		
		entrada.close();
	}

}
