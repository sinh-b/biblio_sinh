package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntArchive {

	private Date dateRestitutionEff;
	private Date dateEmprunt;
	private Exemplaire exemplaire;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public EmpruntArchive(Exemplaire exemplaire, Date dateEmprunt, Date dateRestitution){
		this.setExemplaire(exemplaire);
		this.setDateEmprunt(dateEmprunt);
		this.setDateRestitutionEff(dateRestitution);
	}
	
	public EmpruntArchive(){
		this(new Exemplaire(), new Date(0), new Date(0));
	}
	
	
	
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
	
	@Override
	public String toString() {
		return "[EmpruntArchivé] Exemplaire concerné : " + exemplaire.getIsbn() + ", Date restitution effective : "
				+ sdf.format(dateRestitutionEff) + ", Date emprunt : " + sdf.format(dateEmprunt);
	}
	
	
	
	
}
