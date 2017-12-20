package Ejercicio01;

/**
 * 
 * @author MiguelAngel
 *
 */
public class Rect�ngulo { //se abre la clase

	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	
	private Punto VerInfIzq, VerInfDer, VerSupIzq, VerSupDer;
	
	/********************************
	 * <h1>M�todos de la clase</h1> *
	 ********************************/
	
	//Constructor que cree un rect�ngulo partiendo de sus cuatro v�rtices
	public Rect�ngulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4){
		this.VerInfIzq=vertice1;
		this.VerInfDer=vertice2;
		this.VerSupIzq=vertice3;
		this.VerSupDer=vertice4;
	}
	
	/*
	 * Constructor que cree un rect�ngulo partiendo de la base y la altura
	 * de forma que su v�rtice inferior izquierdo est� en (0,0)
	 */
	public Rect�ngulo(int base, int altura){
		this.VerInfIzq = new Punto(); //por defecto es (0,0)
		this.VerInfDer = new Punto(base, 0);
		this.VerSupIzq = new Punto(0, altura);
		this.VerSupDer = new Punto(base, altura);
	}
	
	//Constructor por defecto
	public Rect�ngulo(){
		
	}
	
	//Accedentes y mutadores
	public Punto getVerInfIzq() {
		return VerInfIzq;
	}

	public void setVerInfIzq(Punto verInfIzq) {
		VerInfIzq = verInfIzq;
	}

	public Punto getVerInfDer() {
		return VerInfDer;
	}

	public void setVerInfDer(Punto verInfDer) {
		VerInfDer = verInfDer;
	}

	public Punto getVerSupIzq() {
		return VerSupIzq;
	}

	public void setVerSupIzq(Punto verSupIzq) {
		VerSupIzq = verSupIzq;
	}

	public Punto getVerSupDer() {
		return VerSupDer;
	}

	public void setVerSupDer(Punto verSupDer) {
		VerSupDer = verSupDer;
	}
	
	//m�todo que desplace el rect�ngulo en el plano
		public void desplazar(Punto punto){
			/*
			 * Cree un nuevo m�todo dentro de la clase Punto para no repetir tanto c�digo
			 * el cu�l llame trasladar (sinonimo de desplazar) para no confundir m�todos.
			 */
			
			this.VerInfIzq.trasladar(punto);
			this.VerInfDer.trasladar(punto);
			this.VerSupIzq.trasladar(punto);
			this.VerSupDer.trasladar(punto);
		}
	
	//�rea o superficie
	public double area(){
		return (this.VerInfIzq.getCoordenadaX()-this.VerInfDer.getCoordenadaX()) * (this.VerSupIzq.getCoordenadaY() - this.VerSupDer.getCoordenadaY()); 
	}
	
	//Per�metro
	public double perimetro(){
		return (this.VerInfIzq.distancia(this.VerInfDer) + this.VerInfIzq.distancia(this.VerSupDer))*2;
	}

	//M�todo toString para mostrar por pantalla los vertices de un rect�ngulo
	@Override
	public String toString() {
		return "Vertice inferior izquierdo = " + VerInfIzq + ", vertice inferior derecho = " + VerInfDer + ",\nvertide superior izquierdo = " + VerSupIzq
				+ ", vertice superior derecho = " + VerSupDer + ".";
	}
	
	
	
} // se cierra la clase
