package database;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class VistaDatos extends BorderPane {
	GridPane root = new GridPane();
	Label titulo = new Label("Control horario del personal");
	Label n = new Label("Nombre");
	TextField name = new TextField();
	Label d = new Label("DNI");
	TextField dni = new TextField();
	Label e = new Label("Edad");
	TextField edad = new TextField();
	HBox hbBtn = new HBox(10);
	Button btn1 = new Button("Entrar");
	Button btn2 = new Button("Salir");
	
	public VistaDatos() {
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		root.add (titulo, 0, 0, 3, 1);
		root.add(n, 0, 1);
		root.add(name, 1, 1);
		root.add(d, 0, 2);
		root.add(dni, 1, 2);
		root.add(e, 0, 3);
		root.add(edad, 1, 3);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn1);
		hbBtn.setSpacing(10);
		hbBtn.getChildren().add(btn2);
		root.add(hbBtn, 1, 4);
		this.setCenter(root);
	}
	
	public TextField getName() {
		return name;
	}
	
	public TextField getDni() {
		return dni;
	}
	
	public TextField getEdad() {
		return edad;
	}

	public Button getBtn1() {
		return btn1;
	}
	
	public Button getBtn2() {
		return btn2;
	}
}
