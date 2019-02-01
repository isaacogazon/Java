package application;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Vista extends BorderPane {

	Main m;
	HBox marco = new HBox();
	Circle c = new Circle(20, Color.web("red", 0.8));
	Circle c1 = new Circle(20, Color.web("blue", 0.8));
	Button mas = new Button("Más velocidad");
	//Line l1 = new Line(0, 0, 0, 70);
	//Rectangle r = new Rectangle (2,2,25,50);

	/*public Rectangle getR() {
		return r;
	}*/


	public Vista() {

		marco.setId("marco");
		//l1.setScaleX(6);
		//l1.setTranslateY(marco.getMaxWidth());
		//marco.getChildren().add(r);
		marco.getChildren().add(c);
		//marco.getChildren().add(c1);
		
		this.setCenter(marco);
		this.setBottom(mas);

	}


	public Circle getC1() {
		return c1;
	}


	public Button getMas() {
		return mas;
	}


	public Circle getC() {
		return c;
	}

}
