package curso;

import java.util.ArrayList;

public class Contiene {
	private ArrayList<Persona> persona = new ArrayList<Persona>();
	
	public Contiene(){
		this.persona = new ArrayList<Persona>();
	}
	
	public boolean contain(Persona p) {
		for (int i = 0; i < persona.size(); i++) {
			if(persona.get(i).equals(p))
				return true;
		}return false;
	}
	
	public boolean isEmpty() {
		if(this.persona.size() == 0)
			return true;
		return false;
	}
	
	public void addElement(Persona p) {
		for (int i = 0; i < persona.size(); i++) {
			if(!persona.get(i).equals(p))
				this.persona.add(p);	
		}
	}
	
	public ArrayList<Persona> union(ArrayList<Persona> p) {
			ArrayList<Persona> nuevo = new ArrayList<Persona>();
			//nuevo = this.persona;
			for (int i = 0; i < p.size(); i++) {
				nuevo.add(p.get(i));
			}
			for (int i = 0; i < nuevo.size(); i++) {
				for (int j = 0; j < nuevo.size(); j++) {
					if(nuevo.get(i).equals(nuevo.get(j)))
						nuevo.remove(nuevo.get(j));
				}
			}
			return nuevo;
	}
	
	public ArrayList<Persona> intersection(ArrayList<Persona> p) {
		ArrayList<Persona> nuevo = new ArrayList<Persona>();
		for (int i = 0; i < this.persona.size(); i++) {
			for (int j = 0; j < p.size(); j++) {
				if(this.persona.get(i).equals(p.get(j)))
					nuevo.add(p.get(j));
			}
		}
		return nuevo;
	}
	
	public String toString() {
		String S = "";
		for (int i = 0; i < this.persona.size(); i++) {
			S = this.persona.get(i).toString() + " ";
		}
		return S;
	}

}
