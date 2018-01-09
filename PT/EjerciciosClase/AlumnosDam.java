package EjerciciosClase;
/**
 * 
 * @author diurno
 *
 *
 *Declarar un array de objetos de la clase AlumnosDam con los datos y métodos habituales.
 *-La clase debe incluir un array de notas con las notas de los alumnos en cada una de las
 * asignaturas del curso, en aquellas en la que el alumno no esté matriculado su nota será 0
 *-Incluir un array en la clase con los nombres de las asignaturas
 *-Incluir un constructor por defecto y uno de clase
 *·Declarar una clase principal que declare un array de objetos del tipo alumnos, lo rellene
 * con datos e imprima todos los alumnos con todos sus datos.
 * Hacerlo usando un método para la impresión
 *·Escribir la media de cada uno de los alumnos junto con sus datos.
 */
public class AlumnosDam {
private String[] modulos = new String[]
			{	"Base de datos",
				"Lenguaje de Marcas",
				"Programación",
				"Sistemas informáticos",
				"Entornos de Desarrollo",
				"Formación Obligatoria Laboral"
				};
private int[] notas = new int[6];

public AlumnosDam() {
	
}

public AlumnosDam(int[] notas) {
	this.notas=notas;
}

}
