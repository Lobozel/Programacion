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
				System.out.println("Introduzca el precio por km de este veh�culo.");
				this.precioKm=leer.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("No has introducido un n�mero v�lido.");
				this.precioKm=-1;
			}
			
		}while(this.precioKm<0);
		numTurismos++;
		System.out.println("Ahora se dispone de un veh�culo turistico m�s, en total se dispone de "+numTurismos+".\n\n");

	}
	
	@Override
	public void alquilar(int kmAlquiler) {
		
		this.kmAlquiler=kmAlquiler;
		System.out.println("�Enhorabuena! Has alquilado un coche turistico.\n");
		numTurAlquilados++;
		this.alquilado=true;
	}

	@Override
	public void devolver(int kmDevolver) throws IOException {
		this.kmDevolucion=kmDevolver;
		System.out.printf("%s%.2f%s\n","El alquiler suma un total de ",(double)((this.kmDevolucion-this.kmAlquiler)*this.precioKm),"� paga en caja.");
		System.out.println("Pulse intro para continuar...");
        kmDevolver=System.in.read();
		System.out.println("Has devuelto el veh�culo con �xito.\n");
		numTurAlquilados--;
		this.alquilado=false;
	}

	@Override
	public String showinfo() {
		String alquilado="";
		if(this.alquilado)
			alquilado="est� alquilado en este momento.";
		else
			alquilado="no ha sido alquilado.";
		return String.format("%s%s%s%s%s%s%.2f%s%s%d%s%s%d%s", "Veh�culo Turista con la matr�cula: ",this.matricula,".\n"
				, "El veh�culo ",alquilado," y cuesta ",this.precioKm,"�/km.\n"
				, "Actualmente existen ",numTurismos," veh�culos turisticos "
						, "y, de ellos, ",numTurAlquilados," est�n alquilados ahora mismo.\n");
	}
	
	public static class Unitarios extends Turisticos{

	}
	
	public static class Familiares extends Turisticos {

	}

	
}