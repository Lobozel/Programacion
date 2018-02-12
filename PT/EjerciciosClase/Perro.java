package EjerciciosClase;

public class Perro implements Animal{
	@Override
	public void desplazamiento() {
		System.out.println("Terrestre.");
	}
	@Override
	public void sonido() {
		System.out.println("Ladridos.");
	}
	@Override
	public void comida() {
		System.out.println("Carne.");
	}
	
}
