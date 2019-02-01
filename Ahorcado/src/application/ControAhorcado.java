package application;

import javafx.scene.canvas.GraphicsContext;

public class ControAhorcado {
	ModeloAhorcado m;
	VistaAhorcado v;
	String palabra;

	public ControAhorcado(VistaAhorcado v, ModeloAhorcado m) {
		this.m = m;
		this.v = v;
		setBotones();
		
	}

	public void setBotones() {
		for (int i = 0; i < v.getBotones().size(); i++) {
			int j = i;
			v.getBotones().get(i).setOnMouseClicked(e -> {
				String letra = v.getBotones().get(j).getText();
				if (this.m.checkLetter(letra)) {
					String p = this.m.getWord();
					for (int j2 = 0; j2 < p.length(); j2++) {
						char caracter = p.charAt(j2);
						String l = Character.toString(caracter);
						if (letra.equals(l))
							v.getOcultas().get(j2).setText(letra);

						v.getBotones().get(j).setDisable(true);
					}
				}
				if (this.m.youLost()) {
					System.out.println("Has perdido");
					m.apagarBotones(v.botones);
				} else if (this.m.isWin()) {
					System.out.println("Has ganado");
					m.apagarBotones(v.botones);
				}

			});

		}

		v.getCambioPalabra().setOnMouseClicked(e -> {
			this.m = new ModeloAhorcado();
			v.borrarMasc();
			for (int i = 0; i < this.v.getBotones().size(); i++) {
				this.v.getBotones().get(i).setDisable(false);
			}

			this.v.mascara(this.m.longuitud());

		});

	}

}
