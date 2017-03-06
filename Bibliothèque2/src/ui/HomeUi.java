package ui;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import metier.BiblioException;

public class HomeUi extends Application {

	Button b1;
	Button b2;
	Label l1;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(40,10,10,10));
		grid.setVgap(40); // separation entre deux element 
		grid.setHgap(10);
		l1 = new Label();
		l1.setText("Home bibliotheque");
		l1.setFont(new Font(25));
		b1 = new Button();
		b1.setText("Emprunter");
		b2 = new Button();
		b2.setText("Retour");
		b1.setOnAction(e -> {});
		GridPane.setConstraints(l1,0,0);
		GridPane.setConstraints(b1,0,1);
		GridPane.setConstraints(b2,1,1);
		grid.getChildren().addAll(l1,b1,b2);
			// creation d'un contenant pour les differents elements
		primaryStage.setTitle("Ma Premiere Fenetre");	
			// titre de la fenetre
		grid.setAlignment(Pos.CENTER);
		b2.setAlignment(Pos.CENTER_LEFT);
		
		Scene scene = new Scene (grid,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();	
		b1.setOnAction(e -> {EmpruntUi.afficher(); });
		b2.setOnAction(e -> {try {
			RetourUi.afficher();
		} catch (BiblioException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}});
	}
		
}