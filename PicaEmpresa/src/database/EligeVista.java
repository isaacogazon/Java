package database;

import javafx.scene.layout.BorderPane;

public class EligeVista extends BorderPane{
	VistaPrincipal primero = new VistaPrincipal();
	VistaDatos segundo = new VistaDatos();
	
	public EligeVista() {
		this.setCenter(primero);
	}
	
	public void cambiar(int n) {
		switch(n) {
		case 1: this.setCenter(primero);
				break;
		case 2: this.setCenter(segundo);
				break;
		}		
	}
	
	public VistaPrincipal getPrimero() {
		return primero;
	}

	public VistaDatos getSegundo() {
		return segundo;
	}
}