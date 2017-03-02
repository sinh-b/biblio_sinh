package metier;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur extends Personne{
	
	private ArrayList<EmpruntEnCours> listeEmprunt = new ArrayList<EmpruntEnCours>();
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	
	// constructeurs
	public Utilisateur() {
		this("nomInconnu","prenomInconnu",new Date(0),"sexeInconnu","pwdInconnu","pseudonymeInconnu",0);
	}
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur=idUtilisateur;
		this.pseudonyme=pseudonyme;
		this.pwd=pwd;
	}
	//getter & setter
	
	
	
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
	// methodes
	
	public boolean isConditionsPretAcceptees(){
		return true;
	}
	
	
	
	public void addEmpruntEnCours(EmpruntEnCours emprunt) throws BiblioException{
		listeEmprunt.add(emprunt);
		emprunt.setUtilisateur(this);
	}
	public ArrayList<EmpruntEnCours> getEmpruntsEnCours(){
		return listeEmprunt ;
	}
	public int getNbEmpruntsEnCours(){
		return listeEmprunt.size();
	}
	
	@Override
	public String toString() {
		
		return "Date naissance : " + Personne.df.format(getdateNaissance());
	}
}
