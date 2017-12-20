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
	 * <h1>Métodos de la clase</h1> *
	 ********************************/
	
	/*
	 * Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
	 * actual en cero (cafetera vacía)
	 */
	public Cafetera(){
		this._capacidadMaxima=1000;
		this.capacidadActual=0;
	}
	
	/*
	 * Constructor con la capacidad máxima de la cafetera; inicializa la cantidad
	 * actual de café igual a la capacidad máxima
	 */
	public Cafetera(int capMax){
		this._capacidadMaxima=capMax;
		this.capacidadActual=capMax;
	}
	
	/*
	 * Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual
	 * es mayor que la capacidad máxima de la cafetera, la ajustará al máximo
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
	 * servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si
	 * la cantidad actual de café "no alcanza" para llenar la taza, se sirve lo que
	 * quede
	 */
	public void servirTaza(int servir){
		if(servir>this.capacidadActual){
			System.out.println("No hay suficiente en la cafetera, se servirá solo "+this.capacidadActual+"c.c.");
			this.capacidadActual=0;
		}else{
			System.out.println("Se ha servido correctamente "+servir+"c.c.");
			this.capacidadActual-=servir;
		}
	}
	
	//vaciarCafetera(): pone la cantidad de café actual en cero
	public void vaciarCafetera(){
		System.out.println("Se ha vaciado la cafetera completamente.");
		this.capacidadActual=0;
	}
	
	//agregarCafe(int):añade a la cafetera la cantidad de café indicada
	public void agregarCafe(int agregar){
		if(agregar>this._capacidadMaxima){
			System.out.println("No se puede agregar tanto café, se agregará solo "+(agregar-this._capacidadMaxima)+"c.c., llenando la cafetera.");
			this.capacidadActual=this._capacidadMaxima;
		}else{
			System.out.println("Se ha agregado el café correctamente.");
			this.capacidadActual+=agregar;
		}
	}
} // se cierra la clase
