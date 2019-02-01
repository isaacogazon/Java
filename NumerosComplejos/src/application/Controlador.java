package application;

public class Controlador {
	Vista vista;
	Modelo m;	
	
	public Controlador(Vista vista, Modelo m) {
		this.vista = vista;
		this.m = m;
		
		
		vista.suma.setOnMouseClicked(eb->{
			
			String t1 = vista.getPrimernum().getText();
			String t2  = vista.getSegundonum().getText();
			m.borrar();
			m.divideNumero(t1);
			Modelo c1 = new Modelo(t1);
			Modelo c2 = new Modelo(t2);
			m.borrar();
			m.divideNumero(t2);
			vista.resul.clear();
			vista.resul.setText(c1.sumar(c2).toString());			
		});
		
		vista.resta.setOnMouseClicked(eb->{
			String t1 = vista.getPrimernum().getText();
			String t2  = vista.getSegundonum().getText();
			m.borrar();
			m.divideNumero(t1);
			Modelo c1 = new Modelo(t1);
			Modelo c2 = new Modelo(t2);
			m.borrar();
			m.divideNumero(t2);
			vista.resul.clear();
			vista.resul.setText(c1.restar(c2).toString());
			
		});
		
		vista.mult.setOnMouseClicked(eb->{
			String t1 = vista.getPrimernum().getText();
			String t2  = vista.getSegundonum().getText();
			m.borrar();
			m.divideNumero(t1);
			Modelo c1 = new Modelo(t1);
			Modelo c2 = new Modelo(t2);
			m.borrar();
			m.divideNumero(t2);
			vista.resul.clear();
			vista.resul.setText(c1.multiplica(c2).toString());
			
		});
		
		
	}

}
