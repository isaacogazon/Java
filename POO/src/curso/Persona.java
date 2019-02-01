package curso;

public abstract class Persona implements Comparable<Persona> {
	
	private String nombre;
	private String correo;
	protected boolean es;
	
	public Persona(String nombre, String correo){
		this.nombre = nombre;
		this.correo = correo;
		this.es = true;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String toString() {
		return "El nombre es " + this.nombre + ", su correo es " + this.correo + ", ";
	}
	public boolean equals(Persona p) {
		if(this.nombre.equals(p.getNombre()))
			return true;
		return false;
	}

}
