package metier;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * @author S.BUI
 *
 */
public class EmpruntEnCours {

	/** La date de contraction de l'emprunt **/
	private Date dateEmprunt;
	/** L'utilisateur qui a contracté l'emprunt **/
	private Utilisateur utilisateur = new Utilisateur();
	/** L'exemplaire (de Livre) concerné par cet Emprunt **/
	private Exemplaire exemplaire;
	
	/** Objet utilisé pour formatter la Date au format FR **/
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


// CONSTRUCTEURS 	
	
	public EmpruntEnCours() throws BiblioException{
		this(new Utilisateur());
	}
	
	public EmpruntEnCours(Utilisateur utilisateur) throws BiblioException{
		this(new Date(), utilisateur);
	}
	

	public EmpruntEnCours(Date date, Utilisateur utilisateur) throws BiblioException{
		this(date, utilisateur, new Exemplaire());
	}	
		
	public EmpruntEnCours(Date date, Utilisateur utilisateur, Exemplaire exemplaire) throws BiblioException{
		this.setDateEmprunt(date);
		this.setUtilisateur(utilisateur);
		this.setExemplaire(exemplaire);
		
	}
		

// GETTERS SETTERS	
	
	public void setExemplaire(Exemplaire e) throws BiblioException{
		this.exemplaire = e;
		e.setEmpruntConcerne(this);
		if (e.getStatus() == EnumStatusExemplaire.PRETE){
			throw new BiblioException("Exemplaire déjà emprunté");
		} else {
		e.setStatus(EnumStatusExemplaire.PRETE);
		}
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
		if (!utilisateur.getEmpruntsEnCours().contains(this))
		utilisateur.addEmpruntEnCours(this);

	}

	public Utilisateur getUtilisateur(){
		return utilisateur;
	}

// METHODES 

	/** Compare la date actuelle et la date de contraction de l'Emprunt pour savoir si celui-ci est en retard **/
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
	
	
	@Override
	public String toString() {
		return "Date emprunt : " + sdf.format(dateEmprunt) + ", Utilisateur : " + utilisateur.getNom() + ", Exemplaire : " + exemplaire.getIdExemplaire();
	}


	
	

}
