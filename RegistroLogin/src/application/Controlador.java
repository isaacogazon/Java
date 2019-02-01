package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controlador {

	Vista vista;
	ExecuteDB m;

	public Controlador(Vista vista, ExecuteDB m) {
		this.vista = vista;
		this.m = m;
		vista.getLogin().setOnAction(new Loguearse());
		vista.getRegis().setOnAction(new Registrarse());

	}

	class Loguearse implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			String e = vista.getUserT().getText();
			String p = vista.getPassT().getText();
			Usuario user = m.getUser(e, p);
			if (user != null)
				vista.getWel().setText("Welcome " + user.getName());
			else
				vista.getWel().setText("Welcome no user");

		}

	}

	class Registrarse implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			String us = vista.getUserT().getText();
			String pass = vista.getPassT().getText();
			m.loguin(us, us, pass);
			Usuario user = m.getUser(us, pass);
			if (user != null)
				vista.getWel().setText("Welcome " + user.getName());
			else
				vista.getWel().setText("Welcome no user");

			m.loguin(us, us, pass);

		}

	}

}
