package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class formatofechas2 {
	
	public static String cambioDeFormato(String[] fecha) {
		switch (fecha[1]) {
		case "01": fecha[1]="Enero";
		break;
		case "02": fecha[1]="Febrero";
		break;
		case "03": fecha[1]="Marzo";
		break;
		case "04": fecha[1]="Abril";
		break;
		case "05": fecha[1]="Mayo";
		break;
		case "06": fecha[1]="Junio";
		break;
		case "07": fecha[1]="Julio";
		break;
		case "08": fecha[1]="Agosto";
		break;
		case "09": fecha[1]="Septiembre";
		break;
		case "10": fecha[1]="Octubre";
		break;
		case "11": fecha[1]="Noviembre";
		break;
		case "12": fecha[1]="Diciembre";
		}
		return fecha[0]+" de "+fecha[1]+" de "+fecha[2];
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
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String fecha;
	String[] f = new String[3];
	do{
	do {
	System.out.println("Introduce una fecha con el formato dd/mm/aaaa");
	fecha=entrada.nextLine();
	}while(fecha.length()!=10 || fecha.charAt(2)!='/' || fecha.charAt(5)!='/');
	f=fecha.split("/");
	}while(Integer.parseInt(f[1])<1 || Integer.parseInt(f[1])>12 || Integer.parseInt(f[0])<1 ||
			Integer.parseInt(f[0])>diasMes(Integer.parseInt(f[1]),Integer.parseInt(f[2])));
	System.out.println(cambioDeFormato(f));
	entrada.close();

	}

}