package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio09.java"></a>
 * @author Miguel�ngel
 *
 */

public class Ejercicio09 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Programa que lea un fecha de un a�o (1800 o posterior) y escriba si la
	 * fecha es correcta o no.
	 */
public static void main(String[] args) { //Se abre el m�todo main

	//Declaraci�n de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int dia, mes, a�o;
	boolean fecha=true;
	//**************************
	
	//Leer fecha
	System.out.println("Introduce el d�a.");
	dia=entrada.nextInt();
	System.out.println("Introduce el mes.");
	mes=entrada.nextInt();
	do{
	System.out.println("Introduce un a�o posterior a 1799");
	a�o=entrada.nextInt();
	}while(a�o<1799);
	//**************************
	
	//Comprobar si la fecha es correcta
	if(mes>=1 && mes<=12)
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (dia<1 || dia>31)
			fecha=false;
			break;
		case 4: case 6: case 9: case 11:
			if (dia<1 || dia>30)
				fecha=false;
			break;
		case 2:
			if (a�o%4==0 || a�o%400==0 && a�o%100!=0){
				if(dia<1 || dia>29)
					fecha=false;
			}
			else
				if (dia<1 || dia>28)
					fecha = false;
		}
	else
		fecha=false;
	//**************************
	
	//Mostrar si la fecha es correcta o no
	if(fecha)
		System.out.println("La fecha "+dia+"/"+mes+"/"+a�o+" es una fecha v�lida.");
	else
		System.out.println("La fecha introducida es inv�lida.");
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el m�todo main

} // Se cierra la clase
