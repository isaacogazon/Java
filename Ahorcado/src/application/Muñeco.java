package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Muñeco extends Canvas{
	ModeloAhorcado m;
	VistaAhorcado v;
	
	public Muñeco(int fallos) {
		fallos = m.fallos;
		
		switch (fallos) {
		case 1:
			if (fallos == 1) {
				GraphicsContext gc = v.getMuñeco().getGraphicsContext2D();
				gc.fillRect(20, 20, 100, 100);

			}
			break;
		case 2:
			if (fallos == 2) {

			}
			break;
		case 3:
			if (fallos == 3) {

			}
			break;
		case 4:
			if (fallos == 4) {

			}
			break;
		case 5:
			if (fallos == 5) {

			}
			break;
		case 6:
			if (fallos == 6) {

			}
			break;
		case 7:
			if (fallos == 7) {

			}
			break;

		default:
			break;
		}
	}

}
