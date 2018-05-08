package Ejercicio5_3;

import java.util.GregorianCalendar;

public class Libros extends Publicaciones {

	@SuppressWarnings("unused")
	private static final long serialVersionUID=1L;
	private String isbn;
	private String autor;
	
	public Libros() {
		super();
	}
	
	public Libros(String titulo, String editor, GregorianCalendar fecha, String isbn, String autor) {
		super(titulo,editor,fecha);
		this.isbn=isbn;
		this.autor=autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", autor=" + autor + "]";
	}
	
	
}
