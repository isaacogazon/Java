package baseDeDatos;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class testConnection {

	public static void main(String[] args) {
		OracleDB baseDatos = new OracleDB();
		baseDatos.conectar("hr", "hr");
		if (baseDatos.isConnected()) {
			JOptionPane.showMessageDialog(null, baseDatos.getUser() + " conectado.");
			try {
				Statement stm = baseDatos.getConnection().createStatement();
				ResultSet ru = stm.executeQuery("Select * from usuario");
				while (ru.next()) {
					System.out.println("Correo: "+ ru.getString(1) + ", Contraseña: " + ru.getString(2) + ", Usuario: " + ru.getString(3));
				}
			} catch (Exception e) {
				System.out.println("No hay datos.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Imposible conectar.");
		}
	}
}
