package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ClaseArrayList {
/**
 * 
 * @param MiguelÁngel
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		Vector<Integer> coleccion = new Vector<Integer>(20);
		for(int i=0;i<20;i++)
			coleccion.addElement((i+1));
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>(coleccion);
		ArrayList<Integer> array3 = new ArrayList<Integer>(5);
		
		for(int i=0;i<10;i++)
			array1.add((i+1));
		
		System.out.println("El ArrayList1 ha sido llenado del 1 al 10");
		for(int element:array1)
			System.out.print(element+" ");
		System.out.println();
		do{
		System.out.println("¿Qué posición del ArrayList1 quieres borrar? (1-10)");
		num=entrada.nextInt()-1;
		}while(num<0 || num>9);
		array1.remove(num);
		System.out.println("Así quedaría:");
		for(int element:array1)
			System.out.print(element+" ");
		do{
			System.out.println("\nEn qué posición quieres introducir el valor 5?");
			num=entrada.nextInt()-1;
		}while(num<0 || num>9);
		array1.add(num, 5);
		System.out.println("Así quedaría:");
		for(int element:array1)
			System.out.print(element+" ");
		System.out.println();
		
		/*
		 * Se incrementa si es necesario la capacidad de array3 hasta tener 200
		 * Se le añaden dos colecciones, una al inicio y otra en la posición 6
		 * Se recorta para que su capacidad sea igual que su tamaño
		 */
		array3.ensureCapacity(200);
		array3.addAll(coleccion);
		while(num!=0){
			System.out.println("Introduce números para el tercer arraylist. 0 para parar");
			num=entrada.nextInt();
			array3.add(num);
		}
		array3.addAll(6, array1);
		array3.trimToSize();
		System.out.println("El tamaño del tercer ArrayList es "+array3.size());
		do{
			System.out.println("¿Qué posición del tercer ArrayList quieres ver?");
			num=entrada.nextInt()-1;
		}while(num<0 || num>array3.size());
		System.out.println(array3.get(num));
		
		
		System.out.println("¿Con qué valor quieres reemplazar el valor de la posición 8?");
		num=entrada.nextInt();
		array3.set(8, num);
		
		System.out.println("¿Qué número te gustaría comprobar si existe dentro del tercer ArayList?");
		num=entrada.nextInt();
		if(array3.contains(num)){
			System.out.println("Si lo contiene.");
			System.out.println("La primera vez que aparece es en la posición "+array3.indexOf(num));
			System.out.println("La última vez que aparece es en la posición "+array3.lastIndexOf(num));
			}
		else
			System.out.println("No lo contiene");
		
		System.out.println("El tercer ArrayList contiene los siguientes valores:");
		for(int i=0;i<array3.size();i++)
			System.out.print(array3.get(i)+" ");
		
		System.out.println("\nSi le quitamos la colección tendría los siguientes valores:");
		array3.removeAll(array1);
		while(array3.iterator().hasNext())
			System.out.print(array3.iterator().next()+" ");
		
		for(int i=1;i<=2;i++)
		if(array2.isEmpty())
			System.out.println("El segundo ArrayList está vacio");
		else{
			System.out.println("\nEl segundo ArrayList contiene los siguientes valores:");
			for(int elemento:array2)
				System.out.print(elemento+" ");
			System.out.println("\nEl segundo ArrayList se va a vaciar.");
			array2.clear();
		}
		
		entrada.close();
	}

}
