package Ejercicio29_ProyectoFinal_MA;

public class Persona {

	String nombre, apellido, telefono, NIF;
	
	public Persona(){
		
	}
	
	public Persona(String nombre, String apellido, String telefono, String NIF){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.NIF=NIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	@Override
	public String toString() {
		return "Nombre: "+this.nombre+"\n"
				+ "Apellidos: "+this.apellido+"\n"
						+ "Teléfono: "+this.telefono+"\n"
								+ "NIF: "+this.NIF;
	}
	
	

}
