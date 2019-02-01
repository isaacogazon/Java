package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ExecuteDB extends OracleDB{
	
	Statement smt;
	PreparedStatement pstm;

	public ExecuteDB() {
		try {
			smt = this.getConnection().createStatement();
		} catch (Exception e) {

		}
	}

	public boolean exits(String email) {
		String query = "Select count() from usuario where email= ? ";// +email;

		try {
			pstm = this.getConnection().prepareStatement(query);

			pstm.setString(1, email);

			pstm.executeQuery();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Usuario getUser(String email, String pw) {
		Usuario user = null;
		String query = "Select * from usuario where email=? and password =? ";// + email;
		try {
			pstm = this.getConnection().prepareStatement(query);

			pstm.setString(1, email);
			pstm.setString(2, pw);
			// execute insert SQL stetement
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				user = new Usuario(rs.getString(1),rs.getString(3));
				return user;
			}
			else 
				return null;
			
		} catch (Exception e) {
			return null;
		}
		
	}

	public void loguin(String email, String nombre, String password) {

		String query = "INSERT INTO usuario (email, password, name) VALUES (?,?,?)";
       
		try {
			pstm = this.getConnection().prepareStatement(query);

			pstm.setString(1, email);
			pstm.setString(2, nombre);
			pstm.setString(3, password);

			pstm.executeUpdate();
			
		} catch (Exception e) {
			
		}
		try {
			ResultSet result = smt.executeQuery(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void conextion() {
		OracleDB baseDatos = new OracleDB();
		baseDatos.conectar("hr", "hr");
		if (baseDatos.isConnected()) {
			JOptionPane.showMessageDialog(null, baseDatos.getUser() + " conectado.");
			try {
				Statement stm = baseDatos.getConnection().createStatement();
				ResultSet ru = stm.executeQuery("Select * from usuario");
				while (ru.next()) {
					System.out.println("Correo: " + ru.getString(1) + ", Contraseña: " + ru.getString(2) + ", Usuario: "
							+ ru.getString(3));
				}
			} catch (Exception e) {
				System.out.println("No hay datos.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Imposible conectar.");
		}
	}


}
