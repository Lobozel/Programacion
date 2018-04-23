package Ejercicio3_11;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Miguel�ngel
 *
 */

public class MenuAlumnos {

/**
 * 
 * @statement Sobre el ejercicio anterior, una vez creado el fichero mostrar un men� que permita
 * lo siguiente:
 * a. Mostrar la media del curso.
 * b. El nombre del alumno/a o alumnos/as con mejor nota.
 * c. El nombre del alumno/a o alumnos/as con peor nota.
 * d. Salir del programa.
 * 
 */

	static double numAlum=0;
	static double suma=0;
	static double peorNota=Double.MAX_VALUE;
	static double mejorNota=Double.MIN_VALUE;
	
			public static void crearFichero(BufferedReader leer, String ruta){
				
				try{
					FileOutputStream nuevo = new FileOutputStream(ruta);
					do{
						leerAlumnos(leer, nuevo);
						System.out.println("Introduce la letra f si NO desea introducir otro alumno.\n"
								+ "Cualquier otro car�cter servir� para continuar introduciendo alumnos: ");
					}while(leer.readLine().toLowerCase().charAt(0)!='f');
					mostrarFichero(ruta);
				}catch(IOException io){
					System.out.println("Error en la entrada o salida de datos.");
				}
					
			}
			
			protected static void leerAlumnos(BufferedReader leer, FileOutputStream nuevo){
				DataOutputStream entrada = new DataOutputStream(nuevo);
				
				numAlum++;
				
				String nombre=null; String direccion=null; int edad=0; double notaMedia=0;
				
				try {
					System.out.println("Introduce el nombre del alumno: ");
					nombre=leer.readLine();
					System.out.println("Introduce la direcci�n del alumno: ");
					direccion=leer.readLine();
				} catch (IOException io) {
					System.out.println("Error al leer los datos introducidos.");
				}
				
				/**
				 * La persona m�s vieja conocida <<Jeanne Calment>> muri� con 122 a�os y 164 d�as.
				 * Por ello pongo el m�ximo de edad en 125.
				 * 
				 */
				do{
					try{
						System.out.println("Introduce la edad del alumno: ");
						edad = Integer.parseInt(leer.readLine());
					} catch (NumberFormatException nf) {
						System.out.println("No se han introducido datos de tipo n�merico.");
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
						System.out.println("No se han introducido datos de tipo n�merico.");
						notaMedia=-1;
					} catch (IOException io) {
						System.out.println("Error al leer los datos introducidos.");
						notaMedia=-1;
					}
				}while(notaMedia<0 || notaMedia>10);
				
				suma+=notaMedia;
				
				if(notaMedia>mejorNota)
					mejorNota=notaMedia;
				
				if(notaMedia<peorNota)
					peorNota=notaMedia;
				
				try {
					entrada.writeUTF(nombre);
					entrada.writeUTF(direccion);
					entrada.writeInt(edad);
					entrada.writeDouble(notaMedia);
				} catch (IOException io) {
					System.out.println("Error al escribir los datos en el archivo.");
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
					}catch(EOFException eof){
						System.out.println("\nFin de fichero.");
					}catch(IOException io){
						System.out.println("Error inesperado.");
					}
				} catch (FileNotFoundException e404) {
					System.out.println("Archivo no encontrado.");
				}
			}
			
			public static void mostrarMediaClase(){
				System.out.printf("%s%.2f\n","La media de la clase es: ",(suma/numAlum));
			}
			
			public static void mejorMedia(String ruta){
				String nombre="";
				double nota=0;
				
				System.out.println("\nEstos son los alumnos con mejor nota media: ");
				
				try {
					FileInputStream fichero=new FileInputStream(ruta);
					try(DataInputStream salida = new DataInputStream(fichero)){
						while(true){
							nombre=salida.readUTF();
							salida.readUTF();
							salida.readInt();
							nota=salida.readDouble();
							if(nota==mejorNota){
								System.out.println("Nombre: "+nombre);
								System.out.println("Nota: "+mejorNota);
							}
						}
					}catch(EOFException eof){
						System.out.println("");
					}catch(IOException io){
						System.out.println("Error inesperado.");
					}
				} catch (FileNotFoundException e404) {
					System.out.println("Archivo no encontrado.");
				}
				
			}
			
			public static void peorMedia(String ruta){
				String nombre="";
				double nota=0;
				
				System.out.println("\nEstos son los alumnos con peor nota media: ");
				
				try {
					FileInputStream fichero=new FileInputStream(ruta);
					try(DataInputStream salida = new DataInputStream(fichero)){
						while(true){
							nombre=salida.readUTF();
							salida.readUTF();
							salida.readInt();
							nota=salida.readDouble();
							if(nota==peorNota){
								System.out.println("Nombre: "+nombre);
								System.out.println("Nota: "+peorNota);
							}
						}
					}catch(EOFException eof){
						System.out.println("");
					}catch(IOException io){
						System.out.println("Error inesperado.");
					}
				} catch (FileNotFoundException e404) {
					System.out.println("Archivo no encontrado.");
				}
			
			}
			
			public static void main(String[] args) {
				BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
				String ruta="C:/Ficheros/Alumnos.txt";
				
				crearFichero(leer, ruta);
				
				int menu=0;
				
				do{
					do{
						try{
							System.out.println("\n1.- Mostrar la nota media de la clase.\n"
									+ "2.- Mostrar el nombre del alumno/a o alumnos/as con mejor nota media.\n"
									+ "3.- Mostrar el nombre del alumno/a o alumnos/as con peor nota media.\n"
									+ "4.- Salir del programa."
									+ "\nSelecciona una opci�n: ");
							menu=Integer.parseInt(leer.readLine());
						}catch(NumberFormatException nf){
							System.out.println("No has introducido informaci�n de tipo n�merico.");
						}catch(IOException io){
							System.out.println("La informaci�n introducida no es comprensible.");
						}
						switch (menu){
						case 1:
							mostrarMediaClase();
							break;
						case 2:
							mejorMedia(ruta);
							break;
						case 3:
							peorMedia(ruta);
							break;
						case 4:
							System.out.println("Gracias por usar este programa.");
						}
						
					}while(menu<1 || menu>4);
				}while(menu!=4);
				
			}

		}
