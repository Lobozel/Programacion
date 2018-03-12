package EjerciciosDeClase;

public class Instituto extends Persona {

	public class Alumno extends Instituto{
		private String curso;
		private String regimen;
		private boolean repetidor;
		
	}
	
	public class Profesor extends Instituto{
		private float sueldo;
		private String especialidad;
		private String rango; //tutor, director, etc
		private String nivel; //nivel de acceso
		
	}
	
	public class PND extends Instituto{ //Personal No Docente
		private float sueldo;
		private String convenio;
		
	}
	
}
