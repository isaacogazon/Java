package calculadora;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Controlador {

	VistaCal vista;
	Modelo m;

	public Controlador(VistaCal vista, Modelo m) {
		this.vista = vista;
		this.m = m;
		
		ArrayList <Button> botones = vista.getBotones();
		for (int i =0;i<botones.size();i++)
			botones.get(i).setOnAction(new Manejador());
		
	}

	class Manejador implements EventHandler <ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			Button b  =(Button) event.getSource();
			if (b.getText().equals("=")) {
				m = new Modelo(vista.getPantalla().getText());
				Double r = m.calculo();
				vista.getPantalla().setText(String.valueOf(r));    
			}
			else
				if (b.getText().equals("C"))
					vista.getPantalla().setText("");
				else {
					vista.getPantalla().setText(vista.getPantalla().getText()+b.getText());
				}
					
			
		}
		
	}

}
