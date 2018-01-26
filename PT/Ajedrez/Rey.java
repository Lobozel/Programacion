package Ajedrez;

public class Rey {

	private Color color;
	private Posici�n posicion;
	
	public Rey() {
		this.color=Color.BLANCO;
		this.posicion= new Posici�n(1,'e');
	}
	
	public Rey(Color c) {
		this.color=c;
	}

	public Color getColor() {
		return this.color;
	}
	
	public Posici�n getPosici�n() {
		return this.posicion;
	}
	
	public void mueve(Direcci�n d) {
		switch (d) {
		case NORTE:
			if(this.posicion.getFila()!=8)
				this.posicion.setFila(this.posicion.getFila()+1);
			else
				System.out.println("El movimiento no es válido");
			break;
		case NORESTE:
			if(this.posicion.getColumna()!='h' && this.posicion.getFila()!=8) {
				this.posicion.setColumna((char)(this.posicion.getColumna()+1));
				this.posicion.setFila(this.posicion.getFila()+1);
			}
			else
				System.out.println("El movimiento no es válido");
			break;
		case ESTE:
			if(this.posicion.getColumna()!='h')
				this.posicion.setColumna((char)(this.posicion.getColumna()+1));
			else
				System.out.println("El movimiento no es válido");
			break;
		case SURESTE:
			if(this.posicion.getFila()!=1 && this.posicion.getColumna()!='h') {
				this.posicion.setFila(this.posicion.getFila()-1);
				this.posicion.setColumna((char)(this.posicion.getColumna()+1));
			}
			else
				System.out.println("El movimiento no es válido");
			break;
		case SUR:
			if(this.posicion.getFila()!=1)
				this.posicion.setFila(this.posicion.getFila()-1);
			else
				System.out.println("El movimiento no es válido");
			break;
		case SUROESTE:
			if(this.posicion.getFila()!=1 && this.posicion.getColumna()!='a') {
				this.posicion.setFila(this.posicion.getFila()-1);
				this.posicion.setColumna((char)(this.posicion.getColumna()-1));
			}
			else
				System.out.println("El movimiento no es válido");
			break;
		case OESTE:
			if(this.posicion.getColumna()!='a')
				this.posicion.setColumna((char)(this.posicion.getColumna()-1));
			else
				System.out.println("El movimiento no es válido");
			break;
		case NOROESTE:
			if(this.posicion.getColumna()!='a' && this.posicion.getFila()!=8) {
				this.posicion.setColumna((char)(this.posicion.getColumna()-1));
				this.posicion.setFila(this.posicion.getFila()+1);
			}
			else
				System.out.println("El movimiento no es válido");
		}
	}

	@Override
	public String toString() {
		return "Rey es del color "+this.color+" y se encuentra en la posición "+this.posicion;
	}
	
	
}
