package application;

import java.util.ArrayList;
import javafx.scene.control.TextField;

public class Modelo {
	ArrayList<String> monedas = new ArrayList<String>();
	ArrayList<Double> valorMonedas = new ArrayList<Double>();
	Vista m = new Vista();

	public Modelo() {
		

		monedas.add("Euro");
		monedas.add("Dolar");
		monedas.add("Libra");
		monedas.add("Rupia");
		valorMonedas.add(1.0);
		valorMonedas.add(1.23658);
		valorMonedas.add(0.864967);
		valorMonedas.add(81.2122);
	}

	public String cambiar(String divisa1, String divisa2, String numero) {
		String s = null;
		double n = cambiarAEuro(divisa1, numero);

		for (int i = 0; i < valorMonedas.size(); i++) {
			if (divisa2.equals(monedas.get(i))) {
				n = n * valorMonedas.get(i);
				s = String.valueOf(n);
			}
		}
		return s;

	}

	public double cambiarAEuro(String divisa1, String numero) {
		double n = 0;
		for (int i = 0; i < monedas.size(); i++) {
			if (divisa1.equals(monedas.get(i))) {
				n = Double.parseDouble(numero);
				n = n / valorMonedas.get(i);
				return n;
			}

		}
		return n;
	}

}
