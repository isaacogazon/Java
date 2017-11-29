import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un año: ");
		int año = teclado.nextInt();
		if (año%400==0 || (año%4==0 && !(año%100==0)) )
				System.out.println( año + " es bisiesto.");
		else System.out.println("No es bisiesto");

	}

}
