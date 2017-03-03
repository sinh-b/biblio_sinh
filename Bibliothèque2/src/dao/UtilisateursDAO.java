package dao;


import java.util.GregorianCalendar;

import metier.Adherent;
import metier.Employe;
import metier.Utilisateur;

/**
 * 
 * @author A.CONSEIL
 *
 */
public class UtilisateursDAO {
	
	

	 public static Utilisateur [] utilisateurDB = {
			 new Employe("Radeux","Bibliotheque",new GregorianCalendar(1985,5,27).getTime(),"femme","admin","adminbiblio",1,"1ff5562f7z"),			 
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


