package application;

import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class VistaAhorcado extends BorderPane {

	ModeloAhorcado m;

	HBox superior = new HBox();
	Label centro = new Label();
	Label ganaPierde = new Label();
	GridPane teclado = new GridPane();
	GridPane ocultanueva;
	Canvas muñeco = new Canvas(50,50);
	

	Button CambioPalabra = new Button("Nuevo");
	ArrayList<Button> botones = new ArrayList<Button>();
	ArrayList<Button> ocultas = new ArrayList<Button>();

	String[] s;

	public VistaAhorcado() {

		abecedario();
		creaBotones();
		superior.getChildren().add(CambioPalabra);
		superior.getChildren().add(ganaPierde);
		this.setTop(superior);
		this.setCenter(muñeco);
		this.setBottom(teclado);
		teclado.setHgap(10);
		teclado.setVgap(10);

	}

	public void setOcultas(ArrayList<Button> ocultas) {
		this.ocultas = ocultas;
	}

	public void mascara(int cant) {

		this.ocultanueva = new GridPane();
		for (int i = 0; i < cant; i++) {
			Button b = new Button();
			this.ocultas.add(b);
			this.ocultanueva.add(b, i, 0);
		}
		this.setCenter(this.ocultanueva);
	}

	public void borrarMasc() {
		this.ocultas.clear();
	}

	public ArrayList<Button> getOcultas() {
		return this.ocultas;
	}

	public void creaBotones() {
		for (int i = 0; i < s.length; i++) {
			Button b = new Button();
			b.setText(this.s[i]);
			botones.add(b);
		}
		int f = 0;
		int c = 0;
		for (int i = 0; i < botones.size(); i++) {
			teclado.add(botones.get(i), c++, f);
			if (c == 9) {
				c = 0;
				f++;
			}
		}
	}

	public ArrayList<Button> getBotones() {
		return this.botones;
	}

	public void abecedario() {
		this.s = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	}

	public void modificaLabel(boolean estado) {
		if (this.m.youLost() == estado)
			getGanaPierde().setText("Has perdido.");
		if (this.m.isWin() == estado)
			getGanaPierde().setText("HAS GANADO!!");
	}

	public Label getGanaPierde() {
		return ganaPierde;
	}

	public Button getCambioPalabra() {
		return CambioPalabra;
	}
	
	public Canvas getMuñeco() {
		return muñeco;
	}

}
