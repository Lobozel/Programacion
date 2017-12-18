package EjerciciosClase;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int a[][] = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11},
				{12,13,14,15},
				{16,17,18,19}
		};
		
		System.out.println("Leer por filas:");
		
		for(int filas=0;filas<a.length;filas++) {
			for(int colum=0;colum<a[filas].length;colum++)
				System.out.printf(String.format("%02d", a[filas][colum])+" ");
		System.out.println();
		}
		
		System.out.println("\nLeer por columnas:");
		
		for(int colum=0;colum<a.length-1;colum++) {
			for(int filas=0;filas<a[colum].length+1;filas++)
				System.out.printf(String.format("%02d", a[filas][colum])+" ");
		System.out.println();
		}

	}

}
