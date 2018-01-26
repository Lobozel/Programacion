package Ejercicios_sobre_cadenas;

import java.util.Scanner;

/**
 * 
 * @author MiguelÃ�ngel
 *
 */
public class formatofechas {
/*
 * Hacer un programa que al recibir como dato una cadena de caracteres
 * que represente una fecha en formato (dd/mm/aa), genere otra cadena
 * con la misma fecha pero con un formato (dd de nombre del mes de aaaa).
 * Por ejemplo si se ingresa la cadena: 20/11/2006 la otra cadena serÃ¡: 20
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
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String fecha;
//	do {
//	System.out.println("Introduce una fecha con el formato dd/mm/aaaa");
//	fecha=entrada.nextLine();
//	}while();
//	}while(hora.length() != 5 || hora.charAt(2) != ':' ||
//			Integer.parseInt(hora.substring(0, 2)) > 23 ||
//			Integer.parseInt(hora.substring(0, 2)) < 0 ||
//			Integer.parseInt(hora.substring(3, 5)) > 59 ||
//Integer.parseInt(hora.substring(3, 5)) < 0);
//	System.out.println(cambioDeFormato(fecha));
	entrada.close();

	}

}
