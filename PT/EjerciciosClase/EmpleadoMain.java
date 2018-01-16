package EjerciciosClase;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class EmpleadoMain {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(5,5);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los 5 elementos del vector.");
		for(int i=0;i<5;i++)
			v.addElement(entrada.nextInt());
		
		for(Integer elemento:v)
			System.out.println(elemento);
		
		System.out.println("\n");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\n");
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		entrada.close();
	}

}
