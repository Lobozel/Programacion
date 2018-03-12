package P1;

import java.util.Scanner;

public class P1_EJ03 {

	protected static boolean bisiesto(int año){
		boolean bisiesto=false;
		if(año%4==0 || año%400==0 && año%100!=0)
			bisiesto=true;
		return bisiesto;
	}
	
	protected static int diasMes(int mes, int año){
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
	
	public static boolean validarFecha(String fecha) throws NoValidoException {
		if(fecha.length()!=8 || 
				Integer.parseInt(fecha.substring(2, 4))<1 || Integer.parseInt(fecha.substring(2, 4))>12 
				|| Integer.parseInt(fecha.substring(0,2))<1 || Integer.parseInt(fecha.substring(0,2))>
				diasMes(Integer.parseInt(fecha.substring(2, 4)),Integer.parseInt(fecha.substring(4, 8)))) {
			throw new NoValidoException("El formato de fecha es incorrecto.");
		}
		return true;
	}
	
	public static String cambiarFormato(String fecha) {
		String fechaLarga=fecha.substring(0,2)+" de ";
		switch(Integer.parseInt(fecha.substring(2, 4))) {
		case 1: fechaLarga+="Enero";
		break;
		case 2: fechaLarga+="Febrero";
		break;
		case 3: fechaLarga+="Marzo";
		break;
		case 4: fechaLarga+="Abril";
		break;
		case 5: fechaLarga+="Mayo";
		break;
		case 6: fechaLarga+="Junio";
		break;
		case 7: fechaLarga+="Julio";
		break;
		case 8: fechaLarga+="Agosto";
		break;
		case 9: fechaLarga+="Septiembre";
		break;
		case 10: fechaLarga+="Octubre";
		break;
		case 11: fechaLarga+="Noviembre";
		break;
		case 12: fechaLarga+="Diciembre";
		}
		fechaLarga+=" de "+fecha.substring(4,8);
		return fechaLarga;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String fecha="";
		boolean fin=false;
		do {
			try {
				System.out.println("Introduce una fecha con el siguiente formato: ddmmaaaa");
				fecha=entrada.nextLine();
				if (validarFecha(fecha))
					fin=true;
			}catch(NoValidoException nv) {
				nv.printStackTrace();
				
				try{
					Thread.sleep(500);
					System.out.println();
				}catch(InterruptedException e ){
					System.out.println("El proceso se ha interrumpido.");
				}
				
				fin=false;
			}
		}while(!fin);
		fecha=cambiarFormato(fecha);
		System.out.println(fecha);
		entrada.close();
	}

}