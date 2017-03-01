package metier;

import java.util.Date;

public class Exemplaire {

	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	private EmpruntEnCours empruntConcerne;
	
	public Exemplaire(int idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn){
	this.setIdExemplaire(idExemplaire);
	this.setDateAchat(dateAchat);
	this.setStatus(status);
	this.setIsbn(isbn);
	
	
	}
	
	public Exemplaire(){
		this(0, new Date(0), EnumStatusExemplaire.DISPONIBLE, "NA");
	}

	

	
	public EmpruntEnCours getEmpruntConcerne() {
		return empruntConcerne;
	}

	public void setEmpruntConcerne(EmpruntEnCours empruntConcerne) {
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
	
	
	@Override
	public String toString() {
		return "idExemplaire : " + idExemplaire + ", ISBN : " + isbn + ", Emprunt concern� : " + empruntConcerne + ", Status : " + status;
	}
	

	
}
