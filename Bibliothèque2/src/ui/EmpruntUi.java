package ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import dao.UtilisateursDAO;
public class EmpruntUi {
	static int i=0;
	public static void afficher(){
		UtilisateursDAO dao1 = new UtilisateursDAO();
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
		while(i<dao1.utilisateurDB.length){
			int x = Integer.parseInt(userTF.getText());
			if(x == (dao1.utilisateurDB [i].getIdUtilisateur())){
				ConfirmEmprunt.afficher();
			}
			else{
				i++;
			}
		}
		FailEmprunt.afficher();
		fenetreEmprunt.close();
	
		
		});
	}
}
