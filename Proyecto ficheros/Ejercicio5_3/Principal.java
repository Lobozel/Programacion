package Ejercicio5_3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Principal {
/**
 * 
 * @statement Crear un fichero Publicaciones.obj, que contenga datos del tipo revistas y libros
 * que derivan de la clase publicaciones:
 * El programa debe presentar un menú en la forma:
 * 1. Crear fichero (debe contener libros y revistas)
 * 2. Añadir publicaciones (del tipo libros y revistas)
 * 3. Mostrar datos.
 * 4. Salir del programa.
 * 
 * Se repetirá mientras no deseemos salir del programa. Una vez creado el fichero, no se podrá
 * acceder de nuevo a la opción 1.
 * 
 */
	
	public static void crearFichero(){
		Publicaciones[] p=new Publicaciones[6];
		
		try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Ficheros/Publicaciones.obj"))){
			p[0]=new Libros("Libro 1", "Editor", new GregorianCalendar(1997,5,11), "ISBN 978-3-16-148410-0", "Escritor");
			p[1]=new Libros("Libro 2", "Editor", new GregorianCalendar(2010,12,20), "ISBN 978-3-16-148410-1", "Escritor");
			p[2]=new Libros("Libro 3", "Editor", new GregorianCalendar(), "ISBN 978-3-16-148410-2", "Escritor");
			p[3]=new Revistas("Revista 1", "Editor", new GregorianCalendar(1985,3,16), 8, 5000);
			p[4]=new Revistas("Revista 2", "Editor", new GregorianCalendar(2008,8,3), 6, 3800);
			p[5]=new Revistas("Revista 3", "Editor", new GregorianCalendar(), 2, 2000);
			
			for(int i=0;i<p.length;i++){
				salida.writeObject(p[i]);
			}
		} catch (FileNotFoundException e404) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al leer los datos.");
		}
		
		System.out.println("Archivo creado con éxito. Compruebelo en {C:/Ficheros}.");
	}
	
	public static void addDatos(Scanner entrada){
		Libros l;
		Revistas r;
		String titulo="";
		String editor="";
		String fecha="";
		
		int menu=0;
		do{
			do{
				try{
					System.out.println("1. Añadir nueva revista.\n"
							+ "2. Añadir nuevo libro."
							+ "3. No añadir nada más.");
					menu=entrada.nextInt();	
				}catch(NumberFormatException nf){
					System.out.println("Los datos introducidos no eran de tipo númerico.");
					menu=-1;
				}catch(InputMismatchException im){
					System.out.println("Error al leer los datos.");
					menu=-1;
				}
			}while(menu<1 || menu>3);
			
			if(menu!=3){
			System.out.println("Introduce el título: ");
			titulo=entrada.next();
			System.out.println("Introduce el editor: ");
			editor=entrada.next();
			}
			
			do{
				System.out.println("Introduzca la fecha con el formato dd/mm/aaaa: ");
				fecha=entrada.next();
			}while(fecha.length()!=10 || fecha.charAt(2)!='/' || fecha.charAt(5)!='/' ||
					Integer.parseInt(fecha.substring(3, 5))<1 || Integer.parseInt(fecha.substring(3, 5))>12 
					|| Integer.parseInt(fecha.substring(0,2))<1 || Integer.parseInt(fecha.substring(0,2))>
					diasMes(Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(6, 10))));
			
			switch(menu){
			case 1:
				int numPorAño=0;
				long circulacion=0;
				do{
					try{
						System.out.println("Introduce el número de revistas por año: ");
						numPorAño=entrada.nextInt();
					}catch(NumberFormatException nf){
						System.out.println("Los datos introducidos no eran de tipo númerico.");
						numPorAño=-1;
					}catch(InputMismatchException im){
						System.out.println("Error al leer los datos.");
						numPorAño=-1;
					}
				}while(numPorAño<0);
				do{
					try{
						System.out.println("Introduce la circulación que tienen las revistas: ");
						circulacion=entrada.nextLong();
					}catch(NumberFormatException nf){
						System.out.println("Los datos introducidos no eran de tipo númerico.");
						circulacion=-1;
					}catch(InputMismatchException im){
						System.out.println("Error al leer los datos.");
						circulacion=-1;
					}
				}while(circulacion<0);
				
				try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Ficheros/Publicaciones.obj"))){
				r=new Revistas(titulo,editor,new GregorianCalendar(Integer.parseInt(fecha.substring(6, 10)), Integer.parseInt(fecha.substring(3, 5)), Integer.parseInt(fecha.substring(0,2))),numPorAño,circulacion);
				salida.writeObject(r);
				} catch (FileNotFoundException e404) {
					System.out.println("Archivo no encontrado.");
				} catch (IOException e) {
					System.out.println("Error al leer los datos.");
				}
				
				break;
			case 2:
				String ISBN;
				String autor;
				System.out.println("Introduce el ISBN del libro: ");
				ISBN=entrada.next();
				System.out.println("Introduce el nombre del autor del libro: ");
				autor=entrada.next();
				
				try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Ficheros/Publicaciones.obj"))){
					l=new Libros(titulo,editor,new GregorianCalendar(Integer.parseInt(fecha.substring(6, 10)), Integer.parseInt(fecha.substring(3, 5)), Integer.parseInt(fecha.substring(0,2))),ISBN,autor);
					salida.writeObject(l);
					} catch (FileNotFoundException e404) {
						System.out.println("Archivo no encontrado.");
					} catch (IOException e) {
						System.out.println("Error al leer los datos.");
					}
			}
		}while(menu!=3);
		
	}
	
	public static void leerDatos(){
		Publicaciones p;
		try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:/Ficheros/Publicaciones.obj"))){
			while (true) {
                p = (Publicaciones) entrada.readObject();
                System.out.println(p.toString());
            }
		}catch (EOFException fin){
            System.out.println("Fin del fichero");
		}catch (FileNotFoundException e404) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al leer los datos.");
		} catch (ClassNotFoundException e404) {
			System.out.println("Clase no encontrada");
		}
	}
	
	/**
	 * Comienzo del main
	 * @param args
	 */
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int menu=0;
		File archivo= new File("C:/Ficheros/Publicaciones.obj");
		
		System.out.println("¡Advertencia! Para este programa necesita tener el directorio Ficheros dentro de C:\n");
		
		do{
			do{
				try{
					System.out.println("\n1. Crear fichero en C:/Ficheros (Solo si no existe).\n"
							+ "2. Añadir publicaciones.\n"
							+ "3. Mostrar datos.\n"
							+ "4. Salir del programa.");
					menu=entrada.nextInt();
				}catch(NumberFormatException nf){
					System.out.println("Los datos introducidos no eran de tipo númerico.");
					menu=-1;
				}catch(InputMismatchException im){
					System.out.println("Error al leer los datos.");
					menu=-1;
				}
				if (archivo.exists() && menu==1)
					System.out.println("El archivo ya existe.");
			}while((archivo.exists() && menu<2 || menu>4) || (!archivo.exists() && menu<1 || menu>4));
			
			switch(menu){
			case 1:
				crearFichero();
				break;
			case 2:
				addDatos(entrada);
				break;
			case 3:
				leerDatos();
				break;
			case 4:
				System.out.println("Gracias por utilizar este programa.");
			}
		}while(menu!=4);
		
		
		entrada.close();
		
		
	}//fin del main

	/**
	 * 
	 *<h1>Métodos de ayuda para validar la fecha</h1>
	 *
	 */
	
	protected static boolean bisiesto(int año){
		boolean bisiesto=false;
		if(año%4==0 || año%400==0 && año%100!=0)
			bisiesto=true;
		return bisiesto;
	}
	
	protected static int diasMes(int mes, int año){
		int dias=0; //La inicializo para que no de error en el return.
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			dias=31;
			break;
		case 4: case 6: case 9: case 11:
			dias=30;
			break;
		case 2:
			if(bisiesto(año)) //Entrará cuando sea true el boolean del método
				dias=29;
			else
				dias=28;
		}
		return dias;
	}
	
}
