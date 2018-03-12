package Vehiculos;

import java.sql.Date;

public class Camiones extends Vehiculos{

	double precioDia;
	Date diaAlquiler;
	Date diaDevolucion;
	static int numCamiones;
	static int numCamAlquilados;
	
	public Camiones() {
		numCamiones++;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void alquilar() {
		Date diaAlquiler=null;
		do {
			try {
				System.out.println("Introduce la fecha en la que alquilaste el camión");
				System.out.println("Día-> ");
				diaAlquiler.setDate(entrada.nextInt());
				System.out.println("Mes-> ");
				diaAlquiler.setMonth(entrada.nextInt());
				System.out.println("Año-> ");
				diaAlquiler.setYear(entrada.nextInt());
			}catch(Exception e) {
				System.out.println("La fecha esta mal introducida");
				
			}
		}while(diaAlquiler.getYear()<1999);
		this.diaAlquiler=diaAlquiler;
		System.out.println("¡Enhorabuena! Has alquilado un camión.");
		numCamAlquilados++;
	}

	@SuppressWarnings({ "deprecation", "null" })
	@Override
	public void devolver() {
		Date diaDevolucion=null;
		do {
			System.out.println("Introduce la fecha en la que devolviste el camión");
			System.out.println("Día-> ");
			diaAlquiler.setDate(entrada.nextInt());
			System.out.println("Mes-> ");
			diaAlquiler.setMonth(entrada.nextInt());
			System.out.println("Año-> ");
			diaAlquiler.setYear(entrada.nextInt());
		}while(diaDevolucion.getDate()<this.diaAlquiler.getDate());
		this.diaDevolucion=diaDevolucion;
		System.out.println("Has devuelto un camión con éxito.");
		numCamAlquilados--;
	}

	@Override
	public String showinfo() {
		return null;
	}

}
