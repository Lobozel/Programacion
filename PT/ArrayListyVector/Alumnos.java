package ArrayListyVector;

import java.util.Scanner;
import java.util.Vector;
/**
 * 
 * @author MiguelÁngel
 *
 */

public class Alumnos {
	public static Scanner entrada = new Scanner(System.in);
	
	private String nombre;
	private String apellido;
	private String DNI;
	private String sexo;
	private Condicion condicion;
	private int nota;
	
	public Alumnos(){
		
	}
	public Alumnos(Vector<Alumnos> v, int i) {
        nombre = v.get(i).getNombre();
        apellido = v.get(i).getApellido();
        this.DNI = v.get(i).getDNI();
        this.sexo = v.get(i).getSexo();
        this.condicion = v.get(i).getCondicion();
        this.nota = v.get(i).getNota();
}
	
	/**********************
	 **GETTERS*AND*SETTERS*
	 **********************/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre=nombre.toLowerCase();
		primeraLetraMayuscula(nombre);
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		apellido=apellido.toLowerCase();
		primeraLetraMayuscula(apellido);
		this.apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if(sexo=='h')
		this.sexo = "hombre";
		else
			this.sexo = "mujer";
	}
	public Condicion getCondicion() {
		return condicion;
	}
	public void setCondicion(int num) {
		if(num==1)
		this.condicion = Condicion.presencial;
		else
			this.condicion = Condicion.semipresencial;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	/************
	 **TO*STRING*
	 ************/
	public String toString(){
		return "Su nombre es: "+this.nombre+".\n"
				+ "Su apellido es: "+this.apellido+".\n"
						+ "Su DNI es: "+this.DNI+".\n"
								+ "Su sexo es: "+this.sexo+".\n"
										+ "Su condición de matricula es: "+this.condicion+".\n"
												+ "Su nota final es: "+this.nota;
	}
	
	/*******
	 **LEER*
	 *******/
	public static Alumnos leerAlumnos(){
		Alumnos alumnoNuevo = new Alumnos();
		String dni="";
		char sexo='c';
		int num=0;
		
		System.out.println("Introduce el nombre del alumno:");
		alumnoNuevo.setNombre(entrada.next());
		
		System.out.println("Introduce el apellido del alumno:");
		alumnoNuevo.setApellido(entrada.next());
		
		do{
		System.out.println("Introduce el DNI válido del alumno:");
		dni=entrada.next();
		}while(!validarDNI(dni));
		alumnoNuevo.setDNI(dni);
		
		do{
			System.out.println("Introduce 'h' si eres hombre o 'm' si eres mujer.");
			sexo=entrada.next().charAt(0);
		}while(sexo!='h' && sexo!='m');
		alumnoNuevo.setSexo(sexo);
		
		do{
			System.out.println("Introduce 1 si estas en presencial o 0 si estas en semipresencial.");
			num=entrada.nextInt();
		}while(num<0 || num>1);
		alumnoNuevo.setCondicion(num);
		
		do{
			System.out.println("Introduce una nota válida entera");
			num=entrada.nextInt();
		}while(num<1 || num>10);
		alumnoNuevo.setNota(num);
		
		return alumnoNuevo;
	}
	
	
	/*********************
	 **MÉTODOS*AUXILIARES*
	 *********************/
	protected static String primeraLetraMayuscula(String cad){
		String result="";
		for(int i=0;i<cad.length();i++){
			if(i==0 && Character.isLetter(cad.charAt(0)) ||
					Character.isLetter(cad.charAt(i)) && Character.isSpaceChar(cad.charAt(i-1)))
				result+=Character.toUpperCase(cad.charAt(i));
			else
				result+=cad.charAt(i);	
		}
		return result;
	}
	
	protected static boolean validarDNI(String dni){
		String[] letra = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N",
				"J","Z","S","Q","V","H","L","C","K","E"};
		int num;
		for(int i=0;i<dni.length()-1;i++)
			if(!Character.isDigit(dni.charAt(i)))
				return false;
		num=Integer.parseInt(dni.substring(0, dni.length()-1));
		System.out.println(num);
		System.out.println(String.valueOf(dni.charAt(dni.length()-1)));
		System.out.println(letra[(int)(num%23)]);
		if(!String.valueOf(dni.charAt(dni.length()-1)).equals(letra[(int)(num%23)]))
			return false;
		return true;
	}
	
}
