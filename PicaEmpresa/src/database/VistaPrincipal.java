package database;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class VistaPrincipal extends BorderPane {
	GridPane root = new GridPane();
	Label titulo = new Label("Bienvenido a nuestra empresa");
	Label u = new Label("Usuario");
	PasswordField user = new PasswordField();
	Label error = new Label("");
	Button btn = new Button("Aceptar");

	public VistaPrincipal() {
		
		error.setId("error");
		
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		root.add(titulo, 0, 0, 3, 1);
		root.add(u, 1, 1);
		root.add(user, 2, 1);
		root.add(btn, 3, 1);
		root.add(error, 1, 3, 3, 1);
		this.setCenter(root);
	}

	public PasswordField getUser() {
		return user;
	}

	public Button getBtn() {
		return btn;
	}

}