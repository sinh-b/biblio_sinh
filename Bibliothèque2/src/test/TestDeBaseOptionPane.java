package test;

import java.util.Date;

import javax.swing.JOptionPane;

import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestDeBaseOptionPane {

	public static void main(String[] args) throws BiblioException {
	
	UtilisateursDAO uDao = new UtilisateursDAO();
	ExemplairesDao eDao = new ExemplairesDao();
	String s1 = JOptionPane.showInputDialog("Entrez un numéro d'adhérent");
	Utilisateur u1 = uDao.findByKey(Integer.parseInt(s1));
	String s2 = JOptionPane.showInputDialog("Entrez un idExemplaire");
	Exemplaire ex1 = eDao.findByKey(Integer.parseInt(s2));
	EmpruntEnCours emprunt1 = new EmpruntEnCours(new Date(), u1, ex1);
	JOptionPane.showMessageDialog(null, "Emprunt de l'exemplaire " + ex1.getIsbn() + " à l'Utilisateur n°"
			+ u1.getIdUtilisateur() + " confirmé.");
	
	
	
	
		
	}

}
