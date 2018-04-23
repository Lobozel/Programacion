package FicherosObjeto;

import java.util.GregorianCalendar;

public class Publicaciones {

	@SuppressWarnings("unused")
	private static final long serialVersionUID=1L;
	private String titulo;
	private String editor;
	private GregorianCalendar fecha=null;
	
	public Publicaciones() {
		
	}
	
	public Publicaciones(String titulo, String editor, GregorianCalendar fecha) {
		this.titulo=titulo;
		this.editor=editor;
		this.fecha=fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Publicaciones [titulo=" + titulo + ", editor=" + editor + ", fecha=" + fecha + "]";
	}
	
	
	
}
