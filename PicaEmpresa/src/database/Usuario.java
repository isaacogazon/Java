package database;

public class Usuario {
	
	String code;
	String name;
	String dni;
	String edad;
	
	public Usuario(String code, String name, String dni, String edad) {
		this.code = code;
		this.name = name;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Usuario(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getEdad() {
		return edad;
	}
}
