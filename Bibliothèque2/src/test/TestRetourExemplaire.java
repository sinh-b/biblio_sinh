package test;

import java.util.Date;

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
		
		
		System.out.println(u1.getListeEmprunt());
		System.out.println(ex1.getStatus());
		System.out.println(emprunt1.getExemplaire());
		System.out.println("On retourne l'exemplaire \n\n");
		ex1.retourExemplaire();
		System.out.println(u1.getListeEmprunt());
		System.out.println(ex1.getStatus());
		System.out.println(emprunt1.getExemplaire());
		
		
		
	}
}
