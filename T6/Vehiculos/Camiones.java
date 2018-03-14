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
				System.out.println("Introduzca el precio por d�a de este veh�culo.");
				this.precioDia=leer.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("No has introducido un n�mero v�lido.");
				this.precioDia=-1;
			}
			
		}while(this.precioDia<0);
		numCamiones++;
		System.out.println("Ahora se dispone de un cami�n m�s, en total se dispone de "+numCamiones+".\n");
	}
	
	@Override
	public void alquilar(int dias) {
		this.diaAlquiler=dias;
		System.out.println("�Enhorabuena! Has alquilado un cami�n.\n");
		numCamAlquilados++;
		this.alquilado=true;
	}

	@Override
	public void devolver(int dias) throws IOException {
		this.diaDevolucion=dias;
		System.out.printf("%s%.2f%s\n","El alquiler suma un total de ",(double)(((this.diaDevolucion-this.diaAlquiler)/86400000)*this.precioDia),"� paga en caja.");
		System.out.println("Pulse intro para continuar...");
        dias=System.in.read();
		System.out.println("Has devuelto un cami�n con �xito.\n");
		numCamAlquilados--;
		this.alquilado=false;
	}

	@Override
	public String showinfo() {
		String alquilado="";
		if(this.alquilado)
			alquilado="est� alquilado en este momento.";
		else
			alquilado="no ha sido alquilado.";
		return String.format("%s%s%s%s%s%s%.2f%s%s%d%s%s%d%s", "Cami�n con la matr�cula: ",this.matricula,".\n"
				, "El veh�culo ",alquilado," y cuesta ",this.precioDia,"�/d�a.\n"
				, "Actualmente existen ",numCamiones," camiones "
						, "y, de ellos, ",numCamAlquilados," est�n alquilados ahora mismo.\n");
	}
	
	

}