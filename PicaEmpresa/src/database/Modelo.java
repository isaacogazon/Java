package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelo extends OracleDB {
	Statement smt;
	PreparedStatement psmt;
	
	public Modelo() {
		this.conectar("hr", "hr");
		try {
			smt = this.getConnection().createStatement();
		}
		catch (Exception e) {
			
		}
	}

	public boolean exits(String code) {
		String query = "Select * from usuario where codigo = ?";
		try {
			psmt = this.getConnection().prepareStatement(query);
			psmt.setString(1, code);
			ResultSet result = psmt.executeQuery();
			if (result.next())
				return true;
			else
				return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean newFecha(String code) {
		String query = "Insert into control (codigo) values (?)";
		try {
			psmt = this.getConnection().prepareStatement(query);
			psmt.setString(1, code);
			psmt.executeUpdate();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public Usuario getUser(String code) {
		String query = "Select * from usuario where codigo = ?";
		try {
			psmt = this.getConnection().prepareStatement(query);
			psmt.setString(1, code);
			
			ResultSet result = psmt.executeQuery();
			if (result.next()) {
				if  (result.getString(1).equals(code)) {
					Usuario user = new Usuario (code, result.getString(2),result.getString(3),result.getString(4));
					return user;
				}
			}
			return null;
		}
		catch (Exception e) {
			return null;
		}
	}
}
