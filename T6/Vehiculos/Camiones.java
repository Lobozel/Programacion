package Vehiculos;

import java.util.Calendar;

public class Camiones extends Vehiculos{

	double precioDia;
	Calendar diaAlquiler=Calendar.getInstance();
	Calendar diaDevolucion=Calendar.getInstance();
	static int numCamiones;
	static int numCamAlquilados;
	
	public Camiones() {
		diaAlquiler.set(1999,1,1);
		diaDevolucion.set(1999, 1, 1);
		numCamiones++;
	}
	
	@Override
	public void alquilar() {
		System.out.print("Fecha en la que alquilaste el camión: ");
		String fecha=leerFecha();
		this.diaAlquiler.set(Integer.parseInt(fecha.substring(6, 10)),Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(0,2)));
		System.out.println("¡Enhorabuena! Has alquilado un camión.");
		numCamAlquilados++;
	}

	@Override
	public void devolver() {
		System.out.print("Fecha en la que devolviste el camión: ");
		String fecha=leerFecha();
		this.diaDevolucion.set(Integer.parseInt(fecha.substring(6, 10)),Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(0,2)));
		System.out.println("Has devuelto un camión con éxito.");
		numCamAlquilados--;
	}

	@Override
	public String showinfo() {
		return null;
	}
	
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

	protected static String leerFecha() {
		String fecha="";
		do {
			System.out.println("Introduce la fecha con el formato dd/mm/aaaa");
			fecha=entrada.nextLine();
			}while(fecha.length()!=10 || fecha.charAt(2)!='/' || fecha.charAt(5)!='/' ||
			Integer.parseInt(fecha.substring(3, 5))<1 || Integer.parseInt(fecha.substring(3, 5))>12 
			|| Integer.parseInt(fecha.substring(0,2))<1 || Integer.parseInt(fecha.substring(0,2))>
			diasMes(Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(6, 10))));

		return fecha;
		
	}

}
