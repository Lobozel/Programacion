package FicherosObjeto;

@SuppressWarnings("serial")
public class NoValidoException extends Exception {

	public NoValidoException() {
		super();
	}
	
	public NoValidoException(String error) {
		super(error);
	}
	
}
