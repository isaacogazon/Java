package application;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Controlador {

	Vista vista;
	Modelo m;

	public Controlador(Vista vista, Modelo m) {
		this.vista = vista;
		this.m = m;
		vista.getCalcular().setOnAction(new Manejador());

	}

	class Manejador implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub

			String numero = m.cambiar((String) vista.getIzquierda().getValue(), (String) vista.getDerecha().getValue(),
					vista.getPantallaIz().getText());
			vista.getPantallaDe().setText(numero);

		}

	}

}
