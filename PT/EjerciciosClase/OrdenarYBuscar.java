package EjerciciosClase;
/**
 * 
 * @author Miguel¡ngel
 *
 */
public class OrdenarYBuscar {

	/**************************************
	 **********<h1>ORDENACI”N</h1>*********
	 **************************************/
	
	/*******************
	 **<h2>CADENAS</h2>*
	 *******************/
	
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
	
	/*******************
	 **<h2>ENTEROS</h2>*
	 *******************/
	
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
	
	/**************************************
	 **********<h1>BUSQUEDAD</h1>**********
	 **************************************/
	
	/*******************
	 **<h2>CADENAS</h2>*
	 *******************/
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int LinealString(String[] a, String b) {
		for(int i=0;i<a.length;i++)
			if(b.equals(a[i]))
				return (i+1);		
		return -1;
	}	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int LinealOrdenadoString(String[] a, String b) {
		for(int i=0;i<a.length;i++) {
			if(a[i].compareTo(b)>0)
				return -1;
			if(b.equals(a[i]))
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
	public static int BinarioString(String[] a, String b) {
		int ultimo=a.length-1;
		int primero=0;
		int centro;
		while(primero<=ultimo) {
			centro=(primero+ultimo)/2;
			if(b.equals(a[centro]))
				return (centro+1);
			else if(b.compareTo(a[centro])<0)
				ultimo=centro-1;
			else 
				primero=centro+1;
		}
		return -1;
	}
	
	/*******************
	 **<h2>ENTEROS</h2>*
	 *******************/
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int LinealInt(int[] a, int b) {
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
	public static int LinealOrdenadoInt(int[] a, int b) {
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
	public static int BinarioInt(int[] a, int b) {
		int ultimo=a.length-1;
		int primero=0;
		int centro;
		while(primero<=ultimo) {
			centro=(primero+ultimo)/2;
			if(b==a[centro])
				return (centro+1);
			else if(b<a[centro])
				ultimo=centro-1;
			else 
				primero=centro+1;
		}
		return -1;
	}
	
}
