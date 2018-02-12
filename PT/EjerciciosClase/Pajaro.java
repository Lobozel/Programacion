package EjerciciosClase;

public class Pajaro implements Animal{
	
	@Override
	public void desplazamiento() {
		System.out.println("Aereo.");
	}
	@Override
	public void sonido() {
		System.out.println("Canturreo.");
	}
	@Override
	public void comida() {
		System.out.println("Omnivoro.");
	}
	
}
