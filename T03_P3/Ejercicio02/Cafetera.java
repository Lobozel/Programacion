package Ejercicio02;
/**
 * 
 * @author MiguelAngel
 *
 */
public class Cafetera { // se abre la clase
	
	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	
	private int _capacidadMaxima, capacidadActual;
	
	/********************************
	 * <h1>M�todos de la clase</h1> *
	 ********************************/
	
	/*
	 * Constructor predeterminado: establece la capacidad m�xima en 1000 (c.c.) y la
	 * actual en cero (cafetera vac�a)
	 */
	public Cafetera(){
		this._capacidadMaxima=1000;
		this.capacidadActual=0;
	}
	
	/*
	 * Constructor con la capacidad m�xima de la cafetera; inicializa la cantidad
	 * actual de caf� igual a la capacidad m�xima
	 */
	public Cafetera(int capMax){
		this._capacidadMaxima=capMax;
		this.capacidadActual=capMax;
	}
	
	/*
	 * Constructor con la capacidad m�xima y la cantidad actual. Si la cantidad actual
	 * es mayor que la capacidad m�xima de la cafetera, la ajustar� al m�ximo
	 */
	public Cafetera(int capMax, int cantActual){
		this._capacidadMaxima=capMax;
		if(cantActual<capMax)
			this.capacidadActual=cantActual;
		else
			this.capacidadActual=capMax;
	}
	
	//Accedentes y mutadores
	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}

	public void set_capacidadMaxima(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	//llenarCafetera(): Hace que la cantidad actual sea igual a la capacidad.
	public void llenarCafetera(){
		System.out.println("Se ha llenado la cafetera completamente.");
		this.capacidadActual=this._capacidadMaxima;
	}
	
	/*
	 * servirTaza(int): simula la acci�n de servir una taza con la capacidad indicada. Si
	 * la cantidad actual de caf� "no alcanza" para llenar la taza, se sirve lo que
	 * quede
	 */
	public void servirTaza(int servir){
		if(servir>this.capacidadActual){
			System.out.println("No hay suficiente en la cafetera, se servir� solo "+this.capacidadActual+"c.c.");
			this.capacidadActual=0;
		}else{
			System.out.println("Se ha servido correctamente "+servir+"c.c.");
			this.capacidadActual-=servir;
		}
	}
	
	//vaciarCafetera(): pone la cantidad de caf� actual en cero
	public void vaciarCafetera(){
		System.out.println("Se ha vaciado la cafetera completamente.");
		this.capacidadActual=0;
	}
	
	//agregarCafe(int):a�ade a la cafetera la cantidad de caf� indicada
	public void agregarCafe(int agregar){
		if(agregar>this._capacidadMaxima){
			System.out.println("No se puede agregar tanto caf�, se agregar� solo "+(agregar-this._capacidadMaxima)+"c.c., llenando la cafetera.");
			this.capacidadActual=this._capacidadMaxima;
		}else{
			System.out.println("Se ha agregado el caf� correctamente.");
			this.capacidadActual+=agregar;
		}
	}
} // se cierra la clase
