package ui;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ConfirmEmprunt {

	public static void afficher(){
		System.out.println();
		Label empok;
		Button bok;
		Stage fenetreok = new Stage();
		empok = new Label("Emprunt confirmé");
		bok = new Button("OKay");
		GridPane grid = new GridPane();
		grid.add(empok, 0, 0);
		grid.add(bok, 0, 1);
		grid.setVgap(30);
		grid.setAlignment(Pos.CENTER);
		
		//grid.getChildren().addAll(empok,bok);
		Scene scene = new Scene (grid, 400,400);
		empok.setFont(new Font (25));
		GridPane.setHalignment(bok,HPos.CENTER);
		fenetreok.setScene(scene);
		fenetreok.setTitle("Emprunt ok");
		fenetreok.setResizable(true);
		fenetreok.show();
		bok.setOnAction(e -> {fenetreok.close();});
	}
}
