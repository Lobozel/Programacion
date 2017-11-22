package EjerciciosClase;

public class PuntoPrueba {

	public static void main(String[] args) {
		Punto punto1 = new Punto();
		Punto punto2 = new Punto(2,2);
		Punto punto3 = new Punto(punto2);
		
		System.out.println(punto1.distancia(punto2));
		System.out.println(punto1.puntoMedio(punto3));

	}

}
