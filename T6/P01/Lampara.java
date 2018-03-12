package P01;

public class Lampara {

	private String forma;
	private boolean encendido;
	
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public class Bombilla{
		
		private int potencia;

		public int getPotencia() {
			return potencia;
		}

		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		
		
		
	}

}
