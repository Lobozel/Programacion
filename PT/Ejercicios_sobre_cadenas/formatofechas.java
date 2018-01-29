package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author Miguelángel
 *
 */
public class formatofechas {
/*
 * Hacer un programa que al recibir como dato una cadena de caracteres
 * que represente una fecha en formato (dd/mm/aa), genere otra cadena
 * con la misma fecha pero con un formato (dd de nombre del mes de aaaa).
 * Por ejemplo si se ingresa la cadena: 20/11/2006 la otra cadena será: 20
 * de Noviembre de 2006
 */
	public static String cambioDeFormato(String f) {
		String[] fecha = new String[3];
		fecha=f.split("/");
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
	do {
	System.out.println("Introduce una fecha con el formato dd/mm/aaaa");
	fecha=entrada.nextLine();
	}while(fecha.length()!=10 || fecha.charAt(2)!='/' || fecha.charAt(5)!='/' ||
	Integer.parseInt(fecha.substring(3, 5))<1 || Integer.parseInt(fecha.substring(3, 5))>12 
	|| Integer.parseInt(fecha.substring(0,2))<1 || Integer.parseInt(fecha.substring(0,2))>
	diasMes(Integer.parseInt(fecha.substring(3, 5)),Integer.parseInt(fecha.substring(6, 10))));

	System.out.println(cambioDeFormato(fecha));
	entrada.close();

	}

}
