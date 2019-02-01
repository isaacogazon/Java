package application;

import java.util.Collection;
import java.util.Collections;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class Controlador {
	ImagenCarta v;
	Vista c;
	Carta carta;
	private int con;
	private Carta l;
	private Carta l1;
	PauseTransition tiempo = new PauseTransition(Duration.seconds(0.5));

	public Controlador(Vista c) {
		this.v = c.getImagenes();
		this.c = c;
		c.getBarajar().setOnAction(eb -> {
			c.update();

		});

		for (int i = 0; i < v.getCartas().size(); i++) {

			v.getCartas().get(i).setOnMouseClicked(e -> {
				if (con == 0) {
					l = (Carta) e.getSource();
					l.turn();
					con = 1;

				} else if (con == 1) {
					l1 = (Carta) e.getSource();
					if (l != l1) {
						l1.turn();
						con++;
						tiempo.play();
						tiempo.setOnFinished(e1 -> {
							con = 0;

							if (!l.getIden().equals(l1.getIden())) {
								l.turn();
								l1.turn();
							}
							if (l.getIden().equals(l1.getIden())) {
								l.setDisable(true);
								l1.setDisable(true);
							}
						});
					}
				}

			});
		}

	}

}
