package metier;


import java.util.Date;

/**
 *
 * @author A.CONSEIL
 *
 */

public class Adherent extends Utilisateur{
	

	/*** Le numéro de téléphone de l'adhérent*/
	private String telephone;
	/*** Le nombre de prêts simultanés maximum.*/
	private static final int nbMaxPrets = 3;
	/*** La durée maximum d'un emprunt (en jours) avant qu'il ne soit considéré en retard
	 * @see isEmpruntEnRetard
	 */
	private static final int dureeMaxPrets = 15;
	
// COSNTRUCTEURS	

	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur,String telephone){
		super(nom, prenom, dateNaissance, sexe, pwd, pseudonyme, idUtilisateur);
		this.setTelephone(telephone);
	}
	
	
	public Adherent(){
		this("nomInconnu","prenomInconnu",new Date(0),"sexeInconnu","pwdInconnu","pseudoInconnu",0, "noTelInconnu");
	}
	
	
// GETTERS & SETTERS 	
	

	public String getTelephone(){
		return telephone;
	}
	
	public static int getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
		}
//		if(telephone.length()!=10 ){// biblioException??
//			throw new BiblioException("Le numero de telephone ne contient pas le bon nombre de caractéres");
//		}
//		else if(telephone.matches(".*[a-zA-Z].*")){
//			throw new BiblioException("Le numero de telephone ne peut pas contenir de lettres");
//		}
//		else{
//			System.out.println("chaine OK");
//		}

	
	
	
	
	
// METHODES
	
	/** Ajouter un emprunt dans la liste des EmpruntsEnCours d'un Utilisateur **/
	public void addEmpruntEnCours(EmpruntEnCours emprunt) throws BiblioException{
		if (isConditionsPretAcceptees() == true){
		getListeEmprunt().add(emprunt);
		emprunt.setUtilisateur(this);
		}else {
			throw new BiblioException("Conditions emprunts non remplies");
		}
		
	}
	

	
	

	/**
	 * Méthode permettant de vérifier qu'un utilisateur est en droit d'effectuer un emprunt.
	 */
	@Override
	public boolean isConditionsPretAcceptees(){

		if (getNbRetards() > 0)
			return false;
		else if (getListeEmprunt().size() >= nbMaxPrets)
			return false;
		else
			return true;
	}


/**
 * Méthode permettant de connaître le nombre d'emprunts en cours, dont la date de restitution est dépassée.
 * @return Le nombre de retards sur les emprunts tenus par un Utilisateur
 */
	public int getNbRetards(){
		int i = 0;
		for (EmpruntEnCours e : getListeEmprunt()){
			if (e.isEmpruntEnRetard() == true)	
				i++;
		}
		return i;
	}




}
