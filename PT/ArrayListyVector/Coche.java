package ArrayListyVector;

import java.util.ArrayList;
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
	
	public Coche(){
		
	}
	
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
	protected static String Marca(int num){
		String[] marcas = new String[]{
				"Toyota Yaris",
				"Renault Twingo",
				"Nissan Micra",
				"Honda Jazz",
				"Citroen C3",
				"Dacia Sandero"
			};
		
		for(int i=0;i<marcas.length;i++){
			System.out.println((i+1)+".-"+marcas[i]);
		}
		
		return marcas[num];	
	}
	
	protected static String Modelo(int num){
		return "sad";
	}
	
	public static Coche leerCoche(){
		Coche nuevoCoche = new Coche();
		String[] marcas = new String[]{
			"Alfa Romeo",
			"Audi",
			"Citroen",
			"Ford",
			"Honda",
			"Hyundai",
			"Nissan",
			"Suzuki",
			"Tesla",
			"Toyota"
		};
		int num=0;
		
		System.out.println("Introduce la matrícula del coche: ");
		nuevoCoche.setMatricula(entrada.nextLine());
		
		do{
		System.out.println("Selecciona su Marca:");
		for(int i=0;i<marcas.length;i++)
			System.out.println((i+1)+".-"+marcas[i]);
		num=entrada.nextInt();
		}while(num<1 || num>10);
		
		nuevoCoche.setMarca(Marca(num));
		
		
		
		return nuevoCoche;
	}
	public static void main(String[] args) {
		
		
		ArrayList<Coche> array = new ArrayList<Coche>();
		char fin='c';	
		
		while(fin!='f'){
			array.add(leerCoche());
			
			System.out.println("¿Deseas añadir otro coche?\n"
						+ "(Cualquier tecla para continuar)\n"
						+ "('f' para terminar)");
			fin=entrada.next().charAt(0);
		}
		
		entrada.close();
	}

}
