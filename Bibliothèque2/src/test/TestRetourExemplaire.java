package test;

import java.util.Date;
import java.util.GregorianCalendar;

import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestRetourExemplaire {

	public static void main (String[] args) throws BiblioException{
		UtilisateursDAO uDao = new UtilisateursDAO();
		Utilisateur u1 = uDao.findByKey(2);
		ExemplairesDao exDao = new ExemplairesDao();
		Exemplaire ex1 = exDao.findByKey(1);
		EmpruntEnCours emprunt1 = new EmpruntEnCours(new Date(), u1, ex1);
		emprunt1.setDateEmprunt(new GregorianCalendar(2017,2,1).getTime());
		
		
		System.out.println("Liste des emprunts de l'utilisateur \n" + u1.getListeEmprunt());
//		System.out.println("\n\nOn vérifie que l'emprunt connait bien son exemplaire \n" +
//		emprunt1.getExemplaire());
		
		System.out.println("\n\nOn retourne l'exemplaire et on vérifie la liste des emprunts");
		ex1.retourExemplaire();
		System.out.println("\n\nListe des emprunts de l'utilisateur : \n" + u1.getListeEmprunt());
		System.out.println("On vérifie le statut de l'exemplaire : \n" + emprunt1.getExemplaire());
		
		
		
		
	}
}
