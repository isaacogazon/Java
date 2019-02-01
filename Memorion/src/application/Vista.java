package application;

import java.util.ArrayList;
import java.util.Collections;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Vista extends BorderPane {

	ImagenCarta imagenes = new ImagenCarta();
	ArrayList<Carta> array = imagenes.getCartas();
	Label memo = new Label("Memorion");
	GridPane root = new GridPane();
	Button barajar = new Button("Barajar cartas");
	GridPane prueba=new GridPane();

	public Vista() {

		int f = 0;
		int c = 0;
		for (int i = 0; i < array.size(); i++) {
			Label l = array.get(i);
			root.add(l, c++, f);
			if (c == 4) {
				c = 0;
				f++;
			}
		}
		
		root.setHgap(10);
		root.setVgap(10);
		
		this.setTop(memo);
		this.setCenter(root);
		this.setBottom(barajar);
		

	}

	public ArrayList<Carta> getArray() {
		return array;
	}

	public ImagenCarta getImagenes() {
		return imagenes;
	}
	public Button getBarajar() {
		return barajar;
	}
	
	public void update() {
		prueba = new GridPane();
		imagenes.barajarCartas();
		int f = 0;
		int c = 0;
		for (int i = 0; i < array.size(); i++) {
			if(imagenes.cartas.get(i).isPosicion() == 1) {
				imagenes.cartas.get(i).setDisable(false);
				imagenes.cartas.get(i).turn();
			}	
			Label l = array.get(i);
			prueba.add(l, c++, f);
			if (c == 4) {
				c = 0;
				f++;
			}
		}
		prueba.setHgap(10);
		prueba.setVgap(10);
		this.setCenter(prueba);
		
	}
}
