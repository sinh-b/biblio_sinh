package test;

import java.util.Date;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Employe;
import metier.Employe.EnumCategorieEmploye;
import metier.EmpruntEnCours;
import metier.Utilisateur;

public class TestEmployeEnRetard {

	public static void main(String[] args) throws BiblioException {
		Employe u1 = new Employe("ratde","bibliotheque",new GregorianCalendar(1985,5,27).getTime(),"femme","admin","adminbiblio",
		8,"1ff5562f7z");
		EmpruntEnCours emprunt1 = new EmpruntEnCours(new GregorianCalendar(2017,1,10).getTime(),u1);
		u1.setEnumCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
		u1.addEmpruntEnCours(emprunt1);
		System.out.println(emprunt1.isEmpruntEnRetard());
		System.out.println(u1.isConditionsPretAcceptees());
	}

}
