package test;

import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.Utilisateur;
import metier.UtilisateursDAO;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		UtilisateursDAO ud1 =new UtilisateursDAO();
		Utilisateur u1 = ud1.findByKey(1);
		EmpruntEnCours e1 = new EmpruntEnCours();
		EmpruntEnCours e2 = new EmpruntEnCours();
		EmpruntEnCours e3 = new EmpruntEnCours();
		EmpruntEnCours e4 = new EmpruntEnCours();
		
u1.addEmpruntEnCours(e1);
u1.addEmpruntEnCours(e2);
u1.addEmpruntEnCours(e3);
u1.addEmpruntEnCours(e4);
System.out.println(u1.isConditionsPretAcceptees());
	}

}
