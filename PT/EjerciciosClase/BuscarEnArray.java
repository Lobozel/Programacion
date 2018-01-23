package EjerciciosClase;

public class BuscarEnArray {

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
}
	
