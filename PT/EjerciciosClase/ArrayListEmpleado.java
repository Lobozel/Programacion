package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;
//Dada una empresa (a/b) todos los datos de los empleados de la empresa
//Datos de la/el más mayor y el/la más joven (si hay varios, todos)
//Dada una empresa (A/b) crear un array con los empleados de dicha empresa
public class ArrayListEmpleado {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> empleados = new ArrayList<ArrayList<String>>();
		int salir=1;
		Scanner entrada = new Scanner(System.in);
		while(salir==1) {
			empleados.add(new ArrayList<String>());
			System.out.println("Se ha añadido un empleado.\n");
			do {
				System.out.println("¿Añadir otro empleado?\n0.-No\n1.-Sí");
				salir=entrada.nextInt();
			}while(salir<0 || salir>1);
		}
		for(int i=0;i<empleados.size();i++) {
			System.out.println("Introduce un DNI.");
			empleados.get(i).add(entrada.next());
			empleados.get(i).set(0, "DNI: "+empleados.get(i).get(0));
			System.out.println("Introduce un nombre");
			empleados.get(i).add(entrada.next());
			empleados.get(i).set(1, "Nombre: "+empleados.get(i).get(1));
			System.out.println("Introduce apellidos");
			empleados.get(i).add(entrada.next());
			empleados.get(i).set(2, "Apellidos: "+empleados.get(i).get(2));
			System.out.println("Introduce la edad");
			empleados.get(i).add(entrada.next());
			empleados.get(i).set(3, "Edad: "+empleados.get(i).get(3));
			System.out.println("Introduce la empresa (A o B)");
			empleados.get(i).add(entrada.next());
			empleados.get(i).set(4, "Empresa: "+empleados.get(i).get(4));
		}
		
		for(int i=0;i<empleados.size();i++) {
			for(int j=0;j<empleados.get(i).size();j++)
				System.out.println(empleados.get(i).get(j));
		System.out.println();	
		}
		
		entrada.close();
	}

}
