package Ejercicio4_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Texto13 {

/**
 * 
 * @statement Sobre el ejercicio anterior; programa que fusione los dos ficheros
 * anteriores. El fichero se creará en la misma ruta en la que se encuentran los
 * dos ficheros. El usuario mediante un menú decide cual de los dos ficheros se
 * pone primero:
 * 1. Primero ciudades. (Ciudades_Paises)
 * 2. Primero paises (Paises_Ciudades)
 * 3. Salir del programa.
 * 
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		FileReader paises=null;
		FileReader ciudades=null;
		int menu=0;
		int num=0;
		File ruta=null;
		
		do{
			System.out.println("Introduce la ruta donde se encuentran los archivos Ciudades.txt y Paises.txt: ");
			ruta = new File(entrada.nextLine());
			if(!ruta.exists() || !ruta.isDirectory())
				System.out.println("La ruta introducida está mal escrita, no existe o no es un directorio.");
		}while(!ruta.exists() || !ruta.isDirectory());
		
		try {
			paises=new FileReader(ruta+"/Paises.txt");
		} catch (FileNotFoundException e404) {
			System.out.println("Paises.txt no se encuentra en la ruta especificada.");
		}
		
		try {
			ciudades=new FileReader(ruta+"/Ciudades.txt");
		} catch (FileNotFoundException e404) {
			System.out.println("Ciudades.txt no se encuentra en la ruta especificada.");
		}
		
		do{
			try{
				System.out.println("¿Qué archivo quieres que vaya primero?\n"
						+ "1. Primero Ciudades.txt\n"
						+ "2. Primero Paises.txt\n"
						+ "3. Salir del programa.");
				menu=entrada.nextInt();
			}catch(NumberFormatException nf){
				System.out.println("Los datos introducidos no eran de tipo númerico.");
				menu=-1;
			}catch(InputMismatchException im){
				System.out.println("Error al leer los datos.");
				menu=-1;
			}
		}while(menu<1 || menu>3);
		
		BufferedWriter br = null;
		PrintWriter escribir = null;
		
		switch(menu){
		
		case 1:
			try{
				br = new BufferedWriter(new FileWriter(ruta+"/Ciudades_Paises.txt"));
				escribir = new PrintWriter(br);
				while((num=ciudades.read())!=-1){
					char letra=(char)num;
					escribir.print(letra);
				}
				escribir.println();
				while((num=paises.read())!=-1){
					char letra=(char)num;
					escribir.print(letra);
				}
			}catch (FileNotFoundException e) {
				System.out.println("Fichero no encontrado.");
			} catch (IOException e) {
				System.out.println("Error al leer los datos.");
			}
			break;
			
		case 2:
			try{
				br = new BufferedWriter(new FileWriter(ruta+"/Paises_Ciudades.txt"));
				escribir = new PrintWriter(br);
				while((num=paises.read())!=-1){
					char letra=(char)num;
					escribir.print(letra);
				}
				escribir.println();
				while((num=ciudades.read())!=-1){
					char letra=(char)num;
					escribir.print(letra);
				}
			}catch (FileNotFoundException e) {
				System.out.println("Fichero no encontrado.");
			} catch (IOException e) {
				System.out.println("Error al leer los datos.");
			}
			break;
			
		case 3:
			System.out.println("No se ha generado el archivo.");
		}
		
		try{
			escribir.close();
			br.close();
			ciudades.close();
			paises.close();
		}catch(IOException e){
			System.out.println("Error al cerrar un flujo.");
		}
		
		
		if(menu!=3)
		System.out.println("Archivo creado, compruebelo en {"+ruta.getAbsolutePath()+"}");
		
		entrada.close();
	}
}