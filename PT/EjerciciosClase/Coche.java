package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Coche {
private String matricula, marca, modelo, t_combustible;
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

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		entrada.close();

	}

}
