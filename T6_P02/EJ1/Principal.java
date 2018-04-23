package EJ1;


public class Principal {

	public static void main(String[] args) {
		Empleado uno = new Empleado("Manolo");
		Operario dos = new Operario("Juan");
		Directivo tres = new Directivo("Ana");
		Oficial cuatro = new Oficial("Alberto");
		Tecnico cinco = new Tecnico("Rosa");
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		System.out.println(tres.toString());
		System.out.println(cuatro.toString());
		System.out.println(cinco.toString());
	}

}
