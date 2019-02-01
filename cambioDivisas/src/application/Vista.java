package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Vista extends BorderPane {

	GridPane root = new GridPane();

	TextField pantallaIz = new TextField();
	TextField pantallaDe = new TextField();

	ComboBox izquierda = new ComboBox();
	ComboBox derecha = new ComboBox();

	Button calcular = new Button("Convertir");

	public Vista() {
		this.izquierda.getItems().addAll("Euro", "Dolar", "Libra", "Rupia");
		this.derecha.getItems().addAll("Euro", "Dolar", "Libra", "Rupia");

		root.setHgap(10);
		root.setVgap(10);

		// colocar en el gridpane
		root.add(pantallaIz, 0, 0);
		root.add(pantallaDe, 1, 0);
		root.add(izquierda, 0, 1);
		root.add(derecha, 1, 1);

		// responsive
		pantallaIz.prefWidthProperty().bind(root.widthProperty());
		pantallaIz.prefHeightProperty().bind(root.heightProperty());
		pantallaDe.prefWidthProperty().bind(root.widthProperty());
		pantallaDe.prefHeightProperty().bind(root.heightProperty());
		izquierda.prefWidthProperty().bind(root.widthProperty());
		izquierda.prefHeightProperty().bind(root.heightProperty());
		derecha.prefWidthProperty().bind(root.widthProperty());
		derecha.prefHeightProperty().bind(root.heightProperty());

		this.setCenter(root);
		this.setBottom(calcular);
	}

	public TextField getPantallaIz() {
		return pantallaIz;
	}

	public void setPantallaIz(TextField pantallaIz) {
		this.pantallaIz = pantallaIz;
	}

	public void setPantallaDe(TextField pantallaDe) {
		this.pantallaDe = pantallaDe;
	}

	public ComboBox getIzquierda() {
		return izquierda;
	}

	public TextField getPantallaDe() {
		return pantallaDe;
	}

	public ComboBox getDerecha() {
		return derecha;
	}

	public Button getCalcular() {
		return calcular;
	}

}
