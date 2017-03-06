package ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FailRetour {
	public static void afficher(){
		Label retnok;
		Button bnok;
		Stage fenetrefail = new Stage();
		retnok = new Label("Retour Echoué");
		bnok = new Button("OKay");
		GridPane grid = new GridPane();
		grid.add(retnok, 0, 0);
		grid.add(bnok, 0, 1);
	//	grid.getChildren().addAll(empnok,bnok);
		Scene scene = new Scene (grid, 400,400);
		fenetrefail.setScene(scene);
		fenetrefail.setTitle("fail retour");
		fenetrefail.show();
		bnok.setOnAction(e -> {fenetrefail.close();});
	}
}
