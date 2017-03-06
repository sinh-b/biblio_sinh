package metier;

import java.util.Date;


/**
 * 
 * @author A.CONSEIL
 *
 */
public class Employe extends Utilisateur {

	/**
	 * Le code de matricule d'un Employé
	 */
	private String codeMatricule;
	
	/**
	 * La catégorie à laquelle appartient un Employé
	 */
	private EnumCategorieEmploye EnumCategorieEmploye; 
	
	
	
// CONSTRUCTEURS	
	
	public Employe(){
		this("nomInconnu","prenomInconnu",new Date(0),"sexeInconnu","pwdInconnu","pseudonymeInconnu", 0,"codeMatriculeInconnu");
	}
	
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur, String codeMatricule) {
		super(nom, prenom, dateNaissance, sexe, pwd, pseudonyme, idUtilisateur);
	}
	
	
// GETTERS SETTERS	
	
	public String getCodeMatricule(){
		return codeMatricule;
	}
	
	public void setCodeMatricule(String codeMatricule){
		this.codeMatricule=codeMatricule;
	}
	
	public void setEnumCategorieEmploye(EnumCategorieEmploye e1){
		this.EnumCategorieEmploye = e1;
	} // quand appel du setter : setEnumCategorieEmploye(EnumCategorieEmploye.parametre);
	
	public EnumCategorieEmploye getEnumCategorieEmploye(){
		return EnumCategorieEmploye;	
	}

	
// METHODES	
	
	@Override
	public String toString() {
		return super.toString() + ", Code Matricule : " + codeMatricule + ", Catégorie employé : " + 
		EnumCategorieEmploye;
	}
	
	
	
}
