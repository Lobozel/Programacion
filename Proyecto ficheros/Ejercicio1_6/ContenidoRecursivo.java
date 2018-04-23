package Ejercicio1_6;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */

public class ContenidoRecursivo {
	
/**
 * 
 * @statement Mostrar el contenido de los archivos y directorios de un directorio que
 * leeremos desde teclado. Si es un fichero tras su nombre incluiremos la palabra es un
 * fichero. Si es un directorio mostraremos su contenido. Sólo lo haremos sobre el primer
 * nivel de directorios.
 * 
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String ruta="";

		System.out.println("Introduce la ruta de un directorio para ver su contenido: ");
		try{
			ruta=entrada.nextLine();
		}catch(InputMismatchException im){
			System.out.println("Error en la entrada de datos. Prueba de nuevo.\n");
		}
		File directorio = new File(ruta);
		
		if(directorio.exists()){
			if(directorio.isFile())
				System.out.println(directorio.getName()+" es un fichero.");
			else{
				File[] contenido = directorio.listFiles();
				for (File f : contenido)
					System.out.println("   |--> "+f.getName());
			}
		}else{
			System.out.println("La ruta introducida no existe, compruebe que la ha escrito correctamente.\n");
		}
		entrada.close();
		

	}

}
