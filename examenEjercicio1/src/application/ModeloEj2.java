package application;

public class ModeloEj2 {

	private String primero;
	private String segundo;

	public ModeloEj2() {
		/*this.primero = "";
		this.segundo = "";*/

	}

	public String getPrimero() {
		return primero;
	}

	public String getSegundo() {
		return segundo;
	}

	public void divideNumero(String n) {
		int i;
		for (i = 0; i < n.length(); i++) {
			this.primero += n.charAt(i);
		}

		i++;
		for (; i < n.length() - 1; i++) {
			this.segundo += n.charAt(i);
		}
	}

}
