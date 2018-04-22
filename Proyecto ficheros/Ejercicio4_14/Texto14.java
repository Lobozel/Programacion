package Ejercicio4_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Texto14 {
/**
 * 
 * @statement Programa que permita fusionar dos ficheros de texto en la manera
 * anterior, permitiendo al usuario seleccionar las rutas y los ficheros tanto
 * origen como destino el nombre del fichero resultante será
 * NbFichero1_Nbfichero2.txt
 * 
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos a fusionar dos ficheros en uno.");
		File fichero1=null;
		File fichero2=null;
		File destino=null;
		int num=0;
		
		do{
			System.out.println("Introduce la ruta del directorio donde se creará el fichero: ");
			destino = new File(entrada.nextLine());
			if(!destino.exists() || !destino.isDirectory())
				System.out.println("La ruta especificada no existe o no es un directorio.");
		}while(!destino.exists() || !destino.isDirectory());
		
		do{
			System.out.println("Introduce la ruta del fichero que estará en primer posición: ");
			fichero1=new File(entrada.nextLine());
			if(!fichero1.exists())
				System.out.println("El fichero no existe.");
		}while(!fichero1.exists());
		
		do{
			System.out.println("Introduce la ruta del fichero que estará en ultima posición: ");
			fichero2=new File(entrada.nextLine());
			if(!fichero2.exists())
				System.out.println("El fichero no existe.");
		}while(!fichero2.exists());
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(destino+"/"+fichero1.getName().substring(0, fichero1.getName().length()-4)+"_"+fichero2.getName()));
			PrintWriter escribir = new PrintWriter(br);
			FileReader leer = new FileReader(fichero1);
			while((num=leer.read())!=-1){
				char letra=(char)num;
				escribir.print(letra);
			}
			escribir.println();
			leer.close();
			leer=new FileReader(fichero2);
			while((num=leer.read())!=-1){
				char letra=(char)num;
				escribir.print(letra);
			}
			leer.close();
			escribir.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Archivo creado, compruebelo en {"+destino.getAbsolutePath()+"}");
		
		entrada.close();
	}

}
