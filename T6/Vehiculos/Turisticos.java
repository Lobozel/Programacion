package Vehiculos;

import java.io.IOException;
import java.util.InputMismatchException;

public class Turisticos extends Vehiculos{

	double precioKm;
	int kmAlquiler;
	int kmDevolucion;
	static int numTurismos;
	static int numTurAlquilados;
	
	public Turisticos() {
		do{
			try{
				System.out.println("Introduzca el precio por km de este vehículo.");
				this.precioKm=leer.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("No has introducido un número válido.");
				this.precioKm=-1;
			}
			
		}while(this.precioKm<0);
		numTurismos++;
		System.out.println("Ahora se dispone de un vehículo turistico más, en total se dispone de "+numTurismos+".\n\n");

	}
	
	@Override
	public void alquilar(int kmAlquiler) {
		
		this.kmAlquiler=kmAlquiler;
		System.out.println("¡Enhorabuena! Has alquilado un coche turistico.\n");
		numTurAlquilados++;
		this.alquilado=true;
	}

	@Override
	public void devolver(int kmDevolver) throws IOException {
		this.kmDevolucion=kmDevolver;
		System.out.printf("%s%.2f%s\n","El alquiler suma un total de ",(double)((this.kmDevolucion-this.kmAlquiler)*this.precioKm),"€ paga en caja.");
		System.out.println("Pulse intro para continuar...");
        kmDevolver=System.in.read();
		System.out.println("Has devuelto el vehículo con éxito.\n");
		numTurAlquilados--;
		this.alquilado=false;
	}

	@Override
	public String showinfo() {
		String alquilado="";
		if(this.alquilado)
			alquilado="está alquilado en este momento.";
		else
			alquilado="no ha sido alquilado.";
		return String.format("%s%s%s%s%s%s%.2f%s%s%d%s%s%d%s", "Vehículo Turista con la matrícula: ",this.matricula,".\n"
				, "El vehículo ",alquilado," y cuesta ",this.precioKm,"€/km.\n"
				, "Actualmente existen ",numTurismos," vehículos turisticos "
						, "y, de ellos, ",numTurAlquilados," están alquilados ahora mismo.\n");
	}
	
	public static class Unitarios extends Turisticos{

	}
	
	public static class Familiares extends Turisticos {

	}

	
}