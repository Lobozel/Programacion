package EjerciciosClase;

public class OrdenarArray {
	
	/**
	 * 
	 * @param a
	 */
	public static void SeleccionInt(int[] a) {
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
	public static void SeleccionString(String[] a) {
		int min;
		String aux;
		for (int i=0;i<a.length-1;i++) {
			min=i;
			for (int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0)
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
	public static void IntercambioInt(int[] a) {
		int aux;
		for(int i=0;i<a.length-1;i++) 
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					aux=a[j];
					a[j]=a[i];
					a[i]=aux;
				}
			}
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void IntercambioString(String[] a) {
		String aux;
		for(int i=0;i<a.length-1;i++) 
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[i])<0) {
					aux=a[j];
					a[j]=a[i];
					a[i]=aux;
				}
			}
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void BurbujaInt(int[] a) {
		int aux;
		for (int i=a.length;i>0;i--) 
			for(int j=0;j<i-1;j++) {
				if(a[j+1]<a[j]) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
				}
			}
		
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void BurbujaString(String[] a) {
		String aux;
		for (int i=a.length;i>0;i--) 
			for(int j=0;j<i-1;j++) {
				if(a[j+1].compareTo(a[j])<0) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
				}
			}
		
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void BurbujaMejoradoInt(int[] a) {
		int aux;
		boolean fin=true;
		for (int i=a.length;i>0 && fin;i--) {
			fin=false;
			for(int j=0;j<i-1;j++) {
				if(a[j+1]<a[j]) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
					fin=true;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void BurbujaMejoradoString(String[] a) {
		String aux;
		boolean fin=true;
		for (int i=a.length;i>0 && fin;i--) {
			fin=false;
			for(int j=0;j<i-1;j++) {
				if(a[j+1].compareTo(a[j])<0) {
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
					fin=true;
				}
			}
		}
	}
}
