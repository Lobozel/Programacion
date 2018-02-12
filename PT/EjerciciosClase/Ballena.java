package EjerciciosClase;
public class Ballena implements Animal{
	@Override
	public void desplazamiento() {
		System.out.println("Acuatico.");
	}
	@Override
	public void sonido() {
		System.out.println("Cancion.");
	}
	@Override
	public void comida() {
		System.out.println("plancton.");
	}
}
