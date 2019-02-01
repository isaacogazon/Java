package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	VistaConexion v;
	
	
	String name;
	String password;
	protected Connection conexion;
	String result;

	public Conexion() {
		this("hr", "hr", "jdbc:oracle:thin:@127.0.0.1:1521:XE", "oracle.jdbc.driver.OracleDriver");
	}

	public Conexion(String name, String password, String localhost, String database) {
		this.name = name;
		this.password = password;
		
		
		
		try {
			
			//String oracleJDBC = v.jdbc.getValue().toString();
			//String localhost = v.database.getValue().toString();
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(localhost);//prueba
			
			//String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String url = database;
			
			
			conexion = DriverManager.getConnection(url, name, password);
			result = "Sesión iniciada\n";
		} catch (Exception e) {
			result = "CREDENCIALES INVÁLIDAS\n";
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public String getResult() {
		return this.result;
	}

}
