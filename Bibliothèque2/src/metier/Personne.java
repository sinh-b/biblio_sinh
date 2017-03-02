package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
	private String nom;
	private String prenom;
	private SimpleDateFormat dateNaissance;
	private String sexe;
	private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public Personne(){
		this("nomInconnu","prenomInconnu",new SimpleDateFormat("01/01/1970"),"sexeInconnu");
	}
	public Personne(String nom, String prenom, SimpleDateFormat simpleDateFormat, String sexe){
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = simpleDateFormat;
		this.sexe = sexe;
		}
	public String getNom(){
		return nom;		
	}
	public String getPrenom(){
		return prenom;		
	}
	public SimpleDateFormat getdateNaissance(){
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
	public void setDateNaissance(SimpleDateFormat dateNaissance){
		this.dateNaissance=dateNaissance;
	}
	public void setSexe(String sexe){
		this.sexe=sexe;
	}
}
