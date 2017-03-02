package metier;

import java.util.Date;

public class Employe extends Utilisateur {

	private String codeMatricule;
	private EnumCategorieEmploye EnumCategorieEmploye; 
	
	public Employe(){
		this("nomInconnu","prenomInconnu",new Date(0),"sexeInconnu","pwdInconnu","pseudonymeInconnu",
			0,"codeMatriculeInconnu");
	}
	
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme,
			int idUtilisateur, String codeMatricule) {
		super(nom, prenom, dateNaissance, sexe, pwd, pseudonyme, idUtilisateur);
		
	}
	public String getCodeMatricule(){
		return codeMatricule;
	}
	public void setCodeMatricule(String codeMatricule){
		
		this.codeMatricule=codeMatricule;
	}
	
	public void setEnumCategorieEmploye(EnumCategorieEmploye e1){
		this.EnumCategorieEmploye=e1;
	} // quand appel du setter : setEnumCategorieEmploye(EnumCategorieEmploye.parametre);
	public EnumCategorieEmploye getEnumCategorieEmploye(){
		return EnumCategorieEmploye;	
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Code Matricule : " + codeMatricule + ", Catégorie employé : " + 
		EnumCategorieEmploye;
	}
	
	
	
}
