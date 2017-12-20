package Ejercicio01;
/**
 * 
 * @author MiguelAngel
 *
 **************************************************************
 * ESTA CLASE ÉXISTE SOLO PARA AUXILIAR A LA CLASE RECTÁNGULO *
 * ************************************************************
 */
public class Punto { // se abre la clase
	
	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	
private int coordenadaX, coordenadaY;

	/********************************
	 * <h1>Métodos de la clase</h1> *
	 ********************************/

//Constructor por defecto
public Punto() {
}

//Constructor de clase
public Punto(int coordenadaX, int coordenadaY) {
	this.coordenadaX = coordenadaX;
	this.coordenadaY = coordenadaY;
}

//Constructor de copia
public Punto(Punto p) {
	this.coordenadaX = p.coordenadaX;
	this.coordenadaY = p.coordenadaY;
}

//Accedentes y mutadores
public int getCoordenadaX() {
	return coordenadaX;
}

public void setCoordenadaX(int coordenadaX) {
	this.coordenadaX = coordenadaX;
}

public int getCoordenadaY() {
	return coordenadaY;
}

public void setCoordenadaY(int coordenadaY) {
	this.coordenadaY = coordenadaY;
}

@Override
public String toString() {
	return "[X=" + coordenadaX + ", Y=" + coordenadaY + "]";
}

//Método que calcula la distancia entre un punto y otro. Raiz:(x-x1)²+(y-y1)²
public double distancia(Punto p) {
	return Math.sqrt(Math.pow(this.coordenadaX-p.coordenadaX, 2)+Math.pow(this.coordenadaY, p.coordenadaY));
}

//Método que calcula el punto medio de un punto y otro. x=(x+x1)/2 ; y=(y+y1)/2
public Punto puntoMedio(Punto p) {
	Punto punto = new Punto();
	punto.setCoordenadaX((this.coordenadaX+p.coordenadaX)/2);
	punto.setCoordenadaY((this.coordenadaY+p.coordenadaY)/2);
	return punto;
}

//Método que calcula el cuadrante en el que se encuentra un punto.
public void cuadrante() {
	if (this.coordenadaX==0 && this.coordenadaY==0)
		System.out.println("No se encuentra en ningún cuadrante (0,0)");
	else if(this.coordenadaX==0 && this.coordenadaY!=0)
		System.out.println("Se encuentra en el eje Y.");
	else if(this.coordenadaX!=0 && this.coordenadaY==0)
		System.out.println("Se encuentra en el eje X");
	else if(this.coordenadaX>0 && this.coordenadaY>0)
		System.out.println("Se encuentra en el cuadrante 1.");
	else if (this.coordenadaX>0 && this.coordenadaY<0)
		System.out.println("Se encuentra en el cuadrante 4.");
	else if (this.coordenadaX<0 && this.coordenadaY>0)
		System.out.println("Se encuentra en el cuadrante 2.");
	else
		System.out.println("Se encuentra en el cuadrante 3.");
}

/*
 */
public void trasladar(Punto punto){
	this.setCoordenadaX(this.getCoordenadaX()+punto.getCoordenadaX());
	this.setCoordenadaY(this.getCoordenadaY()+punto.getCoordenadaY());
}

} // se cierra la clase