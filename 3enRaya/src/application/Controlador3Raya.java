package application;

import com.sun.prism.paint.Color;

public class Controlador3Raya {

	Vista3Raya v;
	Modelo3Raya m;
	private boolean jugador = true;

	public Controlador3Raya(Vista3Raya vista, Modelo3Raya modelo) {
		this.v = vista;
		this.m = modelo;

		for (int i = 0; i < v.getArray().size(); i++) {
			int j = i;
			vista.getArray().get(i).setOnMouseClicked(e -> {
				if (this.jugador == true) {
					this.jugador = false;
					vista.getArray().get(j).setText("X");
					vista.check();
					vista.getArray().get(j).setId("azul");
				}

				else if (this.jugador == false) {
					this.jugador = true;
					vista.getArray().get(j).setText("O");
					vista.check();
					vista.getArray().get(j).setId("rojo");
				}

			});

			vista.restart.setOnMouseClicked(e -> {
				vista.restart();
			});

		}

	}

}
