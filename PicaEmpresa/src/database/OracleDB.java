package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDB {

	private Connection connection;
	private String user;
	private String password;
	private boolean connected;

	public Connection getConnection() {
		return connection;
	}
	
	public void setConnection(Connection c) {
		connection = c;
	}
	
	public String getUser() {
		return user;
	}

	public boolean isConnected() {
		return connected;
	}

	public OracleDB conectar(String user, String password) {
		this.user = user;
		this.password = password;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
			connection = DriverManager.getConnection(BaseDeDatos, user, password);
			connected = true;
			return this;
		} catch (Exception e) {
			connected = false;
			return null;
		}
	}
	
	public void cerrar() {
		try {
			connection.close();
			connected = false;
		} catch (Exception e) {
			
		}
	}
}
