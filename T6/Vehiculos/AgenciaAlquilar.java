package Vehiculos;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;

public class AgenciaAlquilar {

	protected static boolean bisiesto(int año){
		boolean bisiesto=false;
		if(año%4==0 || año%400==0 && año%100!=0)
			bisiesto=true;
		return bisiesto;
	}
	
	public static int diasMes(int mes, int año){
		int dias=0; 
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			dias=31;
			break;
		case 4: case 6: case 9: case 11:
			dias=30;
			break;
		case 2:
			if(bisiesto(año)) 
				dias=29;
			else
				dias=28;
		}
		return dias;
	}

	protected static Calendar leerFecha() {
		String fecha="";
		Calendar f = Calendar.getInstance();
		do {
			System.out.println("Introduce la fecha con el formato dd/mm/aaaa");
			fecha=Vehiculos.leer.nextLine();
			}while(fecha.length()!=10 || fecha.charAt(2)!='/' || fecha.charAt(5)!='/' ||
			Integer.parseInt(fecha.substring(3, 5))<1 || Integer.parseInt(fecha.substring(3, 5))>12 
			|| Integer.parseInt(fecha.substring(0,2))<1 || Integer.parseInt(fecha.substring(0,2))>
			diasMes(Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(6, 10))));
		f.set(Integer.parseInt(fecha.substring(6, 10)),Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(0,2)));
		return f;
		
	}
	
	public static void main(String[] args) {
		boolean fin=false;
		int entrada=0;
		Date fecha;
		Camiones camion1 = new Camiones();
		Camiones camion2 = new Camiones();
		Turisticos.Familiares turista1 = new Turisticos.Familiares();
		Turisticos.Unitarios turista2 = new Turisticos.Unitarios();
		System.out.print("Fecha en la que alquilaste el camión: ");
		fecha = leerFecha().getTime();
		camion2.alquilar((int)(fecha.getTime()));
		do {
			try {
				System.out.println("Introduce los km que tiene el vehículo al alquilarlo.");
				entrada=Vehiculos.leer.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("No has introducido un número válido.");
				entrada=-1;
			}
		}while(entrada<0);
		turista1.alquilar(entrada);
		System.out.println(camion1.showinfo());
		System.out.println(camion2.showinfo());
		System.out.println(turista1.showinfo());
		System.out.println(turista2.showinfo());
		do{
			try{
				do{
					System.out.print("Fecha en la que devolviste el camión: ");
					fecha=leerFecha().getTime();
				}while((int)(fecha.getTime())>camion2.diaAlquiler);
				camion2.devolver((int)(fecha.getTime()));
				fin=true;
			}catch(IOException e){
				System.out.println("Error al devolver el vehículo, intentelo de nuevo.");
				fin=false;
			}
		}while(!fin);
		
		do{
			try {
				do {
					try {
						System.out.println("Introduce los km que tiene el vehículo al devolverlo.");
						entrada=Vehiculos.leer.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("No has introducido un número válido.");
						entrada=turista1.kmAlquiler+1;
					}
				}while(entrada<turista1.kmAlquiler);
				turista1.devolver(entrada);
				fin=true;
			} catch (IOException e) {
				System.out.println("Error al devolver el vehículo, intentelo de nuevo.");
				fin=false;
			}
		}while(!fin);

	}

}
