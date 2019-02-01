package curso;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> persona = new ArrayList<Persona>();
		Scanner teclado = new Scanner(System.in);

		int op = 0;
		do {
			op = menu();

			switch (op) {
			case 1:
				menuP();
				int o = teclado.nextInt();
				if (o == 1) {
					System.out.println("Introduce el nombre del estudiante:");
					String nom = teclado.next();
					System.out.println("Introduce el correo de " + nom + ":");
					String cor = teclado.next();
					System.out.println("A que curso pertenece " + nom + ":");
					String cur = teclado.next();
					Estudiante e = new Estudiante(nom, cor, cur);
					persona.add(e);
				} else {
					System.out.println("Introduce el nombre del profesor:");
					String nom = teclado.next();
					System.out.println("Introduce el correo de " + nom + ":");
					String cor = teclado.next();
					System.out.println("Introduce el curso al que " + nom + " imparte clases:");
					String cur = teclado.next();
					System.out.println("Introduce los años que lleva impartiendo clases " + nom + ":");
					int anios = teclado.nextInt();
					Profesor p = new Profesor(nom, cor, cur, anios);
					persona.add(p);
				}
				break;
			case 2:
				System.out.println("Los profesores registrados en el sistema son:");
				for (int i = 0; i < persona.size(); i++) {
					if (persona.get(i).es == true)
						System.out.println(persona.get(i).toString());
				}
				break;
			case 3:
				System.out.println("Los alumnos registrados en el sistema son:");
				for (int i = 0; i < persona.size(); i++) {
					if (persona.get(i).es == false)
						System.out.println(persona.get(i).toString());
				}
				break;
			case 4:
				for (int i = 0; i < persona.size(); i++) {
					if (persona.get(i).es == false) {
						System.out.println(
								"==============CALIFICACIONES============== Alumno: " + persona.get(i).getNombre());
						Estudiante e = (Estudiante) persona.get(i);
						for (int j = 0; j < 3; j++) {
							System.out.println("Introduce las notas de " + e.getNombre() + " del trimestre " + (j + 1)
									+ " del curso de " + e.getCurso() + ".");
							double nota = teclado.nextDouble();
							e.notas.add(nota);
						}
					}
				}
				break;
			case 5:
				for (int i = 0; i < persona.size(); i++) {
					if (persona.get(i).es == false) {
						System.out.println("==============MEDIAS==============");
						Estudiante e = (Estudiante) persona.get(i);
						System.out.println("El alumno " + e.getNombre() + " tiene unas notas de:");
						for (int j = 0; j < e.notas.size(); j++) {
							System.out.print(e.notas.get(j) + " ");
						}
						System.out.println("Su media es: " + e.mediaNotas());
						System.out.println();
					}
				}
				break;
			case 6:
				Profesor mayor = new Profesor(null, null, null, 0);
				for (int i = 0; i < persona.size(); i++) {
					if (persona.get(i).es == true) {
						Profesor p = (Profesor) persona.get(i);
						if (p.getAnioser() > mayor.getAnioser()) {
							mayor = p;
						}
					}
				}
				System.out.println(mayor.toString());
				break;
			case 7:
				Estudiante p = new Estudiante(null, null, null);
				Estudiante s = new Estudiante(null, null, null);
				System.out.println("Introduce el nombre del primer estudiante:");
				String primero = teclado.next();
				for (int i = 0; i < persona.size(); i++) {
					if(primero.equals(persona.get(i).getNombre())) {
						p = (Estudiante) persona.get(i);
					}
				}
				System.out.println("Introduce el nombre del segundo estudiante:");
				String segundo = teclado.next();
				for (int i = 0; i < persona.size(); i++) {
					if(segundo.equals(persona.get(i).getNombre())) {
						s = (Estudiante) persona.get(i);
					}
				}
				if(p.compareTo(s) == 1)
					System.out.println("El alumno con mayor nota media es "+p.toString());
				else if(p.compareTo(s) == 0)
					System.out.println("Tienen la misma nota media.");
				else System.out.println("El alumno con mayor nota media es " + s.toString());

				break;
			case 8:
				Profesor p1 = new Profesor(null, null, null,0);
				Profesor s1 = new Profesor(null, null, null, 0);
				System.out.println("Introduce el nombre del primer profesor:");
				String primero1 = teclado.next();
				for (int i = 0; i < persona.size(); i++) {
					if(primero1.equals(persona.get(i).getNombre())) {
						p1 = (Profesor) persona.get(i);
					}
				}
				System.out.println("Introduce el nombre del segundo profesor:");
				String segundo1 = teclado.next();
				for (int i = 0; i < persona.size(); i++) {
					if(segundo1.equals(persona.get(i).getNombre())) {
						s1 = (Profesor) persona.get(i);
					}
				}
				if(p1.compareTo(s1) == 1)
					System.out.println("El profesor con mas experiencia es "+p1.toString());
				else if(p1.compareTo(s1) == 0)
					System.out.println("Tienen los mismos años de experiancia.");
				else System.out.println("El profesor con mas experiencia es " + s1.toString());
				break;
			}
		} while (op != 9);
	}

	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Crear una persona.");
		System.out.println("2-. Ver listado de profesores.");
		System.out.println("3-. Ver listado de alumnos.");
		System.out.println("4-. Poner notas a los alumnos.");
		System.out.println("5-. Ver media de los alumnos.");
		System.out.println("6-. Profesor con mas años de trabajo.");
		System.out.println("7-. Comparar la nota media de dos alumnos.");
		System.out.println("8-. Comparar años de experiencia entre dos profesores.");
		System.out.println("9-. Sal del sistema");
		int op = teclado.nextInt();
		return op;
	}

	public static void menuP() {
		System.out.println("1-. Quiero un estudiante.");
		System.out.println("2-. Quiero un profesor.");
	}
}
