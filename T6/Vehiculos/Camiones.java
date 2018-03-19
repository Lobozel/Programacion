package Vehiculos;

import java.io.IOException;
import java.util.InputMismatchException;

public class Camiones extends Vehiculos{

	double precioDia;
	int diaAlquiler;
	int diaDevolucion;
	static int numCamiones;
	static int numCamAlquilados;
	
	public Camiones() {
		do{
			try{
				System.out.println("Introduzca el precio por día de este vehículo.");
				this.precioDia=leer.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("No has introducido un número válido.");
				this.precioDia=-1;
			}
			
		}while(this.precioDia<0);
		numCamiones++;
		System.out.println("Ahora se dispone de un camión más, en total se dispone de "+numCamiones+".\n");
	}
	
	@Override
	public void alquilar(int dias) {
		this.diaAlquiler=dias;
		System.out.println("¡Enhorabuena! Has alquilado un camión.\n");
		numCamAlquilados++;
		this.alquilado=true;
	}

	@Override
	public void devolver(int dias) throws IOException {
		this.diaDevolucion=dias;
		System.out.printf("%s%.2f%s\n","El alquiler suma un total de ",(double)(((this.diaDevolucion-this.diaAlquiler)/86400000)*this.precioDia),"€ paga en caja.");
		System.out.println("Pulse intro para continuar...");
        dias=System.in.read();
		System.out.println("Has devuelto un camión con éxito.\n");
		numCamAlquilados--;
		this.alquilado=false;
	}

	@Override
	public String showinfo() {
		String alquilado="";
		if(this.alquilado)
			alquilado="está alquilado en este momento.";
		else
			alquilado="no ha sido alquilado.";
		return String.format("%s%s%s%s%s%s%.2f%s%s%d%s%s%d%s", "Camión con la matrícula: ",this.matricula,".\n"
				, "El vehículo ",alquilado," y cuesta ",this.precioDia,"€/día.\n"
				, "Actualmente existen ",numCamiones," camiones "
						, "y, de ellos, ",numCamAlquilados," están alquilados ahora mismo.\n");
	}
	
	

}