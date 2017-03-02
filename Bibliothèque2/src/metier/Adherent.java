package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adherent extends Utilisateur{
	private String telephone;
	final int nbMaxPrets = 3;
	final int dureeMaxPrets = 15;
	// constructeur
	public Adherent(String nom, String prenom, SimpleDateFormat dateNaissance, String sexe, String pwd, String pseudonyme,
			int idUtilisateur,String telephone) {
		super(nom, prenom, dateNaissance, sexe, pwd, pseudonyme, idUtilisateur);
		this.telephone=telephone;
	}
	public Adherent(){
		this("nomInconnu","prenomInconnu",new SimpleDateFormat("01/01/1970"),"sexeInconnu","pwdInconnu","pseudoInconnu",0, "noTelInconnu");
	}
	// getter & setter
	public String getTelephone(){
		return telephone;
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
	public boolean isConditionsPretAcceptees(){
		if(getNbEmpruntsEnCours()>=3||EmpruntEnCours.isEmpruntEnRetard==true){
			return false;
		}
		return true;
	}
	public int getNbRetards(){
		return
	}
	
	// test num tel
	public static void main(String[] args) {
		Adherent e1 = new Adherent("Harry","Cover",new SimpleDateFormat("10/10/2010"),"Homme","aaa","bbb",15,"x");
		Adherent e2 = new Adherent("Harry","Cover",new SimpleDateFormat("10/10/2010"),"Homme","aaa","bbb",15,"x");
		Adherent e3 = new Adherent("Harry","Cover",new SimpleDateFormat("10/10/2010"),"Homme","aaa","bbb",15,"x");
		try {
			e1.setTelephone("141");
		} catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(e1.getTelephone());
		try {
			e2.setTelephone("a620777311");
		} catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(e2.getTelephone());
		try {
			e3.setTelephone("0620777311");
		} catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(e3.getTelephone());
		Adherent x = new Adherent();
	}

}
