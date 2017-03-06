package ui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	public static void afficher(String titre, String message){
		Stage fenetreAlerte = new Stage();
		fenetreAlerte.initModality(Modality.APPLICATION_MODAL);
		// permet à la fenetre d'obliger l'utilisateur à traiter cette page avant de pouvoir retourner sur la page principale
		fenetreAlerte.setTitle(titre);
		Label l1 = new Label(message);
		l1.setFont(new Font(25));
		Button closeButton = new Button("fermer");
		closeButton.setOnAction(e -> fenetreAlerte.close());
		// creer la fenetre, un bouton fermer et une action au clic du bouton
		VBox layout = new VBox(10);
		layout.getChildren().addAll(l1,closeButton);
		layout.setAlignment(Pos.CENTER);
		//defini la position de la fenetre par rapport à l ecran
		
		Scene scene = new Scene(layout);
		fenetreAlerte.setScene(scene);
		fenetreAlerte.show();
		
	
	
	
	}
}
