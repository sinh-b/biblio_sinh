package test;

import java.util.Date;
import java.util.GregorianCalendar;

import dao.UtilisateursDAO;
import metier.BiblioException;
import metier.Employe;
import metier.EnumCategorieEmploye;
import metier.EmpruntEnCours;
import metier.Utilisateur;

public class TestEmployeEnRetard {

	public static void main(String[] args) throws BiblioException {
		UtilisateursDAO ud1 =new UtilisateursDAO();
		Utilisateur u1 = ud1.findByKey(1);
		EmpruntEnCours emprunt1 = new EmpruntEnCours(new GregorianCalendar(2017,1,10).getTime(),u1);
		u1.addEmpruntEnCours(emprunt1);
		System.out.println(emprunt1.isEmpruntEnRetard());
		System.out.println(u1.isConditionsPretAcceptees());
	}
	
}
