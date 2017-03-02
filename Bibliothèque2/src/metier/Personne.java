package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author A.CONSEIL
 *
 */
public class Personne {
	
	/** Le nom de la Personne **/
	private String nom;
	
	/** Le prénom de la Personne **/
	private String prenom;
	
	/** La date de naissance de la Personne **/
	private Date dateNaissance;
	
	/** Le sexe de la personne **/
	private String sexe;
	
	/** Objet utilisé pour formatter les dates **/
	protected static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	

	
// CONSTRUCTEURS 	
	
	public Personne(){
		this("Nom Inconnu","Prenom Inconnu",new Date(0),"Sexe Inconnu");
	}
	
	
	public Personne(String nom, String prenom, Date dateNaissance, String sexe){
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateNaissance(dateNaissance);
		this.setSexe(sexe);
		}
	
	
// GETTERS SETTERS	
	
	public String getNom(){
		return nom;		
	}
	public String getPrenom(){
		return prenom;		
	}
	public Date getdateNaissance(){
		return dateNaissance;		
	}
	public String getSexe(){
		return sexe;		
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	public void setDateNaissance(Date dateNaissance){
		this.dateNaissance=dateNaissance;
	}
	public void setSexe(String sexe){
		this.sexe=sexe;
	}
	
// METHODES	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + df.format(dateNaissance) + ", sexe=" + sexe
				+ "]";
		
	}
	
	
}
