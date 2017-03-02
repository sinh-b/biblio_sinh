package metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Utilisateur extends Personne{
	
	private ArrayList<EmpruntEnCours> listeEmprunt = new ArrayList<EmpruntEnCours>();
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	// constructeurs
	public Utilisateur() {
		this("nomInconnu","prenomInconnu",new SimpleDateFormat("01/01/1970"),"sexeInconnu","pwdInconnu","pseudonymeInconnu",0);
	}
	public Utilisateur(String nom, String prenom, SimpleDateFormat dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur=idUtilisateur;
		this.pseudonyme=pseudonyme;
		this.pwd=pwd;
	}
	//getter & setter
	public int getIdUtilisateur(){
		return idUtilisateur;		
	}
	public String getPwd(){
		return pwd;		
	}
	public String getPseudonyme(){
		return pseudonyme;		
	}
	
	public void setIdUtilisateur(int idUtilisateur){
		this.idUtilisateur=idUtilisateur;
	}
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	public void setPseudonyme(String pseudonyme){
		this.pseudonyme=pseudonyme;
	}
	// methodes
	public void addEmpruntEnCours(EmpruntEnCours emprunt){
		listeEmprunt.add(emprunt);
		emprunt.setUtilisateur(this);
	}
	public ArrayList<EmpruntEnCours> getEmpruntsEnCours(){
		return listeEmprunt ;
	}
	public int getNbEmpruntsEnCours(){
		return listeEmprunt.length;
	}
}
