package EjerciciosClase;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//variables para primer examen, segundo examen, tercer examen, examen final y trabajo final
		float exam1, exam2, exam3, examf, trabf, media;
		System.out.println("Introduce la nota del primer examen.");
		exam1=entrada.nextFloat();
		System.out.println("Introduce la nota del segundo examen.");
		exam2=entrada.nextFloat();
		System.out.println("Introduce la nota del tercer examen.");
		exam3=entrada.nextFloat();
		System.out.println("Introduce la nota del examen final.");
		examf=entrada.nextFloat();
		System.out.println("Introduce la nota del trabajo final.");
		trabf=entrada.nextFloat();
		media=(exam1+exam2+exam3)/3;
		System.out.println("Tu nota final es: "+(55*media/100+30*examf/100+15*trabf/100));
		entrada.close();
	}

}
