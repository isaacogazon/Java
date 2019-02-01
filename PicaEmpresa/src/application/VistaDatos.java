package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class VistaDatos extends BorderPane{
	
	GridPane root = new GridPane();
	
	Label titulo = new Label("Control horario Personal");
	Label fecha = new Label("Fecha");
	Label nombre = new Label("Nombre");
	Label correo = new Label("Correo");
	Label id = new Label("ID");
	
	TextField cajafecha = new TextField();
	TextField cajanombre = new TextField();
	TextField cajacorreo = new TextField();
	TextField cajaid = new TextField();
	
	Button entrar = new Button("Entrar");
	Button salir = new Button("Salir");
	
	public VistaDatos() {
		
		this.setTop(titulo);
		
		root.add(nombre, 0, 0);
		root.add(cajanombre, 1, 0);
		root.add(correo, 2, 0);
		root.add(cajacorreo, 3, 0);
		root.add(fecha, 0, 1);
		root.add(cajafecha, 1, 1);
		root.add(id, 2, 1);
		root.add(cajaid, 3, 1);
		root.add(entrar, 2, 2);
		root.add(salir, 3, 2);
		
		this.setCenter(root);
		
		
		
	}

}
