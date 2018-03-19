package Vehiculos;

import java.io.IOException;
import java.util.Scanner;

public abstract class Vehiculos {
	
	public static Scanner leer = new Scanner(System.in);
	
	String matricula;
	boolean alquilado;
	
	public Vehiculos() {
		System.out.println("Introduce la mátricula del nuevo vehículo.");
		this.matricula=leer.next();
	}
	
	public abstract void alquilar(int valor);
	
	public abstract void devolver(int valor) throws IOException;
	
	public abstract String showinfo();
	
	
}