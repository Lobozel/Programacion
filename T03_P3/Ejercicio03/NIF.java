package Ejercicio03;
/**
 * 
 * @author MiguelAngel
 * 
 * Crea una NIF que se usar� para mantener DNIs con su correspondiente letra.
 *
 */
public class NIF {
	/*
	 * Sus atributos son:
	 * El n�mero de DNI (entero largo)
	 * La letra que le corresponde (car�cter)
	 */
	private long numDNI;
	private char letraDNI;
	
	/********************************
	 * <h1>M�todos de la clase</h1> *
	 ***********************^********/
	
	/*
	 * Constructor por defecto, inicializa el n�mero a 0 y la letra como
	 * espacio en blanco. Ser� un NIF no v�lido.
	 */
	public NIF(){
		numDNI=0;
		letraDNI=' ';
	}
	
	/*
	 * Constructor que reciba el n�mero del DNI y le establezca la letra que
	 * le corresponde
	 */
	public NIF(int numDNI){
		if(numDNI>=10000000 && numDNI<=99999999){
			this.numDNI=numDNI;
			leer(numDNI);
		}
		
	}

	/*
	 * Accedentes y mutador para el n�mero de DNI (que ajuste autom�ticamente
	 * la letra)
	 */
	public long getNumDNI() {
		return numDNI;
	}

	public void setNumDNI(int numDNI) {
		if(numDNI>=10000000 && numDNI<=99999999){
			this.numDNI=numDNI;
			leer(numDNI);
		}
	}
	
	/*
	 * leer(): que pida el n�mero de DNI(ajustando autom�ticamente la letra)
	 * La letra se calcular� con un m�todo auxiliar (privado) de la siguiente forma:
	 * se obtiene el resto de la divisi�n entera del n�mero de DNI entre 23 y se usa
	 * la siguiente tabla para obtener la letra que corresponde:
	 * 0 - T 1 - R 2 - W 3 - A 4 - G 5 - M 6 � Y 7 - F 8 - P 9 - D 10 - X 11 - B 12 - N
	 * 13 � J 14 - Z 15 - S 16 - Q 17 - V 18 - H 19 - L 20 � C 21 - K 22 � E*/
	private void leer(int numDNI) {
		switch (numDNI % 23) {
			case 0: this.letraDNI = 'T';
			break;
			case 1: this.letraDNI = 'R';
			break;
			case 2: this.letraDNI = 'W';
			break;
			case 3: this.letraDNI = 'A';
			break;
			case 4: this.letraDNI = 'G';
			break;
			case 5: this.letraDNI = 'M';
			break;
			case 6: this.letraDNI = 'Y';
			break;
			case 7: this.letraDNI = 'F';
			break;
			case 8: this.letraDNI = 'P';
			break;
			case 9: this.letraDNI = 'D';
			break;
			case 10: this.letraDNI = 'X';
			break;
			case 11: this.letraDNI = 'B';
			break;
			case 12: this.letraDNI = 'N';
			break;
			case 13: this.letraDNI = 'J';
			break;
			case 14: this.letraDNI = 'Z';
			break;
			case 15: this.letraDNI = 'S';
			break;
			case 16: this.letraDNI = 'Q';
			break;
			case 17: this.letraDNI = 'V';
			break;
			case 18: this.letraDNI = 'H';
			break;
			case 19: this.letraDNI = 'L';
			break;
			case 20: this.letraDNI = 'C';
			break;
			case 21: this.letraDNI = 'K';
			break;
			case 22: this.letraDNI = 'E';
		}
}

	/**
	 * M�todo que nos permita mostrar el NIF (ocho d�gitos, un gui�n y la letra en
	 * may�scula; por ejemplo: 00395469-F)
	 */
	public String toString(){
		if (this.numDNI==0)
			System.out.println("El NIF no es v�lido.");
		return "El DNI es: "+numDNI+"-"+letraDNI;
	}
	
} // se cierra la clase NIF
