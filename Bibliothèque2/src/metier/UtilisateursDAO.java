package metier;


import java.util.GregorianCalendar;

public class UtilisateursDAO {
	
	

	 private static Utilisateur [] utilisateurDB = {
			 new Utilisateur("Cover","Harry",new GregorianCalendar(2000,1,15).getTime(),"Homme","aaa","bbb",1),
			 new Adherent("Atend","Charles",new GregorianCalendar(1990,1,14).getTime(),"Homme","aaa","bbb",2,"0607345815"),
			 new Utilisateur("Sal","Sylvie",new GregorianCalendar(1985,5,27).getTime(),"Femme","aaa","bbb",3),
			 new Utilisateur("Quiaperdusonchat","Michele",new GregorianCalendar(1962,9,29).getTime(),"femme","aaa","bbb",4)
	 };
	
	 
	public Utilisateur findByKey(int idUtilisateur){
		for(Utilisateur utilisateur : utilisateurDB){
			if(utilisateur.getIdUtilisateur()==(idUtilisateur)){
				return utilisateur;
			}
		}
		return null;
	}
	// findByName
}


