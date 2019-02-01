import java.util.Scanner;

public class IncreIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el precio sin IVA: ");
		Scanner teclado = new Scanner(System.in);
		double precio =  teclado.nextDouble();
		double preciofin = precio + precio*0.21;
		preciofin = (int) ((preciofin * 100)) / 100.0;
		System.out.println("El precio con IVA es " + (preciofin));
	}

}
