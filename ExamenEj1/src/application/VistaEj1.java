package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class VistaEj1 extends BorderPane{
	
	GridPane root = new GridPane();
	Label primero = new Label("Primer numero:");
	Label segundo = new Label("Segundo numero:");
	TextField primernum = new TextField();
	TextField segundonum = new TextField();
	TextField resul = new TextField();
	
	Button suma = new Button("Sumar");
	Button resta = new Button("Restar");
	Button mult = new Button("Multiplicar");
	
	public VistaEj1() {
		
		root.add(primero, 0, 0);
		root.add(primernum, 1, 0);
		root.add(segundo, 0, 1);
		root.add(segundonum, 1, 1);
		root.add(suma, 0, 2);
		root.add(resta, 0, 3);
		root.add(mult, 0, 4);
		root.add(resul, 0, 5);
		
		this.setCenter(root);
		
	}

	public TextField getResul() {
		return resul;
	}

	public TextField getPrimernum() {
		return primernum;
	}

	public TextField getSegundonum() {
		return segundonum;
	}

	public Button getSuma() {
		return suma;
	}

	public Button getResta() {
		return resta;
	}

	public Button getMult() {
		return mult;
	}

}
