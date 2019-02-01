package subasta;

import java.util.ArrayList;
import java.util.Scanner;

public class testSubasta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Usuario> usuario = new ArrayList<Usuario>();

		int op = 0;

		do {
			op = menu();

			switch (op) {
			case 1:
				System.out.println("Introduce el nombre del nuevo usuario:");
				String nombre = teclado.next();
				System.out.println("Introdice el saldo de " + nombre + ".");
				int saldo = teclado.nextInt();
				Usuario e = addUsuario(nombre, saldo);
				usuario.add(e);
				break;
			case 2:
				System.out.println("Los usuarios dados de alta son: ");
				System.out.println();
				for (int i = 0; i < usuario.size(); i++) {
					System.out.println(usuario.get(i));
				}
				System.out.println();
				break;
			case 3:
				boolean good = false;
				boolean esta = false;
				System.out.println("Introduce el nombre del usuario que va a realizar la subasta:");
				nombre = teclado.next();
				for (int i = 0; i < usuario.size(); i++) {
					if (nombre.equals(usuario.get(i).getNombre())) {
						good = true;
						esta = true;
						System.out.println("Introduce el nombre del producto que desea subastar:");
						String producto = teclado.next();
						usuario.get(i).addSubasta(new Subasta(producto));
					}

				}
				if (!esta)
					System.out.println("El usuario no está registrado.");
				if (good)
					System.out.println("Gracias por añadir un nuevo producto.");
				else
					System.out.println("Sentimos no haber podido añadir tu producto.");
				break;
			case 4:
				System.out.println("Los productos dados de alta son: ");
				System.out.println();
				for (int i = 0; i < usuario.size(); i++) {
					ArrayList<Subasta> a = usuario.get(i).getProductos();
					for (int j = 0; j < a.size(); j++) {
						System.out.println(a.get(j));
					}
				}
				System.out.println();
				break;
			case 5:
				esta = false;
				for (int i = 0; i < usuario.size(); i++) {
					ArrayList<Subasta> a = usuario.get(i).getProductos();
					for (int j = 0; j < a.size(); j++) {
						System.out.println(a.get(j));
					}
				}
				System.out.println();
				System.out.println("Identificate como usuario: ");
				String u = teclado.next();
				Usuario reg = new Usuario();
				for (int i = 0; i < usuario.size(); i++) {
					if (u.equals(usuario.get(i).getNombre())) {
						reg = usuario.get(i);
						esta = true;
					}

				}
				if (!esta) {
					System.out.println("El usuario no está registrado.");
					break;
				}
				System.out.println("Introduce el nombre del producto por el que desea pujar:");
				nombre = teclado.next();
				for (int i = 0; i < usuario.size(); i++) {
					Usuario propietario = usuario.get(i);
					if (propietario.isPropietario(nombre)) {
						if (propietario.getNombre().equals(reg.getNombre()))
							System.out.println("El propietario no puede pujar");
						else {// el propietario distinto del reg
							Subasta currentSubasta = propietario.getSubasta(nombre);
							//controlo el tiempo, y si pasa el tiempo, le ingreso al dueño el dinero de la subasta.
							if (System.currentTimeMillis() - propietario.getSubasta(nombre).getInicio() > 60000) {
								currentSubasta.setEstado(false);
								propietario.add(currentSubasta.getMayor());
							}
							op = menuPuja();
							int cant;
							if (op == 1) {
								System.out.println("Introduce la cantidad a pujar:");
								{
									cant = teclado.nextInt();
									cant += currentSubasta.getMayor();
								}
							} else
								cant = currentSubasta.getMayor() + 1;

							int result = currentSubasta.pujar(reg, cant);

							if (result == 1)
								System.out.println("Subasta cerrada");
							else if (result == 2)
								System.out.println("No tienes suficiente saldo para pujar.");
							else if (result == 3)
								System.out.println("Hay una puja por una cantidad mayor");
							else
								System.out.println("Puja resistrada");

						}
					}
				}
			}
		} while (op != 6);
	}

	public static Usuario addUsuario(String n, int c) {
		return new Usuario(n, c);
	}

	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Crear nuevo usuario.");
		System.out.println("2-. Ver listado de usuarios.");
		System.out.println("3-. Poner producto a subasta.");
		System.out.println("4-. Ver listado de productos.");
		System.out.println("5-. Puja por un producto.");
		System.out.println("6-. Sal del sistema");

		int op = teclado.nextInt();
		return op;
	}

	public static int menuPuja() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Pujar la cantidad que yo desee.");
		System.out.println("2-. Incrementar en 1€ la ultima puja.");

		int op = teclado.nextInt();
		return op;
	}

}
