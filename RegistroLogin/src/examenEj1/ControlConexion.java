package examenEj1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControlConexion extends Application {

	Conexion conexion;
	VistaConexion vista;
	String nombre;
	String contrasena;

	public void start(Stage primaryStage) throws Exception {

		vista = new VistaConexion();
		controladores();

		Scene scene = new Scene(vista, 270, 250);
		primaryStage.setTitle("Conexión");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public VistaConexion getVista() {
		return vista;
	}

	public void controladores() {
		
		

		vista.enviar.setOnAction(e -> {
			try {
				nombre = vista.getNombreCampo().getText();
				contrasena  = vista.getPassCampo().getText();
				conexion =  new Conexion(nombre, contrasena);
				
			} catch (Exception e1) {
				System.out.println("ERROR");
			}
			vista.logLabel.setText(conexion.getResult());
			vista.logLabel.setVisible(true);
			
			if(conexion.getResult().equals("conected to "+conexion.url+"\n")){
				vista.logLabel.setTextFill(Color.GREEN);
			} else {
				vista.logLabel.setTextFill(Color.RED);
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}