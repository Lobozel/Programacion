package Vehiculos;

import java.util.Scanner;

public abstract class Vehiculos {

	public static Scanner entrada = new Scanner(System.in);
	
	String matricula;
	boolean alquilado;
	
	public Vehiculos() {
		
	}
	
	public abstract void alquilar();
	
	public abstract void devolver();
	
	public abstract String showinfo();
	
	
}
