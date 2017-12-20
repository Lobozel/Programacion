package Ejercicio05;

import java.util.Scanner;

/**
 * 
 * @author MiguelAngel
 *
 */
public class Vector3D { // se abre la clase
	
	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	
private int coordenadaX, coordenadaY, coordenadaZ;

	/********************************
	 * <h1>Métodos de la clase</h1> *
	 ********************************/
	 
public Vector3D() {
}

//Constructor de clase
public Vector3D(int coordenadaX, int coordenadaY, int coordenadaZ) {
	this.coordenadaX = coordenadaX;
	this.coordenadaY = coordenadaY;
	this.coordenadaZ = coordenadaZ;
}

//Constructor de copia
public Vector3D(Vector3D vector) {
	this.coordenadaX = vector.coordenadaX;
	this.coordenadaY = vector.coordenadaY;
	this.coordenadaZ = vector.coordenadaZ;
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

public int getCoordenadaZ() {
	return coordenadaZ;
}

public void setCoordenadaZ(int coordenadaZ) {
	this.coordenadaZ = coordenadaZ;
}

//Método equal para saber si dos vectores tienen sus componentes iguales.
public boolean equal(Vector3D vector){
	boolean igual=true;
	if(this.getCoordenadaX()!=vector.getCoordenadaX() ||
			this.getCoordenadaY()!=vector.getCoordenadaY() ||
			this.getCoordenadaZ()!=vector.getCoordenadaZ())
		igual=false;
	return igual;
}

/*
 * Método trasladar (sobrecargado) que permita obtener un nuevo punto
 * transladando la coordenada o coordenadas adecuadas de acuerdo a la distancia
 * o distancias especificas
 * 	·si solo se proporciona un valor se cambiará el valor de la coordenada x
 *  ·si se proporcionan dos valores cambiaremos las coordenadas x e y
 *  ·si se proporcionan los 3 valores, cambiaremos los valores de todas las coordenadas
 */
public Vector3D trasladar(){
	Vector3D vector3d = new Vector3D();
	Scanner entrada = new Scanner(System.in);
	int num;
	do{
		System.out.println("De entre las 3 coordenadas, cuantas vás a trasladar (mínimo 1)");
		num=entrada.nextInt();
	}while(num<1 || num>3);
	switch(num){
	case 3:
		System.out.println("¿En cuanto quieres desplazar la coordenada Z?");
		vector3d.setCoordenadaZ(this.getCoordenadaZ()+entrada.nextInt());
	case 2:
		System.out.println("¿En cuanto quieres desplazar la coordenada Y?");
		vector3d.setCoordenadaY(this.getCoordenadaY()+entrada.nextInt());
	case 1:
		System.out.println("¿En cuanto quieres desplazar la coordenada X?");
		vector3d.setCoordenadaX(this.getCoordenadaX()+entrada.nextInt());
	}
	entrada.close();
	return vector3d;
}

//Creo un tostring para mostrar las coordenadas por pantalla
@Override
public String toString() {
	return "[X = " + coordenadaX + ", Y = " + coordenadaY + ", Z = " + coordenadaZ+"]";
}

} // se cierra la clase
