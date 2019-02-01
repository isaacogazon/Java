package calculadora;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application {
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub

		// Creo la nueva vista:
		VistaCal panel = new VistaCal();
		Modelo m = null;
        Controlador c = new Controlador(panel,m);
		// Tamaño de la escena y vista
		Scene scene = new Scene(panel, 340, 305);
		primaryStage.setTitle("Isaac Ogazón");
		primaryStage.setScene(scene);
		primaryStage.show();

		// Importar el archivo CSS
		File f = new File("C:\\DAW\\Programacion\\Programas\\FX\\src\\calculadora\\stilo.css");
		scene.getStylesheets().clear();
		scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
