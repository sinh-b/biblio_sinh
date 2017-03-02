package metier;

import java.util.Date;


/**
 * 
 * @author S.BUI
 *
 */
public class Exemplaire {

	/** L'identifiant d'un Exemplaire de Livre **/ 
	private int idExemplaire;
	
	/** La date d'achat de l'Exemplaire par la Bibliothèque **/
	private Date dateAchat;
	
	/** Le statut de disponiblité d'un exemplaire **/
	private EnumStatusExemplaire status;
	
	/** Le numéro ISBN du Livre auquel se rapport un Exemplaire **/
	private String isbn;
	
	/** L'Emprunt auquel un livre est rattaché **/
	private EmpruntEnCours empruntConcerne;
	
	
// CONSTRUCTEURS 	
	
	public Exemplaire(int idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn){
	this.setIdExemplaire(idExemplaire);
	this.setDateAchat(dateAchat);
	this.setStatus(status);
	this.setIsbn(isbn);
	}
	
	
	public Exemplaire(){
		this(0, new Date(0), EnumStatusExemplaire.DISPONIBLE, "NA");
	}

	
	
// GETTERS SETTERS	
	
	public EmpruntEnCours getEmpruntConcerne() {
		return empruntConcerne;
	}

	
	public void setEmpruntConcerne(EmpruntEnCours empruntConcerne) throws BiblioException {
		this.empruntConcerne = empruntConcerne;
		if (empruntConcerne.getExemplaire() == null)
		empruntConcerne.setExemplaire(this);
	}

	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemmplaire) {
		this.idExemplaire = idExemmplaire;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
// METHODES 	
	
	@Override
	public String toString() {
		return "idExemplaire : " + idExemplaire + ", ISBN : " + isbn + ", Emprunt concerné : " + empruntConcerne + ", Status : " + status;
	}

}
