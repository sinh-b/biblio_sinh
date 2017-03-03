package ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FailEmprunt {
	public static void afficher(){
		Label empnok;
		Button bnok;
		Stage fenetrefail = new Stage();
		empnok = new Label("Emprunt Echoué");
		bnok = new Button("OKay");
		GridPane grid = new GridPane();
		grid.add(empnok, 0, 0);
		grid.add(bnok, 0, 1);
		grid.getChildren().addAll(empnok,bnok);
		Scene scene = new Scene (grid, 400,400);
		fenetrefail.setScene(scene);
		fenetrefail.setTitle("fail");
		fenetrefail.show();
		bnok.setOnAction(e -> {fenetrefail.close();});
	}
}
