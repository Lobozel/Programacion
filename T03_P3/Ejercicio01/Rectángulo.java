package Ejercicio01;

/**
 * 
 * @author MiguelAngel
 *
 */
public class Rectángulo { //se abre la clase

	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	
	private Punto VerInfIzq, VerInfDer, VerSupIzq, VerSupDer;
	
	/********************************
	 * <h1>Métodos de la clase</h1> *
	 ********************************/
	
	//Constructor que cree un rectángulo partiendo de sus cuatro vértices
	public Rectángulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4){
		this.VerInfIzq=vertice1;
		this.VerInfDer=vertice2;
		this.VerSupIzq=vertice3;
		this.VerSupDer=vertice4;
	}
	
	/*
	 * Constructor que cree un rectángulo partiendo de la base y la altura
	 * de forma que su vértice inferior izquierdo esté en (0,0)
	 */
	public Rectángulo(int base, int altura){
		this.VerInfIzq = new Punto(); //por defecto es (0,0)
		this.VerInfDer = new Punto(base, 0);
		this.VerSupIzq = new Punto(0, altura);
		this.VerSupDer = new Punto(base, altura);
	}
	
	//Constructor por defecto
	public Rectángulo(){
		
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
	
	//método que desplace el rectángulo en el plano
		public void desplazar(Punto punto){
			/*
			 * Cree un nuevo método dentro de la clase Punto para no repetir tanto código
			 * el cuál llame trasladar (sinonimo de desplazar) para no confundir métodos.
			 */
			
			this.VerInfIzq.trasladar(punto);
			this.VerInfDer.trasladar(punto);
			this.VerSupIzq.trasladar(punto);
			this.VerSupDer.trasladar(punto);
		}
	
	//Área o superficie
	public double area(){
		return (this.VerInfIzq.getCoordenadaX()-this.VerInfDer.getCoordenadaX()) * (this.VerSupIzq.getCoordenadaY() - this.VerSupDer.getCoordenadaY()); 
	}
	
	//Perímetro
	public double perimetro(){
		return (this.VerInfIzq.distancia(this.VerInfDer) + this.VerInfIzq.distancia(this.VerSupDer))*2;
	}

	//Método toString para mostrar por pantalla los vertices de un rectángulo
	@Override
	public String toString() {
		return "Vertice inferior izquierdo = " + VerInfIzq + ", vertice inferior derecho = " + VerInfDer + ",\nvertide superior izquierdo = " + VerSupIzq
				+ ", vertice superior derecho = " + VerSupDer + ".";
	}
	
	
	
} // se cierra la clase
