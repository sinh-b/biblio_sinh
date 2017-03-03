package ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConfirmEmprunt {

	public static void afficher(){
		Label empok;
		Button bok;
		Stage fenetreok = new Stage();
		empok = new Label("Emprunt confirmé");
		bok = new Button("OKay");
		GridPane grid = new GridPane();
		grid.add(empok, 0, 0);
		grid.add(bok, 0, 1);
		grid.getChildren().addAll(empok,bok);
		Scene scene = new Scene (grid, 400,400);
		fenetreok.setScene(scene);
		fenetreok.setTitle("Emprunt ok");
		fenetreok.show();
		bok.setOnAction(e -> {fenetreok.close();});
	}
}
