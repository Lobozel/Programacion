package ArrayListyVector;

import java.util.Scanner;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Coche {
	public static Scanner entrada = new Scanner(System.in);
	private String matricula;
	private String marca;
	private String modelo;
	private String t_combustible;
	private int km;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getT_combustible() {
		return t_combustible;
	}
	public void setT_combustible(String t_combustible) {
		this.t_combustible = t_combustible;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String toString(){
		return "La matrícula es: "+this.matricula+".\n"
				+ "Su Marca es: "+this.marca+".\n"
						+ "Su modelo es: "+this.modelo+".\n"
								+ "Su tipo de combistuble es: "+this.t_combustible+".\n"
										+ "Tiene "+this.km+" kilómetros.";
	}
	
	
	public static Coche leerCoche(){
		Coche nuevoCoche = new Coche();
		int km=0;
		
		System.out.println("Introduce la matrícula del coche: ");
		nuevoCoche.setMatricula(entrada.nextLine());
		
		System.out.println("Introduce su Marca:");
		nuevoCoche.setMarca(entrada.nextLine());
		
		System.out.println("Introduce su Modelo");
		nuevoCoche.setModelo(entrada.nextLine());
		
		System.out.println("Introduce su tipo de combustible");
		nuevoCoche.setT_combustible(entrada.nextLine());
		
		do{
			System.out.println("Introduce cuantos kms tiene");
			km=entrada.nextInt();
		}while(km<0);
		nuevoCoche.setKm(km);
				
		return nuevoCoche;
	}

}
