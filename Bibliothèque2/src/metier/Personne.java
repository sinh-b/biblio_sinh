package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String sexe;
	protected static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	public Personne(){
		this("Nom Inconnu","Prenom Inconnu",new Date(0),"Sexe Inconnu");
	}
	
	
	public Personne(String nom, String prenom, Date dateNaissance, String sexe){
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateNaissance(dateNaissance);
		this.setSexe(sexe);
		}
	
	
	
	
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
	
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + df.format(dateNaissance) + ", sexe=" + sexe
				+ "]";
	}
	
	
}
