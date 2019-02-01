package application;

public class Modelo {

	private int primero;
	private int segundo;

	public Modelo(/*String s*/) {
		this.primero = 0;
		this.segundo = 0;;
		//this.divideNumero(s);

	}
	public Modelo (int r, int i) {
		this.primero=r;
		this.segundo = i;
	}
	public Modelo(String s) {
		this.divideNumero(s);
	}

	public int getPrimero() {
		return primero;
	}

	public int getSegundo() {
		return segundo;
	}

	public void borrar() {
		this.primero = 0;
		this.segundo = 0;
	}

	public void divideNumero(String n) {
		int i;
		String primero ="";
		String segundo = "";
		for (i = 0; n.charAt(i) != '+'; i++) {
			primero += n.charAt(i);
		}
        this.primero = Integer.parseInt(primero);
		i++;
		for (; i < n.length() - 1; i++) {
			segundo += n.charAt(i);
		}
		this.segundo = Integer.parseInt(segundo);
	}

	public Modelo sumar(Modelo n2) {
		Modelo r = new Modelo(this.getPrimero()+n2.getPrimero(), this.getSegundo()+n2.getSegundo());
		return r;
	}

	
	public Modelo restar(Modelo n2) {
		Modelo r = new Modelo(this.getPrimero()-n2.getPrimero(), this.getSegundo()-n2.getSegundo());
		return r;
	}

	
	public Modelo multiplica(Modelo n2) {
		
		Modelo r = new Modelo((this.getPrimero()*n2.getPrimero() - this.getSegundo() * n2.getSegundo()) , (this.getPrimero()*n2.getSegundo() + this.getSegundo()*n2.getPrimero()));
		return r;
	}
	public String toString () {
		return primero+"+"+segundo+"i";
	}

}
