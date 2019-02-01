package application;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class ModeloAhorcado {
	String p;
	int fallos = 0;
	boolean win;
	char[] m;

	public ModeloAhorcado() {
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("ANTONIA");
		palabras.add("ORDENADOR");
		palabras.add("TELEFONO");
		palabras.add("AHORCADO");
		palabras.add("PORTATIL");
		palabras.add("PIZARRA");
		palabras.add("LIBRERIA");
		palabras.add("ECLIPSE");
		palabras.add("JAVA");
		palabras.add("ENTORNO");
		int j = (int) (Math.random() * 10);
		this.p = palabras.get(j);
		this.m = new char[p.length()];
		for (int i = 0; i < this.m.length; i++) {
			this.m[i] = '*';
		}
	}

	public boolean checkLetter(String s) {
		char letra = s.charAt(0);
		boolean esta = false;
		for (int i = 0; i < m.length; i++) {
			if (p.charAt(i) == letra) {
				m[i] = letra;
				esta = true;
			}

		}
		if (!esta)
			fallos++;
		return esta;
	}

	public boolean youLost() {
		if (fallos == 7)
			return true;
		return false;

	}

	public void apagarBotones(ArrayList<Button> b) {
		for (int i = 0; i < b.size(); i++) {
			b.get(i).setDisable(true);
		}
	}

	public boolean isWin() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == '*')
				return false;
		}
		return true;
	}

	public int longuitud() {
		return this.m.length;
	}

	public String getWord() {
		return p;
	}

}
