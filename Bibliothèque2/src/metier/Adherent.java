package metier;


import java.util.Date;

/**
 *
 * @author A.CONSEIL
 *
 */

public class Adherent extends Utilisateur{
	

	/*** Le num�ro de t�l�phone de l'adh�rent*/
	private String telephone;
	/*** Le nombre de pr�ts simultan�s maximum.*/
	private static final int nbMaxPrets = 3;
	/*** La dur�e maximum d'un emprunt (en jours) avant qu'il ne soit consid�r� en retard
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
//			throw new BiblioException("Le numero de telephone ne contient pas le bon nombre de caract�res");
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
	 * M�thode permettant de v�rifier qu'un utilisateur est en droit d'effectuer un emprunt.
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
 * M�thode permettant de conna�tre le nombre d'emprunts en cours, dont la date de restitution est d�pass�e.
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
