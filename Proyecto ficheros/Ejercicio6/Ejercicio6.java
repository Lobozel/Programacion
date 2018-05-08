package Ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Miguel�ngel
 *
 */
public class Ejercicio6 {
/**
 * 
 * @statement Una academia desea almacenar en un fichero aleatorio la informaci�n
 * de los 15 cursos que imparte en la actualidad, los datos que desea guardar son:
 * - N�mero de orden: un n�mero del 1 al 15.
 * - Nombre del curso: un m�ximo de 15 car�cteres.
 * - Precio valor real.
 * Para ello se crear� un men� con los siguientes apartados:
 * 1. Crear fichero (crea el fichero con los 15 grupos)
 * 2. A�adir cursos (incluir� los nuevos cursos al final a�adiendo 1 al �ltimo
 * n�mero de orden)
 * 3. Consulta (Pretende mostrar datos del fichero)
 * 4. Borrado de registros (Borrado l�gico, marcar� el fichero a borrar con un
 * -1 en el n�mero de orden)
 * 5. Compactar fichero (borrar� todos los ficheros marcados con -1, y compactar�
 * el fichero eliminando los huecos y numerando los cursos a partir de 1)
 * 6. Salir del programa.
 * El proceso se repite mientras no se decida salir.
 * Una vez creado el fichero no se puede acceder a la opci�n 1.
 * Si se selecciona la opci�n dos se permiten tres tipos de consultas:
 * a) Consulta General (Se mostrar�n todos los cursos ofertados en ese momento)
 * b) Buscar curso por nombre, se mostrar� el nombre del curso y el precio de
 * dicho curso o un mensaje indicativo de que el curso no existe.
 * c) Buscar por precio, se mostrar�n todos los cursos de ese precio o un
 * mensaje indicativo de que no hay ning�n curso con ese precio.
 * 
 */
	static int i=1;
	public static void crearFichero(Scanner entrada, File archivo){
		String nombre="";
		double precio=0;
		try {
			RandomAccessFile academia = new RandomAccessFile(archivo, "rw");
			for(;i<=15;i++){
				academia.writeInt(i);
				do{
					System.out.println("Introduce el nombre del curso "+i+" (menos de 15 caracteres): ");
					nombre=entrada.next();
				}while(nombre.length()>15);
				academia.writeUTF(nombre);
				do{
					try{
						System.out.println("Introduce el precio del curso: ");
						precio=entrada.nextDouble();
					}catch(NumberFormatException nf){
						System.out.println("Los datos introducidos no eran de tipo n�merico.");
						precio=-1;
					}catch(InputMismatchException im){
						System.out.println("Error al leer los datos.");
						precio=-1;
					}
				}while(precio<0);
			}	
			
			academia.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error E/S.");
		}
	}
	
	public static void AddRecursos(File archivo, Scanner entrada){
		String nombre="";
		double precio=0;
		
		try {
			RandomAccessFile academia = new RandomAccessFile(archivo, "rw");
			academia.writeInt(++i);
			do{
				System.out.println("Introduce el nombre del curso "+i+" (menos de 15 caracteres): ");
				nombre=entrada.next();
			}while(nombre.length()>15);
			academia.writeUTF(nombre);
			do{
				try{
					System.out.println("Introduce el precio del curso: ");
					precio=entrada.nextDouble();
				}catch(NumberFormatException nf){
					System.out.println("Los datos introducidos no eran de tipo n�merico.");
					precio=-1;
				}catch(InputMismatchException im){
					System.out.println("Error al leer los datos.");
					precio=-1;
				}
			}while(precio<0);
			academia.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException e) {
			System.out.println("Error E/S.");
		}
		
	}
	
	public static void BorrarRegistros(){
		
	}
	
	public static void CompactarFichero(){
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int menu=0;
		File archivo = new File("C:/Ficheros/academia.dat");
		
		do{
			do{
				try{
					System.out.println("\n1. Crear Fichero.\n"
							+ "2. A�adir curso.\n"
							+ "3. Consulta.\n"
							+ "4. Borrado de registros.\n"
							+ "5. Compactar fichero.\n"
							+ "6. Salir del programa.\n"
							+ "Selecciona una opci�n: ");
					menu=entrada.nextInt();
				}catch(NumberFormatException nf){
					System.out.println("Los datos introducidos no eran de tipo n�merico.");
					menu=-1;
				}catch(InputMismatchException im){
					System.out.println("Error al leer los datos.");
					menu=-1;
				}
				if(archivo.exists())
					System.out.println("El archivo ya existe.");
			}while((!archivo.exists() && menu<1) || (archivo.exists() && menu<2) || menu>6);
		switch(menu){
		case 1:
			crearFichero(entrada, archivo);
			break;
		case 2:
			AddRecursos(archivo, entrada);
			break;
		case 3:
			do{
				try{
					System.out.println("1. Consulta general.\n"
							+ "2. Buscar curso por nombre.\n"
							+ "3. Buscar por precio.\n"
							+ "Selecciona una opci�n: ");
					menu=entrada.nextInt();
				}catch(NumberFormatException nf){
					System.out.println("Los datos introducidos no eran de tipo n�merico.");
					menu=-1;
				}catch(InputMismatchException im){
					System.out.println("Error al leer los datos.");
					menu=-1;
				}
				if(archivo.exists())
					System.out.println("El archivo ya existe.");
			}while(menu<1 || menu>3);
			switch(menu){
			case 1:
				break;
			case 2:
				break;
			case 3:
			}
			break;
		case 4:
			BorrarRegistros();
			break;
		case 5:
			CompactarFichero();
			break;
		case 6:
			System.out.println("Gracias por utilizar este programa.");
		}
		}while(menu!=6);
		
		entrada.close();

	}

}
