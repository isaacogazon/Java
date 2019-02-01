package examenEj1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	VistaConexion vista;

	String name;
	String password;
	protected Connection conexion;
	String resultado;
	String url;
	String driver;

	public Conexion() {
		this("hr", "hr");
	}

	public Conexion(String nombre, String contraseña) {
		this.url = (String) vista.getDatabase().getValue();
		this.driver = (String) vista.getJdbc().getValue();
		
		
		this.name = nombre;
		this.password = contraseña;
		//driver = "oracle.jdbc.driver.OracleDriver";
		//url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		
		try {
			Class.forName(this.driver);
			conexion = DriverManager.getConnection(this.url, nombre, contraseña);
			resultado = "conected to "+this.url+"\n";
		} catch (Exception e) {
			resultado = "No connection.\n";
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public String getResult() {
		return this.resultado;
	}
}