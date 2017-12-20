package EjerciciosClase;
import java.util.Scanner;
public class hombreomujeradulta {

	public static void main(String[] args) {
		/* programa que lea la edad y el sexo de una persona y escriba si es mujer
		 * entre 25 y 18 años, ambos inclusive o un hombre con cualquier edad.
		 * Si se da el caso anteriormente dicho, escribiremos correcto, en caso
		 * contrario, incorrecto.
		 */
		Scanner entrada = new Scanner(System.in);
		char sexo;
		int edad=0;
		System.out.println("Introduce el sexo de la persona (h/m)");
		sexo=entrada.next().charAt(0);
		if(sexo=='m') {
			System.out.println("Introduce su edad");
			edad=entrada.nextInt();
		}
		if (sexo=='m' && edad>=18 && edad<=25 || sexo=='h')
			System.out.println("Correcto.");
		else
			System.out.println("Incorrecto.");
		entrada.close();

	}

}
