package EjerciciosClase;

public class empleado {
/*
 * Parámetros privados
 */
private String nombre, apellido;
private int edad;
private double sueldo;

/*
 * Getters and Setters
 */
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
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}

/*
 * Constructores de la clase
 */
public empleado() {
	
}

public empleado(String nombre, String apellido, int edad, double sueldo) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	this.sueldo=sueldo;
}
@Override
public String toString() {
	return "El empleado " + nombre +" "+ apellido + " con " + edad + " años, tiene un sueldo de" + sueldo + ".";
}


}
