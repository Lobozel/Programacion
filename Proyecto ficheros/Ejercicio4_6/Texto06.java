package Ejercicio4_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class Texto06 {

/**
 * 
 * @statement Crea un programa que pida al usuario el nombre de un fichero y una
 * palabra a buscar en él. Debe mostrar en pantalla todas las líneas del fichero
 * que contengan esa palabra.
 * 
 */
	protected static int contarPalabras(String cad) {
		int cont=0;
		for(int i=1;i<cad.length();i++) {
			if(Character.isSpaceChar(cad.charAt(i)) && !Character.isSpaceChar(cad.charAt(i-1))
			|| !Character.isSpaceChar(cad.charAt(i)) && i+2>cad.length())
				cont++;
		}
		return cont;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String buscar="", cad="";
		File archivo =null;
		do{
			System.out.println("Introduce la ruta del archivo: ");
			archivo = new File(entrada.nextLine());
			if(!archivo.exists())
				System.out.println("La ruta introducida está mal escrita o no existe.");
		}while(!archivo.exists());
		
		do{
			System.out.println("Introduce la palabra a buscar: ");
			buscar=entrada.nextLine();
			if(contarPalabras(buscar)!=1)
				System.out.println("Porfavor, introduce solo una palabra.");
		}while(contarPalabras(buscar)!=1);
		
		try {
			FileReader leer = new FileReader(archivo);
			BufferedReader br = new BufferedReader(leer);
			while((cad=br.readLine())!=null){
				if(cad.indexOf(cad)!=-1)
					System.out.println(cad);
			}
			br.close();
			leer.close();
		} catch (FileNotFoundException e404) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error en la lectura de datos.");
		}
		
		entrada.close();

	}

}
