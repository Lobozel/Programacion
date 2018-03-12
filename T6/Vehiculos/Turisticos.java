package Vehiculos;

public class Turisticos extends Vehiculos{

	double precioKm;
	int kmAlquiler;
	int kmDevolucion;
	static int numTurismos;
	static int numTurAlquilados;
	
	public Turisticos() {
		numTurismos++;
	}
	
	@Override
	public void alquilar() {
		int kmAlquiler=0;
		do {
			try {
				System.out.println("Introduce los km que tiene el vehículo al alquilarlo.");
				kmAlquiler=entrada.nextInt();
			}catch(Exception e) {
				System.out.println("No has introducido un número válido.");
				kmAlquiler=-1;
			}
		}while(kmAlquiler<0);
		this.kmAlquiler=kmAlquiler;
		System.out.println("¡Enhorabuena! Has alquilado un coche turistico.");
		numTurAlquilados++;
	}

	@Override
	public void devolver() {
		int kmDevolucion=0;
		do {
			try {
				System.out.println("Introduce los km que tiene el vehículo al devolverlo.");
				kmDevolucion=entrada.nextInt();
			}catch(Exception e) {
				System.out.println("No has introducido un número válido.");
				kmDevolucion=-1;
			}
		}while(kmDevolucion<this.kmAlquiler);
		this.kmDevolucion=kmDevolucion;
		System.out.println("Has devuelto el vehículo con éxito.");
		numTurAlquilados--;
	}

	@Override
	public String showinfo() {
		return null;
	}
	
	public class Unitarios extends Turisticos{
		
	}
	
	public class Familiares extends Turisticos {
		
	}

	
}
