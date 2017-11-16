package T03_P2;

import java.util.Scanner;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio04.java"></a>
 * @author MiguelÁngel
 *
 */

public class Ejercicio04 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Crear un programa que valore el salario neto semanal de los  
	 * trabajadores de una empresa de acuerdo a las siguientes normas:
	 * · Horas semanales trabajadas < 38 a una tasa.
	 * · Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
	 * · Impuestos de 0%, si el salario bruto es menor o igual a 750 euros;
	 * 10%, si el salario bruto es mayor que 750 euros.
	 */
public static void main(String[] args) { //Se abre el método main

	//Declaración de variables
	Scanner entrada = new Scanner(System.in);//Creo un objeto Scanner para leer.
	int horas;
	double salarioHora, sueldo;
	//**************************
	
	//Leer horas trabajadas y la tasa que le pagan por hora
	do{
		System.out.println("Introduce cuántas horas has trabajado.");
		horas=entrada.nextInt();
	}while(horas<0);
	do{
		System.out.println("Introduce cuanto cobras cada hora.");
		salarioHora=entrada.nextFloat();
	}while(salarioHora<0);
	//**************************
	
	//Calcular el sueldo total del empleado
	if (horas<38)
		sueldo=horas*salarioHora;
	else{
		sueldo=salarioHora*37+(horas-37)*(salarioHora+salarioHora*0.5);
	}
	//**************************
	
	//Calcular impuestos
	if (sueldo>750)
		sueldo-=sueldo*0.1;
	//**************************
	
	//Mostrar resultado
	System.out.println("El empleado cobrará "+sueldo);
	//**************************
	
	entrada.close(); //cierro el objeto Scanner.
	
} // Se cierra el método main

} // Se cierra la clase
