package expresiones_regulares;

import java.util.Scanner;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P05_EJ06 {
	/*
	 * Realizar un programa que rellene los datos de un array de objetos de la clase Persona,
	 * comprobando que los datos cumplen los requisitos de su tipo y son correctos.
	 */
	
	
	/***************
	 **VALIDACIONES*
	 ***************/
	
	protected static boolean verificarNif(String nif){
		if(nif.length()!=9 || !Character.isLetter(nif.charAt(nif.length()-1)))
			return false;
		else
			for(int i=0;i<nif.length()-1;i++)
				if(!Character.isDigit(nif.charAt(i)))
					return false;
				
		return true;
	}
	
	protected static boolean verificarF_Nacimiento(String f_nacimiento){
		if(f_nacimiento.length()!=10 || f_nacimiento.charAt(2)!='/' || f_nacimiento.charAt(5)!='/' ||
	Integer.parseInt(f_nacimiento.substring(3, 5))<1 || Integer.parseInt(f_nacimiento.substring(3, 5))>12 
	|| Integer.parseInt(f_nacimiento.substring(0,2))<1 || Integer.parseInt(f_nacimiento.substring(0,2))>
	diasMes(Integer.parseInt(f_nacimiento.substring(3, 5)),Integer.parseInt(f_nacimiento.substring(6, 10))))
		return false;
		else
		return true;
	}
	
	protected static boolean verificarEmail(String email){
		int posicion=email.indexOf("a");
		if(posicion!=-1){
			posicion=email.indexOf(".");
			if(posicion!=-1)
				if(email.substring(posicion+1, email.length()).equals("com") ||
						email.substring(posicion+1, email.length()).equals("es") ||
						email.substring(posicion+1, email.length()).equals("net"))
					return true;
		}
		return false;
	}
	
	//Verificar télefono fijo suponiendo que es de España
	protected static boolean verificarTel_Fijo(int tel_fijo){
		if(Integer.toString(tel_fijo).length()!=9 ||
			(int)(tel_fijo%(Math.pow(10, 9))/(Math.pow(10, 8)))!=9)
			return false;
		return true;
	}
	
	//Verificar télefono móvil suponiendo que es de España
	protected static boolean verificarTel_Movil(int tel_movil){
		if(Integer.toString(tel_movil).length()!=9 ||
				(int)(tel_movil%(Math.pow(10, 9))/(Math.pow(10, 8)))!=6)
				return false;
		return true;
	}
	
	/*********************
	 **MÉTODOS*AUXILIARES*
	 *********************/
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
	protected static boolean bisiesto(int año){
		boolean bisiesto=false;
		if(año%4==0 || año%400==0 && año%100!=0)
			bisiesto=true;
		return bisiesto;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		String datos="";
		
		do{
		System.out.println("¿Cuántas personas quieres introducir en el array?");
		num=entrada.nextInt();
		}while(num<0);
		
		Persona[] array = new Persona[num];
		
		entrada.nextLine();
		
		for(int i=0;i<array.length;i++){
			array[i] = new Persona();
			System.out.println("Vamos a introducir a la persona nº "+(i+1));
			System.out.println("Introduce su nombre");
			array[i].setNombre(entrada.next());
			System.out.println("Introduce su apellido");
			array[i].setApellido(entrada.next());
			do{
				System.out.println("Introduce su NIF");
				datos=entrada.next();
			}while(!verificarNif(datos));
			array[i].setNIF(datos);
			do{
				System.out.println("Introduce su fecha de nacimiento (dd/mm/aaaa)");
				datos=entrada.next();
			}while(!verificarF_Nacimiento(datos));
			array[i].setF_nacimiento(datos);
			do{
				System.out.println("Introduce su email");
				datos=entrada.next();
			}while(!verificarEmail(datos));
			array[i].setEmail(datos);
			do{
				System.out.println("Introduce su teléfono fijo de España");
				num=entrada.nextInt();
			}while(!verificarTel_Fijo(num));
			array[i].setTel_fijo(num);
			do{
				System.out.println("Introduce su teléfono móvil de España");
				num=entrada.nextInt();
			}while(!verificarTel_Movil(num));
			array[i].setTel_movil(num);
			
			System.out.println();
			
		}
		
		for(int i=0;i<array.length;i++)
			System.out.println("Datos de la persona nº "+(i+1)+":\n"
					+ "Su nombre es: "+array[i].getNombre()+"\n"
					+ "Su apellido es: "+array[i].getApellido()+"\n"
							+ "Su NIF es: "+array[i].getNIF()+"\n"
									+ "Su fecha de nacimiento es: "+array[i].getF_nacimiento()+"\n"
											+ "Su email es: "+array[i].getEmail()+"\n"
													+ "Su teléfono fijo es: "+array[i].getTel_fijo()+"\n"
															+ "Su teléfono móvil es: "+array[i].getTel_movil()+"\n");		
		entrada.close();

	}

}
