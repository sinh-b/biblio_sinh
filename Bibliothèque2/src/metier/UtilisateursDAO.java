package metier;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class UtilisateursDAO {
	 private static Utilisateur [] utilisateurDB = {
			 new Utilisateur("Cover","Harry",new GregorianCalendar(2000,1,15).getTime(),"Homme","aaa","bbb",1),
			 new Utilisateur("Atend","Charles",new SimpleDateFormat("11/05/1990"),"Homme","aaa","bbb",2),
			 new Utilisateur("Sal","Sylvie",new SimpleDateFormat("16/12/1970"),"Femme","aaa","bbb",3),
			 new Utilisateur("Quiaperdusonchat","Michele",new SimpleDateFormat("04/04/1962"),"femme","aaa","bbb",4)
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
