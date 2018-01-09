package EjerciciosClase;

import java.util.Scanner;

public class arraydeempleados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double suma=0;
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		//Declaración del array
		empleado[] empleados = new empleado[10];
		
		//Declaro los objetos
		for(int i=0;i<empleados.length;i++)
			empleados[i]=new empleado();
		
		//Introducir valores en el array
		for (int i=0;i<empleados.length;i++) {
			System.out.println("Introduce el nombre.");
			empleados[i].setNombre(entrada.next());
			System.out.println("Introduce el apellido.");
			empleados[i].setApellido(entrada.next());
			System.out.println("Introduce la edad.");
			empleados[i].setEdad((int)(Math.random()*(65-18)+18));
			System.out.println("Introduce el sueldo.");
			empleados[i].setSueldo(Math.random()*(2000-1000)+1000);
		}
		
		//Leer array
		for(int i=0;i<empleados.length;i++)
			System.out.println(empleados[i].toString());
		
		//sumar sueldos
		for(int i=0;i<empleados.length;i++)
			suma+=empleados[i].getSueldo();
		System.out.println("La suma de los sueldos es: "+suma);
		
		System.out.println("La media del sueldo en la empresa es "+suma/empleados.length);
		
		for(int i=0; i<empleados.length;i++) {
			if(empleados[i].getSueldo()>max)
				max=empleados[i].getSueldo();
			if(empleados[i].getSueldo()<min)
				min=empleados[i].getSueldo();
		}
		
		System.out.println("\nEmpleados que más cobran:");
		for(int i=0; i<empleados.length;i++) 
			if(empleados[i].getSueldo()==max)
				System.out.println(empleados[i].getNombre()+" "+empleados[i].getApellido());
		
		
		System.out.println("\nEmpleados que menos cobran:");
		for(int i=0; i<empleados.length;i++) 
			if(empleados[i].getSueldo()==min)
				System.out.println(empleados[i].getNombre()+" "+empleados[i].getApellido());
		
		
		entrada.close();
	}

}
