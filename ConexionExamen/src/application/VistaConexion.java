 package application;

import java.sql.SQLException;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaConexion extends GridPane {

	Label nombreLabel = new Label("Nombre: ");
	TextField nombreCampo = new TextField("");
	Label passLabel = new Label("Contraseña: ");
	TextField passCampo = new TextField("");
	Label logLabel = new Label("");
	Button enviar = new Button("Enviar");

	Label primero = new Label("JDBC Driver");
	Label segundo = new Label("Database URL");

	ComboBox jdbc = new ComboBox();
	ComboBox database = new ComboBox();

	public VistaConexion() throws SQLException {

		setVgap(4);
		setHgap(10);
		setPadding(new Insets(5, 5, 5, 5));

		this.jdbc.getItems().addAll("oracle.jdbc.driver.OracleDriver");

		this.database.getItems().addAll("jdbc:oracle:thin:@127.0.0.1:1521:XE");

		add(primero, 0, 0);
		add(jdbc, 1, 0);
		add(segundo, 0, 1);
		add(database, 1, 1);

		add(nombreLabel, 0, 2);
		add(nombreCampo, 0, 3);
		add(passLabel, 0, 4);
		add(passCampo, 0, 5);
		add(enviar, 0, 6);
		add(logLabel, 0, 7);

		logLabel.setVisible(false);

		logLabel.setTextFill(Color.RED);
	}

	// GET's & SET's

	public Label getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(Label nombreLabel) {
		this.nombreLabel = nombreLabel;
	}

	public TextField getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(TextField nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public Label getPassLabel() {
		return passLabel;
	}

	public void setPassLabel(Label passLabel) {
		this.passLabel = passLabel;
	}

	public TextField getPassCampo() {
		return passCampo;
	}

	public void setPassCampo(TextField passCampo) {
		this.passCampo = passCampo;
	}

	public Label getLogLabel() {
		return logLabel;
	}

	public void setLogLabel(Label logLabel) {
		this.logLabel = logLabel;
	}

	public Button getEnviar() {
		return enviar;
	}

	public void setEnviar(Button enviar) {
		this.enviar = enviar;
	}
}
