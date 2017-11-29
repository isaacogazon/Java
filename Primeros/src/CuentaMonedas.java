import java.util.Scanner;

public class CuentaMonedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad: ");
		double total = teclado.nextDouble();
		
		total = total * 100;
		int moneda2 = (int) total / 200;
		System.out.println(moneda2 + " monedas de 2€");
		double resto = total % 200;
		int moneda1 = (int) resto /100;
		System.out.println(moneda1 + " monedas de 1€");
		resto = total % 100;
		int moneda50 = (int) resto / 50;
		System.out.println(moneda50 + " monedas de 50cent");
		resto = total % 50;
		int moneda20 = (int) resto / 20;
		System.out.println(moneda20 + " monedas de 20cent");
		resto = total % 20;
		int moneda10 = (int) resto / 10;
		System.out.println(moneda10 + " monedas de 10cent");
		resto = total % 10;
		int moneda5 = (int) resto / 5;
		System.out.println(moneda5 + " monedas de 5cent");
		resto = total % 5;
		int moneda2c = (int) resto / 2;
		System.out.println(moneda2c + " monedas de 2cent");
		//El math.ceil redondea al superior.
		System.out.println((int) Math.ceil(resto % 2) + " monedas de 1cent");
		
		
		
		
	
	}

}
