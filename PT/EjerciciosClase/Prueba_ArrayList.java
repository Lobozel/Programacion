package EjerciciosClase;

import java.util.ArrayList;

public class Prueba_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>(5);
		al.add(0,3);
		al.add(4);
		al.addAll(al);
		System.out.println("Array:");
		for(int elemento:al)
			System.out.print(elemento+" ");
		al.clear();
		System.out.println("\nArray borrado:");
		for(int elemento:al)
			System.out.print(elemento+" ");
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		System.out.println("\nArray lleno:");
		for(int elemento:al)
			System.out.print(elemento+" ");
		al.ensureCapacity(7);
		System.out.println("\nElemento en la posición2");
		System.out.println(al.get(2));
		System.out.println("Posición en la que aparece el primer 4");
		System.out.println(al.indexOf(4));
		if(al.isEmpty())
			System.out.println("Esta vacio");
		else
			System.out.println("No esta vacio");
		System.out.println("Posición en la que aparece el último 4");
		System.out.println(al.lastIndexOf(4));
		al.remove(3);
		al.set(2, 5);
		System.out.println("tamaño del array "+al.size());
		al.trimToSize();
		System.out.println(al.toArray());
		
		System.out.println("Visualizar con for:");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		
		System.out.println("\nVisualizar con for each:");
		for(int elemento:al)
			System.out.print(elemento+" ");
		
		System.out.println("\nVisualizar con iterator:");
		while(al.iterator().hasNext())
			System.out.print(al.iterator().next()+" ");

		
	}

}
