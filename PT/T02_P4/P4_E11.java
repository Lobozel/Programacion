package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E11 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa que lea un n�mero entero N de 5 cifras y muestre sus cifras desde el final.
		 * Lee 12345 y escribe 5 4 3 2 1*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		int num;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un n�mero de 5 cifras");
		num=entrada.nextInt();
		
		//Separaci�n de las cifras del n�mero
		if (num>=10000 && num<=99999){
			System.out.print(num-num/10*10+" ");
			num=num/10;
			System.out.print(num-num/10*10+" ");
			num=num/10;
			System.out.print(num-num/10*10+" ");
			num=num/10;
			System.out.print(num-num/10*10+" ");
			num=num/10;
			System.out.print(num-num/10*10);
		}
		else
			System.out.println("N�mero no v�lido.");
		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase