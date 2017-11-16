package T02_P4;
import java.util.Scanner; //importo Scanner
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P4_E15 { //Se abre la clase

	public static void main(String[] args) { //Se abre el main
		
		/* Diseña un programa Java para leer las longitudes de los lados de un triangulo (L1,L2,L3)
		 * y calcular el área del mismo de acuerdo con la siguiente fórmula:
		 * sp=(L1+L2+L3)/2
		 * area=(sp(sp-L1)(sp-L2)(sp-L3))^(1/2)*/
		
		//Declaracion de variables
		Scanner entrada = new Scanner(System.in); //Creo un objeto para leer
		double L1,L2,L3,sp,area;
		//------------------------
		
		//Lectura de las variables
		System.out.println("Introduzca la longitud de un lado del triángulo.");
		L1=entrada.nextDouble();
		System.out.println("Introduzca la longitud de otro lado del triángulo.");
		L2=entrada.nextDouble();
		System.out.println("Introduzca la longitud del último lado del triángulo.");
		L3=entrada.nextDouble();
		
		//Resolver formulas dadas en el enunciado del ejercicio
		sp=(L1+L2+L3)/2;
		area=Math.pow(sp*(sp-L1)*(sp-L2)*(sp-L3), 1/2);
		
		//Mostrar resultados de las formulas
		System.out.println("El valor de la superficie es "+sp);
		System.out.println("El valor del área es "+area);
		
		
		entrada.close(); //Se cierra el objeto Scanner
		
	} //Se cierra el main

} //Se cierra la clase