package application;



public class Modelo {

	Vista m = new Vista();

	public Modelo() {

	}
	
	public double setCircleV() {
		double i = m.c.getCenterX();
		return i+=0.1;
	}
	
	public double setCircleH() {
		double i = m.c.getCenterY();
		return i+=0.1;
	}
	public double topeH() {
		return m.marco.getWidth();
	}
	
	public double topeV() {
		return m.marco.getHeight();
	}

	
}
