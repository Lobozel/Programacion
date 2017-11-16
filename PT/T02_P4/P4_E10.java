package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author Miguel�ngel
 *
 */
public class P4_E10 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Programa que lee un n�mero de 3 cifras y muestra sus cifras por separado.
		 * Lee 315 y muestra 3 1 5*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		int num;
		//------------------------
		
		//Lectura de la variable
		System.out.println("Introduzca un n�mero de 3 cifras");
		num=entrada.nextInt();
		
		//Separaci�n de las cifras del n�mero
		if (num>=100 && num<=999){
			System.out.print(num/100+" ");
			num=num-num/100*100;
			System.out.print(num/10+" ");
			num=num-num/10*10;
			System.out.println(num);
		}
		else
			System.out.println("N�mero no v�lido.");
		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase