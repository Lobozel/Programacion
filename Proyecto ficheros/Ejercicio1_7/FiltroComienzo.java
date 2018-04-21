package Ejercicio1_7;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class FiltroComienzo {

/**
 * 
 * @statement Escribrir todos los ficheros de un directorio que empiecen por una
 * determinada letra (indiferente si es mayúscula o minúscula).
 * 
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String ruta="";
		char letra='a';
		
		try{
			System.out.println("Introduce la ruta de un directorio: ");
			ruta=entrada.nextLine();
		}catch(InputMismatchException im){
			System.out.println("Error en la entrada de datos. Prueba de nuevo.\n");
		}
		
		File directorio = new File(ruta);
		
		if(directorio.exists() && directorio.isDirectory()){
			
			try{
				System.out.println("Introduce una letra para filtar los archivos: ");
				letra=entrada.next().charAt(0);
			}catch(InputMismatchException im){
				System.out.println("Error en la entrada de datos. Prueba de nuevo.\n");
			}
			
			File[] contenido = directorio.listFiles();
			System.out.println("\n"+directorio.getAbsolutePath());
			for(File f:contenido)
				if(f.getName().toUpperCase().charAt(0)==letra || f.getName().toLowerCase().charAt(0)==letra)
					System.out.println("   |--> "+f.getName());
		}else
			System.out.println("La ruta introducida no existe o no lleva a un directorio. Pruebe de nuevo.");
		
		
		entrada.close();
		
	}

}
