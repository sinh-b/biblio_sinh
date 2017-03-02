package metier;

@SuppressWarnings("serial")

/**
 * 
 * @author A.CONSEIL
 *
 */
public class BiblioException extends Exception {
	
	
	public BiblioException(){
		this("Erreur générique sur applicatif Bibliothèque");
	}
	
	
	public BiblioException(String message){
		super(message);
	}
}
