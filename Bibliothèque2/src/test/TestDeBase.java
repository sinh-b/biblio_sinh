package test;

import java.util.Date;

import javax.swing.JOptionPane;

import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import metier.Adherent;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestDeBase {

	public static void main(String[] args) throws BiblioException {
	
		
	ExemplairesDao exDao = new ExemplairesDao();
	System.out.println("Récupération de deux exemplaires. Méthode findByKey()");
	Exemplaire ex0 = exDao.findByKey(1);
	Exemplaire ex1 = exDao.findByKey(2);
	System.out.println("Instanciation d'un objet UtilisateursDAO");
	UtilisateursDAO uDao = new UtilisateursDAO();
	System.out.println("Récupération de deux objets Utilisateur. Méthode findByKey");
	Utilisateur ut0 = uDao.findByKey(2);
	Utilisateur ut1 = uDao.findByKey(1);
	
	System.out.println("u0 est-il un Adherent ? :");
	System.out.println(ut0 instanceof Adherent);
	System.out.println("u1 est-il un Employe ? :");
	System.out.println(ut1 instanceof Employe);
	
	
	System.out.println("\n\nInstanciation d'un nouvel emprunt en cours");
	EmpruntEnCours emprunt0 = new EmpruntEnCours(new Date(), ut0, ex0);
	System.out.println("On vérifie l'Utilisateur associé à l'EmpruntEnCours : ");
	System.out.println(emprunt0.getUtilisateur().getPrenom());
	System.out.println("On vérifie l'Exemplaire associé à l'EmpruntEnCours ");
	System.out.println(emprunt0.getExemplaire());
	
	System.out.println("\n\nInstanciation d'un nouvel emprunt en cours");
	EmpruntEnCours emprunt1 = new EmpruntEnCours(new Date(), ut1, ex1);
	System.out.println("On vérifie l'Utilisateur associé à l'EmpruntEnCours : ");
	System.out.println(emprunt1.getUtilisateur().getPrenom());
	System.out.println("On vérifie l'Exemplaire associé à l'EmpruntEnCours ");
	System.out.println(emprunt1.getExemplaire());
	
	
	System.out.println("\n\nListe des emprunts de l'Utilisateur ut0");
	System.out.println(ut0.getListeEmprunt());
	System.out.println("\nListe des emprunts de l'Utilisateur ut1");
	System.out.println(ut1.getListeEmprunt());
	
	
	

	}

}
