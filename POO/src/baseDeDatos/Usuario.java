package baseDeDatos;

public class Usuario {
	String email;
	String name;
	
	public Usuario(String email, String name) {
		this.email = email;
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}

}
