package curso;

public class Profesor extends Persona {

	private int anioser;
	private String curso;
	
	public Profesor(String nombre, String correo, String curso, int anios) {
		super(nombre, correo);
		this.curso = curso;
		this.anioser = anios;
		super.es = true;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return super.toString() + " imparte la asignatura " + getCurso() + " y tiene " + getAnioser() +" años de servicio.";
	}

	public int getAnioser() {
		return anioser;
	}

	public void setAnioser(int anioser) {
		this.anioser = anioser;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int compareTo(Profesor p) {
		if(this.anioser > p.anioser)
			return 1;
		if(this.anioser == p.anioser)
		return 0;
		return -1;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
