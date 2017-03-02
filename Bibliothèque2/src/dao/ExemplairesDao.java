package dao;

import java.util.ArrayList;
import java.util.Date;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;

/**
 * 
 * @author S.BUI
 *
 */
public class ExemplairesDao {

	

private static Exemplaire[] exemplairesDB = {
		new Exemplaire(1, new Date(), EnumStatusExemplaire.DISPONIBLE, "975812"),
		new Exemplaire(2, new Date(), EnumStatusExemplaire.DISPONIBLE, "975879"),
		new Exemplaire(3, new Date(), EnumStatusExemplaire.PRETE, "975812"),
		new Exemplaire(4, new Date(), EnumStatusExemplaire.DISPONIBLE, "975987"),
		new Exemplaire(5, new Date(), EnumStatusExemplaire.SUPPRIME, "975787"),
		new Exemplaire(6, new Date(), EnumStatusExemplaire.DISPONIBLE, "975417")};


/**
 * 
 * @param idExemplaire l'identifiant permettant de trouver un exemplaire dans la base de données.
 * @return Un Exemplaire en fonction de l'identifiant passé en paramètre
 * 
 */
public Exemplaire findByKey(int idExemplaire){
	for (Exemplaire exemplaire : exemplairesDB){
		if (exemplaire.getIdExemplaire() == idExemplaire)
			return exemplaire;
	}
	return null;	
}


/**
 * 
 * @param status Le statut d'exemplaires que l'on cherche à trouver (DISPONIBLE, PRETE, SUPPRIME)
 * @return La collection (ArrayList) correspondant à tous les exemplaires dont le statut est celui passé en paramètres.
 */
public ArrayList<Exemplaire> findByStatus(EnumStatusExemplaire status){
	ArrayList<Exemplaire> al = new ArrayList<Exemplaire>();
	for (Exemplaire ex : exemplairesDB){
		if ( ex.getStatus().equals(status))
			al.add(ex);
	}
	return al;
	
}




}