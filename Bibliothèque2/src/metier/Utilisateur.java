package metier;

import java.util.ArrayList;
import java.util.Date;
/**
 * 
 * @author A.CONSEIL
 *
 */
public class Utilisateur extends Personne{
	
	/** La liste des emprunts en cours d'un Utilisateur */
	private ArrayList<EmpruntEnCours> listeEmprunt = new ArrayList<EmpruntEnCours>();
	
	/** L'identifiant d'un Utilisateur **/
	private int idUtilisateur;
	
	/** Le mot de passe d'un Utilisateur **/
	private String pwd;
	
	/** Le pseudonyme d'un Utilisateur **/
	private String pseudonyme;
	
	
// CONSTRUCTEURS 
	
	public Utilisateur() {
		this("Nom Inconnu","Prenom Inconnu",new Date(0),"Sexe Inconnu","Mot de passe Inconnu","Pseudonyme Inconnu",0);
	}
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur) {
		super(nom, prenom, dateNaissance, sexe);
		this.setIdUtilisateur(idUtilisateur);
		this.setPseudonyme(pseudonyme);
		this.setPwd(pwd);
	}
	
	
// GETTERS SETTERS 
	
	public int getIdUtilisateur(){
		return idUtilisateur;		
	}
	public ArrayList<EmpruntEnCours> getListeEmprunt() {
		return listeEmprunt;
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
	
	public ArrayList<EmpruntEnCours> getEmpruntsEnCours(){
		return listeEmprunt ;
	}
	public int getNbEmpruntsEnCours(){
		return listeEmprunt.size();
	}
	
	
	
// METHODES

	
	public boolean isConditionsPretAcceptees(){
		return true;
	}

	/** Ajouter un emprunt dans la liste des EmpruntsEnCours d'un Utilisateur **/
	public void addEmpruntEnCours(EmpruntEnCours emprunt) throws BiblioException{
		listeEmprunt.add(emprunt);
		emprunt.setUtilisateur(this);
	}
	
	public void removeEmpruntEnCours(EmpruntEnCours emprunt) {
		getListeEmprunt().remove(emprunt);
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Pseudonyme: " + pseudonyme + ", pwd: " + pwd + ", idUtilisateur: " + idUtilisateur;
	}
}
