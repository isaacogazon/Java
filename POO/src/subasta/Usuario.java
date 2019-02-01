package subasta;

import java.util.ArrayList;

import banco.BankAccount;

public class Usuario {
	private String nombre;
	private int credito;
	ArrayList<Subasta> productos = new ArrayList<Subasta>();

	public Usuario() {
		this.nombre = "Anonimo";
	}

	public Usuario(String n, int c) {
		this.nombre = n;
		this.credito = c;
	}

	public void add(int n) {
		this.credito += n;
	}

	public void remove(int n) {
		this.credito -= n;
	}

	public String toString() {
		return "El usuario " + this.nombre + " tiene " + this.credito + "€.";
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public String getNombre() {
		return nombre;
	}

	public void addSubasta(Subasta s) {
		productos.add(s);
	}

	public ArrayList<Subasta> getProductos() {
		return productos;
	}

	public Subasta getSubasta(String n) {
		for (int i = 0; i < productos.size(); i++) {
			if (n.equals(productos.get(i).getProducto()))
				return productos.get(i);
		}
		return null;
	}

	public boolean isPropietario(String p) {
		for (int i = 0; i < productos.size(); i++) {
			if (p.equals(productos.get(i).getProducto()))
				return true;
		}

		return false;

	}
}
