package ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import metier.BiblioException;

public class ConfirmRetour {
	public static void afficher() throws BiblioException{
		Label retok;
		Button bok;
		Stage fenetreok = new Stage();
		retok = new Label("Retour confirmé");
		bok = new Button("OKay");
		GridPane grid = new GridPane();
		grid.add(retok, 0, 0);
		grid.add(bok, 0, 1);
		
		Scene scene = new Scene (grid, 400,400);
		fenetreok.setScene(scene);
		fenetreok.setTitle("Retour ok");
		fenetreok.show();
		bok.setOnAction(e -> {fenetreok.close();});

	}
}
