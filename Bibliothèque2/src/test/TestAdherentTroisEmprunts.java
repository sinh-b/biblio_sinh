package test;

import java.util.Date;
import java.util.GregorianCalendar;

import dao.UtilisateursDAO;
import metier.Adherent;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Utilisateur;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		UtilisateursDAO ud1 =new UtilisateursDAO();
		Utilisateur a1 = ud1.findByKey(2);
		EmpruntEnCours e1 = new EmpruntEnCours();
		EmpruntEnCours e2 = new EmpruntEnCours();
		EmpruntEnCours e3 = new EmpruntEnCours();
		EmpruntEnCours e4 = new EmpruntEnCours();
		
a1.addEmpruntEnCours(e1);
a1.addEmpruntEnCours(e2);
a1.addEmpruntEnCours(e3);
a1.addEmpruntEnCours(e4);
System.out.println(a1.isConditionsPretAcceptees());
	}

}
