import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un a�o: ");
		int a�o = teclado.nextInt();
		if (a�o%400==0 || (a�o%4==0 && !(a�o%100==0)) )
				System.out.println( a�o + " es bisiesto.");
		else System.out.println("No es bisiesto");

	}

}
