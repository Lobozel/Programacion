package array_unidimensionales;

public class numpares {
/*
 * Programa que crea un array de 20 elementos llamado Pares y guarde los 
 * 20 primeros números pares. Mostrar por pantalla el contenido del array creado.
 */
	public static void main(String[] args) {
		int[] pares=new int[20];
		int par=2;
		
		for(int i=0;i<pares.length;i++){
			pares[i]=par;
			par+=2;
		}
		System.out.println("---------------------------------------------------------");
		System.out.print("|");
		for (int e:pares)
			System.out.print(e+"|");
		System.out.print("\n---------------------------------------------------------");
	}

}
