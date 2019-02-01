package database;

public class Controlador {
	EligeVista view;
	Modelo m;
	Usuario user;

	public Controlador(EligeVista v, Modelo m) {
		this.view = v;
		this.m = m;

		v.getPrimero().getBtn().setOnAction(e -> {
			if (m.exits(v.getPrimero().getUser().getText())) {
				user = m.getUser(v.getPrimero().getUser().getText());
				v.cambiar(2);
				v.getSegundo().getName().setText(user.getName());
				v.getSegundo().getDni().setText(user.getDni());
				v.getSegundo().getEdad().setText(user.getEdad());
			} else
				v.getPrimero().getUser().setText("");
			v.getPrimero().error.setText("No existe ese usuario.");
		});

		v.getSegundo().getBtn1().setOnAction(e -> {
			v.getPrimero().error.setText("");
			m.newFecha(user.getCode());
			v.cambiar(1);
			v.getPrimero().getUser().setText("");
		});

		v.getSegundo().getBtn2().setOnAction(e -> {
			v.getPrimero().error.setText("");
			m.newFecha(user.getCode());
			v.cambiar(1);
			v.getPrimero().getUser().setText("");
		});
	}
}