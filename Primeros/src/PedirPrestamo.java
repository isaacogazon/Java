import java.util.Scanner;

public class PedirPrestamo {

	public static void main(String[] args) {
		
		System.out.println("Introduce el dinero que quieres: ");
		Scanner teclado = new Scanner(System.in);
		double dinerototal = teclado.nextDouble();
		System.out.println("Que interes quieres: ");
		double interes = teclado.nextDouble();
		System.out.println("En cuantos años quieres pagarlo: ");
		int años = teclado.nextInt();
		
		interes =  interes / 1200;
		
		double n1 = (dinerototal * interes);
		double d2 = 1-(1/ Math.pow(1+interes, años*12));
		double pagomensual = n1/d2;
		
		System.out.println("El pago mensual seria: " + (int) (pagomensual * 100)/100);
		System.out.println("El pago total seria: "+ (pagomensual*12)*años);
		

	}

}
