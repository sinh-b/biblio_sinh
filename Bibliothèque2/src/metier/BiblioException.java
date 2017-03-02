package metier;

@SuppressWarnings("serial")
public class BiblioException extends Exception {
	public BiblioException(){
		this("action impossible");
	}
	public BiblioException(String message){
		super(message);
	}
}
