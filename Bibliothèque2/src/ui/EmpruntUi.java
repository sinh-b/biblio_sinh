package ui;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;

import java.util.Date;

import dao.ExemplairesDao;
import dao.UtilisateursDAO;
public class EmpruntUi{
	static int i=0;
	static int j=0;
	static boolean boolex=false;
	public static void afficher(){
		UtilisateursDAO dao1 = new UtilisateursDAO();
		ExemplairesDao daoex = new ExemplairesDao();
		Label labelIdAdh;
		Label labelIdEx;
		TextField userTF;
		TextField exemplaireTF;
		Button OKButton;
		
		Stage fenetreEmprunt = new Stage();
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(40,10,10,10));
		grid.setVgap(40); // separation entre deux element 
		grid.setHgap(10);
		
		// définition du label et placement de celui ci dans le gridPane 
		labelIdAdh = new Label ("Identifiant Adherent : ");
		GridPane.setConstraints(labelIdAdh,0,0);

		// creation label password
		labelIdEx = new Label ("identifiant exemplaire : ");
		GridPane.setConstraints(labelIdEx,0,1);
		
		// creation textfield user
		userTF = new TextField("Spyca"); // possibilité de mettre un nom
		GridPane.setConstraints(userTF,1,0);
		
		//creation textfield mdp
		exemplaireTF= new TextField(); 
		exemplaireTF.setPromptText("Exemplaire");
		GridPane.setConstraints(exemplaireTF,1,1);
		//exemplaireTF.getText();
		OKButton=new Button("OK");
		GridPane.setConstraints(OKButton, 1,2);
		
		grid.getChildren().addAll(labelIdAdh,labelIdEx,userTF,exemplaireTF,OKButton);
		
		Scene scene = new Scene (grid, 400,400);
		fenetreEmprunt.setScene(scene);
		fenetreEmprunt.setTitle("Emprunter");
		fenetreEmprunt.show();
		OKButton.setOnAction(e -> {
			Exemplaire exe1 = null;
			boolean error = false;
			int y=0;
			int x=0;
			try{
			 y =Integer.parseInt(exemplaireTF.getText());
			 x = Integer.parseInt(userTF.getText());
			}catch(	NumberFormatException ex){
				ex.printStackTrace();
				AlertBox.afficher("Mauvais format" , "Vous devez entrer un nombre !!");
				error=true;
			}
		
			EmpruntEnCours emp1;
			while(j<daoex.exemplairesDB.length){
				if(y==daoex.exemplairesDB[j].getIdExemplaire()){
					exe1 = daoex.findByKey(y);
					boolex=true;
					break;
				}
				else if(j==daoex.exemplairesDB.length-1){
					boolex=false;
					//FailEmprunt.afficher();
					//fenetreEmprunt.close();
					break;
				}
				else{
					j++;
				}
			}
			//System.out.println(x);
			while(i<dao1.utilisateurDB.length){
				if(x == (dao1.utilisateurDB [i].getIdUtilisateur())&&boolex==true&&error==false){
					Utilisateur u1 = dao1.findByKey(x);
						try{
							EmpruntEnCours e1 = new EmpruntEnCours(new Date(), u1, exe1);
							//dao1.utilisateurDB[i].addEmpruntEnCours(emp1 = new EmpruntEnCours());
							//emp1.setUtilisateur(dao1.utilisateurDB[i]);
							//emp1.setExemplaire(daoex.exemplairesDB[j]);
							ConfirmEmprunt.afficher();
							fenetreEmprunt.close();
							break;
						} catch (BiblioException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
							FailEmprunt.afficher();
							fenetreEmprunt.close();
							break;
						}
						
					
					
				}
				else if((i==dao1.utilisateurDB.length-1||boolex==false )&&error ==false){
					FailEmprunt.afficher();
					fenetreEmprunt.close();
					break;
				}
				else{
					i++;
				}
			}
			
		});
	}
}
