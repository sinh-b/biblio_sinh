package metier;

@SuppressWarnings("serial")

/**
 * 
 * @author A.CONSEIL
 *
 */
public class BiblioException extends Exception {
	
	
	public BiblioException(){
		this("Erreur g�n�rique sur applicatif Biblioth�que");
	}
	
	
	public BiblioException(String message){
		super(message);
	}
}
