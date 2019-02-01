package application;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;

import com.sun.prism.paint.Color;

import javafx.animation.PauseTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class Vista3Raya extends BorderPane {

	ArrayList<Button> array = new ArrayList<Button>();
	GridPane root = new GridPane();
	Label hola = new Label("-TRES EN RAYA-");
	Label ganadorx = new Label("Gana jugador X");
	Label ganadoro = new Label("Gana jugador O");
	Button restart = new Button("NEW");

	public Vista3Raya() {
		hola.setId("hola");
		ganadorx.setId("ganax");
		ganadoro.setId("ganao");
		root.setId("root");

		int f = 0;
		int c = 0;
		for (int i = 0; i < 9; i++) {
			Button l = new Button();
			l.setPrefSize(50, 50);
			this.array.add(l);
			root.add(l, c++, f);
			if (c == 3) {
				c = 0;
				f++;
			}
		}

		root.setHgap(10);
		root.setVgap(10);

		root.add(restart, 1, 3);

		this.setTop(hola);
		this.setCenter(root);

	}

	public ArrayList<Button> getArray() {
		return this.array;
	}

	public void check() {

		if (this.array.get(0).getText().equals("X") && this.array.get(1).getText().equals("X")
				&& this.array.get(2).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();		
		}
		if (this.array.get(3).getText().equals("X") && this.array.get(4).getText().equals("X")
				&& this.array.get(5).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(6).getText().equals("X") && this.array.get(7).getText().equals("X")
				&& this.array.get(8).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(0).getText().equals("X") && this.array.get(3).getText().equals("X")
				&& this.array.get(6).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(1).getText().equals("X") && this.array.get(4).getText().equals("X")
				&& this.array.get(7).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(2).getText().equals("X") && this.array.get(5).getText().equals("X")
				&& this.array.get(8).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(0).getText().equals("X") && this.array.get(4).getText().equals("X")
				&& this.array.get(8).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}
		if (this.array.get(6).getText().equals("X") && this.array.get(4).getText().equals("X")
				&& this.array.get(2).getText().equals("X")) {
			this.setBottom(ganadorx);
			restart();
		}

		if (this.array.get(0).getText().equals("O") && this.array.get(1).getText().equals("O")
				&& this.array.get(2).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(3).getText().equals("O") && this.array.get(4).getText().equals("O")
				&& this.array.get(5).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(6).getText().equals("O") && this.array.get(7).getText().equals("O")
				&& this.array.get(8).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(0).getText().equals("O") && this.array.get(3).getText().equals("O")
				&& this.array.get(6).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(1).getText().equals("O") && this.array.get(4).getText().equals("O")
				&& this.array.get(7).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(2).getText().equals("O") && this.array.get(5).getText().equals("O")
				&& this.array.get(8).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(0).getText().equals("O") && this.array.get(4).getText().equals("O")
				&& this.array.get(8).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
		if (this.array.get(6).getText().equals("O") && this.array.get(4).getText().equals("O")
				&& this.array.get(2).getText().equals("O")) {
			this.setBottom(ganadoro);
			restart();
		}
	}

	public void restart() {
		for (int i = 0; i < this.array.size(); i++) {
			array.get(i).setText("");
		}
	}

}
