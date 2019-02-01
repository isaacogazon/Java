package application;

import java.io.File;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Carta extends Label {

	private int posicion;
	private String iden;
	private ImageView reverso;
	private ImageView anverso;

	public Carta(String i) {

		this.iden = i;
		try {
			File file = new File("imagenes/reverso.jpg");
			Image im = new Image(file.toURI().toString(), 120, 150, false, false);
			this.reverso = new ImageView(im);
			posicion = 0;

			this.setGraphic(reverso);
		} catch (Exception e) {
			// TODO: handle exception

		}

		try {
			File file = new File("imagenes/" + i + ".jpg");
			Image im = new Image(file.toURI().toString(), 120, 150, false, false);
			this.anverso = new ImageView(im);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setGraphic(reverso);
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public void turn() {
		if (this.posicion == 0) {
			this.posicion = 1;
			this.setGraphic(anverso);
		} else {
			this.posicion = 0;
			this.setGraphic(reverso);
		}

	}

	public int isPosicion() {
		return posicion;
	}

	public ImageView getReverso() {
		return reverso;
	}

	public String getIden() {
		return iden;
	}

}
