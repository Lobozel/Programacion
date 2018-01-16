package EjerciciosClase;

public class Empleado {
private String nombre, direccion, telefono, nif;
private Especialidad especialidad;
public Empleado() {
	
}
public Empleado(String nombre, String direccion, String telefono, String nif, Especialidad especialidad) {
	this.nombre=nombre;
	this.direccion=direccion;
	this.telefono=telefono;
	this.nif=nif;
	this.especialidad=especialidad;
}
public Empleado(Empleado e) {
	this.nombre=e.nombre;
	this.direccion=e.direccion;
	this.telefono=e.telefono;
	this.nif=e.nif;
	this.especialidad=e.especialidad;  
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getNif() {
	return nif;
}
public void setNif(String nif) {
	this.nif = nif;
}
public Especialidad getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(Especialidad especialidad) {
	this.especialidad = especialidad;
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", nif=" + nif
			+ ", especialidad=" + especialidad + "]";
}

}
