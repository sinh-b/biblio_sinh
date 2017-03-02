package test;

import java.util.Date;
import java.util.GregorianCalendar;

import metier.Adherent;
import metier.BiblioException;
import metier.EmpruntEnCours;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) throws BiblioException {
		Adherent a1 = new Adherent("Arya", "Stark", new GregorianCalendar(2000,5,27).getTime(), "Femme", "pwd", "pseudonyme",
				15,"0620777311");
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
