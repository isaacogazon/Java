package curso;

import java.util.ArrayList;

public class Estudiante extends Persona {
	
	private String curso;
	ArrayList<Double> notas;

	public Estudiante(String nombre, String correo, String curso) {
		super(nombre, correo);
		this.curso = curso;
		this.notas = new ArrayList<Double>();
		super.es = false;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	public double mediaNotas() {
		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			suma += (double) notas.get(i);
		}
		return suma /= notas.size();
	}
	
	public int compareTo(Estudiante n) {
		if(this.mediaNotas()> n.mediaNotas())
			return 1;
		if(this.mediaNotas()==n.mediaNotas())
			return 0;
		return -1;
	}
	
	public String toString() {
		return super.toString() + " y tiene una media de " + mediaNotas()+".";
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
