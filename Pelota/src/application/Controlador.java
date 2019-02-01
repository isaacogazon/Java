package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Controlador {

	Vista vista;
	Timeline tiempo;
	double dx = 2.0;
	double dy = 3.0;
	
	/*double dx1 = 3.0;
	double dy1 = 2.0;*/

	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;

		vista.getMas().setOnMouseClicked(e -> {
			tiempo = new Timeline(new KeyFrame(Duration.millis(30), t -> {
				
				vista.getC().setTranslateX(vista.getC().getTranslateX() + this.dx);
				if (vista.getLayoutBounds().getMaxX() <= vista.getC().getBoundsInParent().getMaxX()
						|| vista.getLayoutBounds().getMinX() >= vista.getC().getBoundsInParent().getMinX())
					this.dx *= -1;
				
				vista.getC().setTranslateY(vista.getC().getTranslateY() + this.dy);
				if (vista.getLayoutBounds().getMaxY() <= vista.getC().getBoundsInParent().getMaxY()
						|| vista.getLayoutBounds().getMinY() >= vista.getC().getBoundsInParent().getMinY())
					this.dy *= -1;				
			}));
			
			

			tiempo.setCycleCount(Timeline.INDEFINITE);
			tiempo.play();
		});
      /* vista.getR().addEventHandler(MouseEvent.MOUSE_CLICKED, ev -> {
    	  // if (ev.getCode() == DOWN)
    	   vista.getR().setX(vista.getR().getX()+20);
    	   
    	   
       });*/
    	   
     
	}

}
