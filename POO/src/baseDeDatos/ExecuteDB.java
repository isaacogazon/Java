package baseDeDatos;

import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteDB extends OracleDB {
	Statement smt;
	
	public ExecuteDB() {
		try {
			smt = this.getConnection().createStatement();
		}
		catch(Exception e) {
			
		}
	}
	public boolean exits(String email) {
		String query = "Select count() from usuario where email= "+email;
		try {
		ResultSet result = smt.executeQuery(query);
		int count = result.getInt(1);
		if(count == 0)
			return false;
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean getUser(String email, String name) {
		String query = "Select * from usuario where email= "+email;
		try {
		ResultSet result = smt.executeQuery(query);
		if(result.getString(2).equals(password) && result.getString(1).equals(email)) {
			Usuario user = new Usuario(email, result.getString(3));
		}
		
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

}
