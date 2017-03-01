package metier;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntEnCours {

	private Date dateEmprunt;
	private Utilisateur utilisateur = new Utilisateur();
	private Exemplaire exemplaire;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	public EmpruntEnCours() throws BiblioException{
		this(new Utilisateur());
	}


	public EmpruntEnCours(Utilisateur utilisateur) throws BiblioException{
		this(new Date(), utilisateur);
	}
	
	public EmpruntEnCours(Date date, Utilisateur utilisateur) throws BiblioException{
		this.setDateEmprunt(date);
		this.setUtilisateur(utilisateur);
	}



	public boolean isEmpruntEnRetard (){
		GregorianCalendar aujourdhui = new GregorianCalendar();
		aujourdhui.add(Calendar.DAY_OF_YEAR, -Adherent.getDureeMaxPrets());
		Date dateMinSansRetard = aujourdhui.getTime();

		if (dateMinSansRetard.after(this.getDateEmprunt())){
			return true;
		}else {
			return false;
		}
	}

	
	
	
	
	
	

	public void setExemplaire(Exemplaire e){
		this.exemplaire = e;
		e.setEmpruntConcerne(this);
	}

	public Exemplaire getExemplaire(){
		return exemplaire;
	}


	public void setDateEmprunt(Date d){
		this.dateEmprunt = d;
	}

	public Date getDateEmprunt(){
		return dateEmprunt;
	}

	public void setUtilisateur(Utilisateur utilisateur) throws BiblioException{
		this.utilisateur = utilisateur;
		if (!utilisateur.getEmpruntEnCours().contains(this))
		utilisateur.addEmpruntEnCours(this);

	}

	public Utilisateur getUtilisateur(){
		return utilisateur;
	}


	@Override
	public String toString() {
		return "Date emprunt : " + sdf.format(dateEmprunt) + ", Utilisateur : " + utilisateur.getNom() + ", Exemplaire : " + exemplaire.getIdExemplaire();
	}


	
	

}
