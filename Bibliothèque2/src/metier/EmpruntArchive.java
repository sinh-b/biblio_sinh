package metier;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author S.BUI
 *
 */
public class EmpruntArchive {

	/** La date de restitution effective **/
	private Date dateRestitutionEff;
	/** La date à laquelle l'EmpruntArchive a été contracté **/
	private Date dateEmprunt;
	/** L'Exemplaire (le Livre) auquel se rattache un emprunt **/
	private Exemplaire exemplaire;
	/** Objet utilisé pour afficher les date au format standard FR **/
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
// CONSTRUCTEURS 	
	
	public EmpruntArchive(Exemplaire exemplaire, Date dateEmprunt, Date dateRestitution){
		this.setExemplaire(exemplaire);
		this.setDateEmprunt(dateEmprunt);
		this.setDateRestitutionEff(dateRestitution);
	}
	
	
	public EmpruntArchive(){
		this(new Exemplaire(), new Date(0), new Date(0));
	}
	
// GETTERS SETTERS	
	
	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}
	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	
// METHODES	
	
	@Override
	public String toString() {
		return "Exemplaire concerné : " + exemplaire.getIdExemplaire() + ", Date restitution effective : "
				+ sdf.format(dateRestitutionEff) + ", Date emprunt : " + sdf.format(dateEmprunt);
	}
	
	
	
	
}
