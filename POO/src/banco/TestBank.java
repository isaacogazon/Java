package banco;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		Bank bank = new Bank("La Palma", 200);

		int opm = 0;

		do {
			System.out.println("Welcome " + bank.getName());
			opm = menu();

			switch (opm) {
			case 1:
				System.out.println("Intro your bank account:");
				int nc = teclado.nextInt();
				myAccount(nc, bank);
				break;
			case 2:
				if (bank.addAccount()) {
					System.out.println("Account Created");
				} else {
					System.out.println("Errors. Some problem has occurred");
				}
				break;
			case 3:
				System.out.println("Introduce la cuenta a borrar:");
				int cuenta = teclado.nextInt();
				bank.removeAccount(cuenta);
				System.out.println("Cuenta " + cuenta + " borrada.");
				break;
			}

		} while (opm != 4);

	}

	public static void myAccount(int nc, Bank bank) {
		Scanner teclado = new Scanner(System.in);
		BankAccount myAccount = bank.getAccount(nc);
		if (myAccount == null)
			return;
		int op;
		do {
			System.out.println("Welcome " + bank.getName() + ": ncc:  " + myAccount.getIban());
			op = menuCuenta();

			switch (op) {
			case 1:
				System.out.println("Su numero de cuenta es: " + myAccount.getIban());
				break;
			case 2:
				System.out.println("Introduce la cantidad que desea sacar:");

				int cant = teclado.nextInt();

				if (myAccount.withdraw(cant) == 3)
					System.out.println("Gracias por su visita, su balance es: " + myAccount.getBanalance());
				else {

					if (myAccount.withdraw(cant) == 1)
						System.out.println("Imposible atenderle. Sin saldo suficiente, eres un pobre.");
				}
				break;
			case 3:
				System.out.println("Su balance es: " + myAccount.getBanalance());
				break;
			case 4:
				System.out.println("Introduce la cantidad a ingresar: ");
				int sum = teclado.nextInt();
				myAccount.fund(sum);
				break;
			case 5:
				System.out.println("Introduce la cuenta a la que desea transferir: ");
				int nc2 = teclado.nextInt();
				BankAccount c2 = bank.getAccount(nc2);
				if (c2 != null)
					System.out.println("introduce la cantidad a transferir:");
				int trans = teclado.nextInt();
				if (myAccount.transfer(c2, trans))
					System.out.println("Transferencia realizada.");
				else
					System.out.println("Sin saldo o transferencia mal realizada.");

				break;
			case 6:
				break;
			default:
				System.out.println("La opción introducida no está en el menú.");
				break;
			}

		} while (op != 6);
	}

	public static int menuCuenta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Ver número de cuenta.");
		System.out.println("2-. Sacar dinero.");
		System.out.println("3-. Ver el saldo de su cuenta.");
		System.out.println("4-. Ingresar dinero.");
		System.out.println("5-. Realizar una transferencia.");
		System.out.println("6-. Salir.");
		int op = teclado.nextInt();
		return op;
	}

	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Opera con una cuenta.");
		System.out.println("2-. Nueva cuenta.");
		System.out.println("3-. Cancelar una cuenta");
		System.out.println("4-. Sal del sistema");

		int op = teclado.nextInt();
		return op;
	}
}
