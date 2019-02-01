package calculadora;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class VistaCal extends BorderPane {

	GridPane root = new GridPane();

	TextField pantalla = new TextField();
	private ArrayList<Button> botones = new ArrayList<Button>();
	private Button cero = new Button("0");
	private Button borrar = new Button("C");
	private Button result = new Button("=");
	private Button mas = new Button("+");
	private Button menos = new Button("-");
	private Button por = new Button("*");
	private Button div = new Button("/");

	public VistaCal() {

		for (int i = 1; i < 10; i++)
			botones.add(new Button(i + ""));

		// añadir botones que faltan
		botones.add(borrar);
		botones.add(cero);
		botones.add(result);
		botones.add(mas);
		botones.add(menos);
		botones.add(por);
		botones.add(div);

		// Margen vertical y horizontal de los botones:
		root.setHgap(10);
		root.setVgap(10);

		// Dar ID para modificar en el CSS
		result.setId("naranja");
		borrar.setId("naranja");
		mas.setId("azul");
		menos.setId("azul");
		por.setId("azul");
		div.setId("azul");
		pantalla.setId("pantalla");
		root.setId("borde");

		// Colocar los botones
		int f = 0;
		int c = 0;
		for (int i = 0; i < 12; i++) {
			root.add(botones.get(i), c, f);
			c++;
			if (c == 3) {
				f++;
				c = 0;
			}

		}
		for (int i = 12, fi = 0; i < botones.size(); i++, fi++) {
			root.add(botones.get(i), 3, fi);
		}

		// Con éste for lo que hago es hacer responsive los botones.
		for (int i = 0; i < botones.size(); i++) {
			botones.get(i).prefWidthProperty().bind(root.widthProperty());
			botones.get(i).prefHeightProperty().bind(root.heightProperty());
		}
		// colocar la pantalla en el top, y los botones que estan en el root en el medio.
		this.setCenter(root);
		this.setTop(pantalla);
	}

	public TextField getPantalla() {
		return pantalla;
	}

	public ArrayList<Button> getBotones() {
		return botones;
	}
 
	
}
