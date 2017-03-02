package test;

import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		Employe u1 = new Employe("ratde","bibliotheque",new GregorianCalendar(1985,5,27).getTime(),"femme","admin","adminbiblio",
				8,"1ff5562f7z");
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
