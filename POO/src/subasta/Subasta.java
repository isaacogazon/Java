package subasta;

import java.util.ArrayList;

public class Subasta {

	private String producto;
	private boolean estado;
	ArrayList<Puja> puja = new ArrayList<Puja>();
	private int mayor;
	private long inicio;

	public Subasta(String nom) {
		this.producto = nom;
		this.estado = true;
		this.inicio = System.currentTimeMillis();

	}

	public int pujar(Usuario u, int c) {
		if (this.estado == false)
			return 1;
		if (u.getCredito() < c)
			return 2;
		if (c < mayor)
			return 3;
		this.mayor = c;
		u.remove(c);
		this.puja.add(new Puja(u, c));
		if (puja.size() >= 2) {
			Usuario anterior = puja.get(puja.size() - 2).getUsuario();
			anterior.add(puja.get(puja.size() - 2).getCant());
		}
		return 0;
	}

	public long getInicio() {
		return inicio;
	}

	public Puja addPuja(Usuario u, int c) {

		return new Puja(u, c);
	}

	public String estado() {
		if (this.estado == true)
			return "abierta";
		return "cerrada";
	}

	public String toString() {
		return "La subasta del producto " + this.producto + ", está " + estado() + ", y está en " + getMayor() + "€.";
	}

	public String getProducto() {
		return producto;
	}

	public ArrayList<Puja> getPuja() {
		return puja;
	}

	public int getMayor() {
		return mayor;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
