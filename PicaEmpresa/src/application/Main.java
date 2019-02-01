package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VistaDatos datos = new VistaDatos();
			Vista panel = new Vista();
			ExecuteDB m = new ExecuteDB();
			m.conectar("hr", "hr");
			Controlador c = new Controlador(panel,m);
			Scene scene = new Scene(panel,280,120);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Welcome");
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
