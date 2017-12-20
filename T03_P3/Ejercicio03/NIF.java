package Ejercicio03;
/**
 * 
 * @author MiguelAngel
 * 
 * Crea una NIF que se usará para mantener DNIs con su correspondiente letra.
 *
 */
public class NIF {
	/*
	 * Sus atributos son:
	 * El número de DNI (entero largo)
	 * La letra que le corresponde (carácter)
	 */
	private long numDNI;
	private char letraDNI;
	
	/********************************
	 * <h1>Métodos de la clase</h1> *
	 ***********************^********/
	
	/*
	 * Constructor por defecto, inicializa el número a 0 y la letra como
	 * espacio en blanco. Será un NIF no válido.
	 */
	public NIF(){
		numDNI=0;
		letraDNI=' ';
	}
	
	/*
	 * Constructor que reciba el número del DNI y le establezca la letra que
	 * le corresponde
	 */
	public NIF(int numDNI){
		if(numDNI>=10000000 && numDNI<=99999999){
			this.numDNI=numDNI;
			leer(numDNI);
		}
		
	}

	/*
	 * Accedentes y mutador para el número de DNI (que ajuste automáticamente
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
	 * leer(): que pida el número de DNI(ajustando automáticamente la letra)
	 * La letra se calculará con un método auxiliar (privado) de la siguiente forma:
	 * se obtiene el resto de la división entera del número de DNI entre 23 y se usa
	 * la siguiente tabla para obtener la letra que corresponde:
	 * 0 - T 1 - R 2 - W 3 - A 4 - G 5 - M 6 – Y 7 - F 8 - P 9 - D 10 - X 11 - B 12 - N
	 * 13 – J 14 - Z 15 - S 16 - Q 17 - V 18 - H 19 - L 20 – C 21 - K 22 – E*/
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
	 * Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en
	 * mayúscula; por ejemplo: 00395469-F)
	 */
	public String toString(){
		if (this.numDNI==0)
			System.out.println("El NIF no es válido.");
		return "El DNI es: "+numDNI+"-"+letraDNI;
	}
	
} // se cierra la clase NIF
