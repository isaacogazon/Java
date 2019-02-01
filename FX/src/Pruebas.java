import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Pruebas extends Application {

	@Override
	public void start(Stage primaryStage) {

		GridPane root = new GridPane();
		root.setHgap(40);
		root.setVgap(12);

		Label userL = new Label("User's name");
		TextField userT = new TextField("Usuario");

		Label passL = new Label("Password");
		PasswordField passT = new PasswordField();

		Button login = new Button("Log in");

		HBox loginP = new HBox();
		loginP.setAlignment(Pos.CENTER_RIGHT);
		loginP.getChildren().add(login);

		root.add(userL, 0, 1);
		root.add(userT, 1, 1);
		root.add(passL, 0, 2);
		root.add(passT, 1, 2);
		root.add(loginP, 1, 3);

		BorderPane panelB = new BorderPane();
		Label wel = new Label("Welcome");
		panelB.setTop(wel);
		panelB.setCenter(root);
		Scene scene = new Scene(panelB, 300, 200);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
