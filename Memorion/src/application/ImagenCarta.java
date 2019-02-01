package application;

import java.util.ArrayList;
import java.util.Collections;

public class ImagenCarta {
	Carta c;

	ArrayList<Carta> cartas = new ArrayList<Carta>();

	public ImagenCarta() {

		for (int i = 0; i < 8; i++) {
			String num = String.valueOf(i + 1);
			this.c = new Carta(num);
			cartas.add(c);
		}
		for (int i = 0; i < 8; i++) {
			String num = String.valueOf(i + 1);
			this.c = new Carta(num);
			cartas.add(c);
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void barajarCartas() {
		Collections.shuffle(this.cartas);

	}

}
