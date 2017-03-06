package ui;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
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
		grid.setVgap(30);
		grid.setAlignment(Pos.CENTER);
		retok.setFont(new Font (25));
		GridPane.setHalignment(bok,HPos.CENTER);
		Scene scene = new Scene (grid, 400,400);
		fenetreok.setScene(scene);
		fenetreok.setTitle("Retour ok");
		fenetreok.show();
		bok.setOnAction(e -> {fenetreok.close();});

	}
}
