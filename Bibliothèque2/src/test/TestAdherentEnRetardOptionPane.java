package test;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import metier.Adherent;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentEnRetardOptionPane {

	public static void main(String[] args) throws BiblioException {

		UtilisateursDAO uDao = new UtilisateursDAO();
		ExemplairesDao exDao = new ExemplairesDao();

		Utilisateur u1 = new Utilisateur();
		Exemplaire ex1 = new Exemplaire();


		do {
			String s = "";
			s = JOptionPane.showInputDialog("Entrez un numéro d'adhérent");
			// Clé Adhérent dans la DAO = 2
			u1 = uDao.findByKey(Integer.parseInt(s));
			if (u1 instanceof Adherent == false){
				JOptionPane.showMessageDialog(null, "Erreur, numéro inconnu");
			}

		} while (u1 instanceof Adherent == false);

		if (u1 instanceof Adherent)
			JOptionPane.showMessageDialog(null, "Vous êtes connectés en tant qu'adhérent");

		String s2 = JOptionPane.showInputDialog("Entrez un numéro d'exemplaire");
		ex1 = exDao.findByKey(Integer.parseInt(s2));

		EmpruntEnCours empruntEnRetard = new EmpruntEnCours(new GregorianCalendar(2017,0,1).getTime(), u1, exDao.findByKey(5));

		
		EmpruntEnCours emprunt = new EmpruntEnCours();
		try {
		
			
			emprunt.setUtilisateur(u1);
			emprunt.setExemplaire(ex1);

		} catch (BiblioException e) {
			JOptionPane.showMessageDialog(null, "Erreur d'emprunt. Adressez vous à un responsable");

		}
		
		
		
		








	}

}
