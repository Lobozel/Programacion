package EjerciciosClase;

public class OrdenarArray {
	
	/**
	 * 
	 * @param a
	 */
	public static void OrdenarPorSeleccion(int[] a) {
		int min,aux;
		for (int i=0;i<a.length-1;i++) {
			min=i;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
					min=j;
			}
			if(i!=min) {
				aux=a[i];
				a[i]=a[min];
				a[min]=aux;
			}
		}
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void OrdenarPorIntercambio(int[] a) {
		int aux;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					aux=a[j];
					a[j]=a[i];
					a[i]=aux;
				}
			}
		}
	}
	
}
