package test;

import java.util.Date;
import java.util.GregorianCalendar;
import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentEnRetard {

	public static void main(String[] args) throws BiblioException{
	
	System.out.println("Instanciation objets DAO ExemplairesDao et UtilisateursDAO");
	ExemplairesDao exDao = new ExemplairesDao();
	UtilisateursDAO uDao = new UtilisateursDAO();
	System.out.println("Récupération objet Utilisateur et deux objets Exemplaire");
	Utilisateur utilisateur = uDao.findByKey(2);
	Exemplaire ex1 = exDao.findByKey(1);
	Exemplaire ex2 = exDao.findByKey(2);
	System.out.println("Création d'un emprunt avec une date en retard");
	EmpruntEnCours emprunt1 = new EmpruntEnCours(new GregorianCalendar(2017,1,2).getTime(), utilisateur, ex1);
	System.out.println("Instanciation d'un nouvel emprunt");
	EmpruntEnCours emprunt2 = new EmpruntEnCours(new Date(), utilisateur, ex2);
		
	}
	
}
