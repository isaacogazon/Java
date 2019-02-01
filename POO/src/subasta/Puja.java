package subasta;

public class Puja {
	private Usuario usuario;
	private int cant;

	public Puja(Usuario u, int c) {
		this.usuario = u;
		this.cant = c;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public int getCant() {
		return cant;
	}

	public String toString() {
		return "La puja más alta, la tiene el usuario " + this.usuario + " con la cantidad de " + this.cant + "€";
	}

}
