package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vista  extends BorderPane{

	GridPane root = new GridPane();
	Label userL = new Label("User's name");
	TextField userT = new TextField("Usuario");
	Label wel = new Label("xxxx");
	Label passL = new Label("Password");
	PasswordField passT = new PasswordField();
	Button login = new Button("Log in");
	Button regis = new Button("Register");
	HBox botones = new HBox();
	

	public Vista() {
		
		this.setCenter(root);
		
		root.setHgap(10);
		root.setVgap(10);
		
		botones.getChildren().addAll(login, regis);
		botones.setSpacing(10);
		
		root.add(userL, 0, 1);
		root.add(userT, 1, 1);
		root.add(passL, 0, 2);
		root.add(passT, 1, 2);
		root.add(botones, 1, 3);
		this.setBottom(wel);
		
	}

	public TextField getUserT() {
		return userT;
	}

	public PasswordField getPassT() {
		return passT;
	}

	public Button getLogin() {
		return login;
	}
	
	public Button getRegis() {
		return regis;
	}
  public Label getWel() {
	  return wel;
  }
}
