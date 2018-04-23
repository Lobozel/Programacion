package Ejercicio5_3;

import java.util.GregorianCalendar;

public class Revistas extends Publicaciones{

	@SuppressWarnings("unused")
	private static final long serialVersionUID=1L;
	private int numerosPorAnyo;
	private long circulacion;
	
	public Revistas() {
		super();
	}
	
	public Revistas(String titulo, String editor, GregorianCalendar fecha, int numerosPorAnyo, long circulation) {
		super(titulo,editor,fecha);
		this.numerosPorAnyo=numerosPorAnyo;
		this.circulacion=circulation;
	}

	public int getNumerosPorAnyo() {
		return numerosPorAnyo;
	}

	public void setNumerosPorAnyo(int numerosPorAnyo) {
		this.numerosPorAnyo = numerosPorAnyo;
	}

	public long getCirculacion() {
		return circulacion;
	}

	public void setCirculacion(long circulacion) {
		this.circulacion = circulacion;
	}

	@Override
	public String toString() {
		return "Revistas [numerosPorAnyo=" + numerosPorAnyo + ", circulacion=" + circulacion + "]";
	}
	
	
	
}
