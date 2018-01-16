package EjerciciosClase;

public class BuscarEnArray {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int Lineal(int[] a, int b) {
		for(int i=0;i<a.length;i++)
			if(b==a[i])
				return (i+1);		
		return -1;
	}	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int LinealOrdenado(int[] a, int b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>b)
				return -1;
			if(b==a[i])
				return (i+1);
		}
		return -1;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int Binario(int[] a, int b) {
		int ultimo=a.length-1;
		int primero=0;
		int centro;
		while(primero<=ultimo) {
			centro=(primero+ultimo)/2;
			if(b==a[centro])
				return centro;
			else if(b<a[centro])
				ultimo=centro-1;
			else 
				primero=centro+1;
		}
		return -1;
	}
}
	
