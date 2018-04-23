package EJ1;

public class Directivo extends Empleado{
	
	public Directivo(String nombre) {
		super(nombre);
	}

	public String toString() {
		return super.toString()+" es Directivo";
	}
	
}
