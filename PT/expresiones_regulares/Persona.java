package expresiones_regulares;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class Persona {
/*
 * Los datos de la clase Persona contienen los siguientes atributos:
 * 
 * Nombre cadena de caracteres
 * Apellido cadena de caracteres
 * NIF 8 digitos y una letra
 * Fecha de nacimiento en el formato dd/mm/aaaa
 * Email con formato adecuado
 * Teléfono fijo
 * Teléfono móvil
 */
	
	/************
	 **ATRIBUTOS*
	 ************/
	private String nombre;
	private String apellido;
	private String NIF;
	private String f_nacimiento;
	private String email;
	private int tel_fijo;
	private int tel_movil;
	
	/**********************
	 **GETTERS*AND*SETTERS*
	 **********************/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre=nombre.toLowerCase();
		primeraLetraMayuscula(nombre);
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		apellido=apellido.toLowerCase();
		primeraLetraMayuscula(apellido);
		this.apellido = apellido;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nif) {
		this.NIF = nif;
	}
	public String getF_nacimiento() {
		return f_nacimiento;
	}
	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel_fijo() {
		return tel_fijo;
	}
	public void setTel_fijo(int tel_fijo) {
		this.tel_fijo = tel_fijo;
	}
	public int getTel_movil() {
		return tel_movil;
	}
	public void setTel_movil(int tel_movil) {
		this.tel_movil = tel_movil;
	}
	
	/*********************
	 **MÉTODOS*AUXILIARES*
	 *********************/
	protected static String primeraLetraMayuscula(String cad){
		String result="";
		for(int i=0;i<cad.length();i++){
			if(i==0 && Character.isLetter(cad.charAt(0)) ||
					Character.isLetter(cad.charAt(i)) && Character.isSpaceChar(cad.charAt(i-1)))
				result+=Character.toUpperCase(cad.charAt(i));
			else
				result+=cad.charAt(i);	
		}
		return result;
	}
	
}
