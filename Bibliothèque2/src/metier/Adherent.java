package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adherent extends Utilisateur{
	
	private String telephone;
	private static final int nbMaxPrets = 3;
	private static final int dureeMaxPrets = 15;
	
	
	// constructeur
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, String pwd, String pseudonyme, int idUtilisateur,String telephone) throws BiblioException{
		super(nom, prenom, dateNaissance, sexe, pwd, pseudonyme, idUtilisateur);
		this.setTelephone(telephone);
	}
	
	public Adherent() throws BiblioException{
		this("nomInconnu","prenomInconnu",new Date(0),"sexeInconnu","pwdInconnu","pseudoInconnu",0, "noTelInconnu");
	}
	
	
	
	
	
	// getter & setter

	
	public String getTelephone(){
		return telephone;
	}
	public static int getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	public void setTelephone(String telephone)throws BiblioException {

		if(telephone.length()!=10 ){// biblioException??
			throw new BiblioException("Le numero de telephone ne contient pas le bon nombre de caractères");
		}
		else if(telephone.matches(".*[a-zA-Z].*")){
			throw new BiblioException("Le numero de telephone ne peut pas contenir de lettres");
		}
		else{
			System.out.println("chaine OK");
		}

	}
	
	
	
	
	//methodes

	@Override
	public boolean isConditionsPretAcceptees(){

		if (getNbRetards() > 0)
			return false;
		else if (getListeEmprunt().size() >= nbMaxPrets)
			return false;
		else
			return true;

	}



	public int getNbRetards(){
		int i = 0;
		for (EmpruntEnCours e : getListeEmprunt()){
			if (e.isEmpruntEnRetard() == true)	
				i++;
		}
		return i;
	}




}
