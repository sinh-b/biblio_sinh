package ui;

import java.util.Date;

import dao.ExemplairesDao;
import dao.UtilisateursDAO;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

public class RetourUi {
	public static void afficher() throws BiblioException{
		UtilisateursDAO dao1 = new UtilisateursDAO();
		ExemplairesDao daoex = new ExemplairesDao();
		Utilisateur u1 = dao1.findByKey(2);
		Exemplaire l1 = daoex.findByKey(1);	
		EmpruntEnCours emprunt1 = new EmpruntEnCours(new Date(),u1,l1);
		u1.addEmpruntEnCours(emprunt1);
		TextField tfRetourExemplaire = new TextField();
		Stage fenetreEmprunt = new Stage();
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(40,10,10,10));
		grid.setVgap(40); // separation entre deux element 
		grid.setHgap(10);
		Label lab1 = new Label();
		lab1.setText("Identifiant de l'exemplaire retourné");
		Button b1 = new Button();
		b1.setText("OK");
		GridPane.setConstraints(lab1, 0, 0);
		GridPane.setConstraints(tfRetourExemplaire, 0, 1);
		GridPane.setConstraints(b1, 0, 2);
		grid.getChildren().addAll(lab1,b1,tfRetourExemplaire);
		grid.setAlignment(Pos.CENTER);
		lab1.setFont(new Font (20));
		GridPane.setHalignment(b1,HPos.CENTER);
		Scene scene = new Scene (grid, 400,400);
		fenetreEmprunt.setScene(scene);
		fenetreEmprunt.setTitle("Retour");
		fenetreEmprunt.show();
		
		b1.setOnAction(e -> {
			if(emprunt1.getExemplaire().getIdExemplaire()== Integer.parseInt(tfRetourExemplaire.getText()) ){
				l1.retourExemplaire();
				try {
					ConfirmRetour.afficher();
				} catch (BiblioException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				fenetreEmprunt.close();
			}
			else {
				FailRetour.afficher();
				fenetreEmprunt.close();
			}
		});
			
		
	}
}
