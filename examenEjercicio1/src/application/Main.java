package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VistaEj2 vista = new VistaEj2();
			ModeloEj2 m=new ModeloEj2();
			ControladorEj2 c = new ControladorEj2(vista,m);
			Scene scene = new Scene(vista, 350, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
