package ui;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class FailEmprunt {
	public static void afficher(){
		Label empnok;
		Button bnok;
		Stage fenetrefail = new Stage();

		empnok = new Label("Emprunt Echoué");
		empnok.setFont(new Font(40));
		empnok.setAlignment(Pos.TOP_CENTER);
		bnok = new Button("OKay");
		bnok.setAlignment(Pos.CENTER);
		GridPane grid = new GridPane();
		grid.add(empnok, 0, 0);
		grid.add(bnok, 0, 1);
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(30);
		GridPane.setHalignment(bnok,HPos.CENTER);
	//	grid.getChildren().addAll(empnok,bnok);
		Scene scene = new Scene (grid, 400,400);
		fenetrefail.setScene(scene);
		fenetrefail.setTitle("fail emprunt");
		fenetrefail.setResizable(true);
		fenetrefail.show();
		bnok.setOnAction(e -> {fenetrefail.close();});
	}
}
