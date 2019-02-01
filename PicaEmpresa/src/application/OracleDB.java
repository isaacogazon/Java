package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDB {
	
	private Connection connection;
	private String user;
	protected String password;
	private boolean connected;

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public Connection getConnection() {
		return connection;
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

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

}
